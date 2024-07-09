package com.research.webscraper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Shipping {
    @Column(name = "item_is_shippable")
    private boolean itemIsShippable;
    @Column(name = "user_allows_shipping")
    private boolean userAllowsShipping;
}
