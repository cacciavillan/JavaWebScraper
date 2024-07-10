package com.research.webscraper.controller;

import com.research.webscraper.model.Product;
import com.research.webscraper.service.WebScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/scraper")
public class WebScraperController {

    @Autowired
    private WebScraperService webScraperService;

    @GetMapping("/scrape")
    public Flux<Product> scrapeProducts() {
        String apiUrl = "https://es.wallapop.com/app/search?category_ids=24200&object_type_ids=10310&keywords=Laptop&latitude=38.9690169&longitude=-0.1851574&filters_source=quick_filters";
        return webScraperService.scrapeProducts(apiUrl);
    }
}
