package com.research.webscraper.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductFlags {

    @Column(name = "pending")
    private boolean pending;
    @Column(name = "sold")
    private boolean sold;
    @Column(name = "reserved")
    private boolean reserved;
    @Column(name = "banned")
    private boolean banned;
    @Column(name = "expired")
    private boolean expired;
    @Column(name = "onhold")
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