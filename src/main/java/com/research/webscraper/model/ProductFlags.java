package com.research.webscraper.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProductFlags {
    private boolean pending;
    private boolean sold;
    private boolean reserved;
    private boolean banned;
    private boolean expired;
    private boolean onhold;

    // Getters y setters
    // ...

    public String getActiveFlag() {
        if (pending) return "PENDING";
        if (sold) return "SOLD";
        if (reserved) return "RESERVED";
        if (banned) return "BANNED";
        if (expired) return "EXPIRED";
        if (onhold) return "ONHOLD";
        return null;
    }
}
