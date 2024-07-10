package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.research.webscraper.util.ISODate;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", updatable = false, nullable = false)
    private UUID uuid;

    @JsonProperty("id")
    @Column(name = "id")
    private String id; // Wallapop product ID

    @JsonProperty("title")
    @Column(name = "title")
    private String title;

    @JsonProperty("description")
    @Column(name = "description")
    private String description;

    @JsonProperty("distance")
    @Column(name = "distance")
    private Integer distance;

    @JsonProperty("user")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private WpUser user; // Wallapop user ID

    @JsonProperty("flags")
    @Column(name = "flags")
    private ProductFlags flags;

    @JsonProperty("price")
    @Column(name = "price")
    private double price;

    @JsonProperty("currency")
    @Column(name = "currency")
    private String currency;

    @JsonProperty("web_slug")
    @Column(name = "web_slug")
    private String webSlug; // product URL

    @JsonProperty("category_id")
    @Column(name = "category_id")
    private Integer categoryId; // Wallapop category ID

    @JsonProperty("shipping")
    @Embedded
    private Shipping shipping;

    @JsonProperty("creation_date")
    @Column(name = "creation_date")
    private ISODate creationDate;

    @JsonProperty("modification_date")
    @Column(name = "modification_date")
    private ISODate modificationDate;

    @JsonProperty("location")
    @Embedded
    private Location location;

    @Column(name = "scrape_date")
    private ISODate scrapeDate;

    @Column(name = "vpn_config_path")
    private String vpnConfigPath;

    @Column(name = "details_enriched")
    private boolean detailsEnriched; // ¿Product is detailed?

    // Constructores, getters y setters
}