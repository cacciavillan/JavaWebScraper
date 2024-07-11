package com.research.webscraper.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipping {

    @Column(name = "item_is_shippable")
    private boolean itemIsShippable;

    @Column(name = "user_allows_shipping")
    private boolean userAllowsShipping;

    // Getters y setters

    public boolean isItemIsShippable() {
        return itemIsShippable;
    }

    public void setItemIsShippable(boolean itemIsShippable) {
        this.itemIsShippable = itemIsShippable;
    }

    public boolean isUserAllowsShipping() {
        return userAllowsShipping;
    }

    public void setUserAllowsShipping(boolean userAllowsShipping) {
        this.userAllowsShipping = userAllowsShipping;
    }
}