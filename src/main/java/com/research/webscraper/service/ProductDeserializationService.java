package com.research.webscraper.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.SearchResponse;
import com.research.webscraper.model.Product;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductDeserializationService {

    private final ObjectMapper objectMapper;

    public ProductDeserializationService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Product> deserializeProducts(String json) throws IOException {
        SearchResponse response = objectMapper.readValue(json, SearchResponse.class);
        return response.getSearchObjects();
    }
}