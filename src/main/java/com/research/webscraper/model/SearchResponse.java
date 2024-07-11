package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponse {
    private List<Product> search_objects;

    // Getters y setters
    public List<Product> getSearchObjects() {
        return search_objects;
    }

    public void setSearchObjects(List<Product> search_objects) {
        this.search_objects = search_objects;
    }
}