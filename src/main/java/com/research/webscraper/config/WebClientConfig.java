package com.research.webscraper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://api.wallapop.com/api/v3/general/search?category_ids=24200&object_type_ids=10310&keywords=Laptop&latitude=38.9690169&longitude=-0.1851574&filters_source=quick_filters") // Ajusta esta URL según la API que estés usando
                .defaultHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                .build();
    }
}