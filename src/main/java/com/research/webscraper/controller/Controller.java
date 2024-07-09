package com.research.webscraper.controller;

import com.research.webscraper.model.Product;
import com.research.webscraper.service.ProductService;
import com.research.webscraper.util.OpenVPNManager;
import com.research.webscraper.util.Parser;
import com.research.webscraper.util.Scraper;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class Controller {
    private final Scraper scraper;
    private final Parser parser;
    private final ProductService productService;
    private final OpenVPNManager vpnManager;

    @Autowired
    public Controller(Scraper scraper, Parser parser, ProductService productService, OpenVPNManager vpnManager) {
        this.scraper = scraper;
        this.parser = parser;
        this.productService = productService;
        this.vpnManager = vpnManager;
    }

    @PostMapping("/process")
    public void processProductList(@RequestBody String jsonInput) {
        List<String> productJsons = scraper.scrapeProductsFromJson(jsonInput);
        for (String productJson : productJsons) {
            Product product = parser.parseProduct(productJson);
            productService.saveProduct(product);
        }
    }

    @PostMapping("/enrich/{productId}")
    public void enrichProductDetails(@PathVariable String productId) {
        Product product = productService.getProduct(UUID.fromString(productId));
        String detailsJson = scraper.scrapeProductDetails(productId);
        Product enrichedProduct = parser.parseProductDetails(product, detailsJson);
        productService.updateProduct(enrichedProduct);
    }
}