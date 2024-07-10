package com.research.webscraper.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ProductUpdateDTO {
    @JsonAlias("condition.value")
    private String condition;

    private Integer views;
    private Integer favorites;
    private String brand;
    private String model;

    @JsonAlias("goodsAndFashionInfo.upToKg")
    private Integer upToKg;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

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

    public Integer getUpToKg() {
        return upToKg;
    }

    public void setUpToKg(Integer upToKg) {
        this.upToKg = upToKg;
    }
}
