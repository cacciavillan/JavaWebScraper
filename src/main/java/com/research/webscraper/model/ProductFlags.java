package com.research.webscraper.model;

public class ProductFlags {
    private boolean pending;
    private boolean sold;
    private boolean reserved;
    private boolean banned;
    private boolean expired;
    private boolean onhold;

    // Getters y setters

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isOnhold() {
        return onhold;
    }

    public void setOnhold(boolean onhold) {
        this.onhold = onhold;
    }

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