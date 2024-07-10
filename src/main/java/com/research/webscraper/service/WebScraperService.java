package com.research.webscraper.service;

import com.research.webscraper.model.Product;
import com.research.webscraper.dto.ProductUpdateDTO;
import com.research.webscraper.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WebScraperService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private ProductRepository productRepository;

    public Flux<Product> scrapeProducts(String apiUrl) {
        return webClient.get()
                .uri(apiUrl)
                .retrieve()
                .bodyToFlux(Product.class)
                .flatMap(productRepository::save)
                .flatMap(this::updateProductDetails);
    }

    private Mono<Product> updateProductDetails(Product product) {
        return webClient.get()
                .uri(product.getWebSlug())
                .retrieve()
                .bodyToMono(ProductUpdateDTO.class)
                .flatMap(updateDTO -> {
                    if (updateDTO.getViews() != null) product.setViews(updateDTO.getViews());
                    if (updateDTO.getFavorites() != null) product.setFavorites(updateDTO.getFavorites());
                    if (updateDTO.getBrand() != null) product.setBrand(updateDTO.getBrand());
                    if (updateDTO.getModel() != null) product.setModel(updateDTO.getModel());
                    if (updateDTO.getCondition() != null) product.setCondition(updateDTO.getCondition());
                    if (updateDTO.getUpToKg() != null) product.setUpToKg(updateDTO.getUpToKg());
                    product.setDetailsEnriched(true);
                    return productRepository.save(product);
                });
    }
}