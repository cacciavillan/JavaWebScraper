package com.research.webscraper.model;

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

    @Column(name = "id")
    private String id; // Wallapop product ID

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "distance")
    private int distance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // Wallapop user ID

    @Enumerated(EnumType.STRING)
    @Column(name = "flag")
    private ProductFlags flag; // PENDING, SOLD, RESERVED, BANNED, EXPIRED, ONHOLD

    @Column(name = "price")
    private double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;

    @Column(name = "web_slug")
    private String webSlug; // product URL

    @Column(name = "category_id")
    private int categoryId; // Wallapop category ID

    @Embedded
    private Shipping shipping;

    @Column(name = "views")
    private int views; // Total amount of product views

    @Column(name = "favorites")
    private int favorites; // Total amount of product favorites

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Enumerated(EnumType.STRING)
    private Condition condition;  // in_box,  as_good_as_new, good, fair, has_given_it_all

    @Column(name = "upToKg")
    private int upToKg; // Estimated weight

    @Column(name = "creation_date")
    private ISODate creationDate;

    @Column(name = "modification_date")
    private ISODate modificationDate;

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