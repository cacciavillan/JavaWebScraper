package com.research.webscraper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Location {
    @Column(name = "latitude")
    private int latitude;
    @Column(name = "longitude")
    private int longitude;
    @Column(name = "city")
    private String city;
    @Column(name = "postal_code")
    private int postalCode;
    @Column(name = "country_code")
    private String countryCode;
}
