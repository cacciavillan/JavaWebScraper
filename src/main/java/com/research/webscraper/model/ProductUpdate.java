package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductUpdate {
    @JsonProperty("views")
    @Column(name = "views")
    private Integer views; // Total amount of product views

    @JsonProperty("favorites")
    @Column(name = "favorites")
    private Integer favorites; // Total amount of product favorites

    @JsonProperty("brand")
    @Column(name = "brand")
    private String brand;

    @JsonProperty("model")
    @Column(name = "model")
    private String model;

    @JsonProperty("condition")
    @Column(name = "condition")
    private String condition;  // in_box,  as_good_as_new, good, fair, has_given_it_all

    @JsonProperty("upToKg")
    @Column(name = "upToKg")
    private Integer upToKg; // Estimated weight

    // Getters and setters


    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getUpToKg() {
        return upToKg;
    }

    public void setUpToKg(Integer upToKg) {
        this.upToKg = upToKg;
    }
}
