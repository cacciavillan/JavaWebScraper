package com.research.webscraper.service;

import com.research.webscraper.model.Product;
import com.research.webscraper.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProduct(UUID uuid) {
        return productRepository.findById(uuid).orElse(null);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }
}