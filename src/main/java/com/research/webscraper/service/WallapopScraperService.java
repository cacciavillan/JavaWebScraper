package com.research.webscraper.service;

import com.research.webscraper.model.Product;
import com.research.webscraper.repository.ProductRepository;
import com.research.webscraper.http.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class WallapopScraperService {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;
    private final ProductRepository productRepository;

    @Autowired
    public WallapopScraperService(HttpClient httpClient, ObjectMapper objectMapper, ProductRepository productRepository) {
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
        this.productRepository = productRepository;
    }

    @Transactional
    public List<Product> scrapeProducts(String keyword) {
        String url = buildSearchUrl(keyword);
        String jsonResponse = httpClient.get(url);
        return parseAndSaveProducts(jsonResponse);
    }

    private String buildSearchUrl(String keyword) {
        return "https://api.wallapop.com/api/v3/general/search?keywords=" + keyword + "&category_ids=24200&filters_source=quick_filters&longitude=-0.185157&latitude=38.969017&order_by=newest";
    }

    private List<Product> parseAndSaveProducts(String jsonResponse) {
        try {
            JsonNode root = objectMapper.readTree(jsonResponse);
            JsonNode searchObjects = root.path("search_objects");
            List<Product> products = new ArrayList<>();

            for (JsonNode node : searchObjects) {
                Product product = objectMapper.treeToValue(node, Product.class);
                products.add(product);
            }

            return productRepository.saveAll(products);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing JSON response or saving products", e);
        }
    }
}