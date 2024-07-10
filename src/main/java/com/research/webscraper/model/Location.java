package com.research.webscraper.model;

import org.springframework.data.relational.core.mapping.Column;

public class Location {
    @Column("latitude")
    private int latitude;

    @Column("longitude")
    private int longitude;

    @Column("city")
    private String city;

    @Column("postal_code")
    private int postalCode;

    @Column("country_code")
    private String countryCode;

    // Getters y setters

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}