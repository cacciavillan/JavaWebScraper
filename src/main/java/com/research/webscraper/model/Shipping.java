package com.research.webscraper.model;

import org.springframework.data.relational.core.mapping.Column;

public class Shipping {
    @Column("item_is_shippable")
    private boolean itemIsShippable;

    @Column("user_allows_shipping")
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