package com.research.webscraper.http;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SimpleHttpClient implements HttpClient {

    private final RestTemplate restTemplate;

    public SimpleHttpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String get(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}