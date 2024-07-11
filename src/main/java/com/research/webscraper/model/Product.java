package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.research.webscraper.util.ISODate;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "products")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "uuid")
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
    @ManyToOne
    @JoinColumn(name = "user_id")
    private WpUser userId; // Referencia al ID del usuario

    @JsonProperty("flags")
    @Embedded
    private ProductFlags flags;

    @JsonProperty("price")
    @Column(name = "price")
    private Integer price;

    @JsonProperty("currency")
    @Column(name = "currency")
    private String currency;

    @JsonProperty("web_slug")
    @Column(name = "web_slug")
    private String webSlug;

    @JsonProperty("category_id")
    @Column(name = "category_id")
    private Integer categoryId;

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
    private boolean detailsEnriched;

    @Column(name = "views")
    private Integer views;

    @Column(name = "favorites")
    private Integer favorites;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "condition")
    private String condition;

    @Column(name = "up_to_kg")
    private Integer upToKg;

    // Getters y setters (mantén los que ya tienes)

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public WpUser getUserId() {
        return userId;
    }

    public void setUserId(WpUser userId) {
        this.userId = userId;
    }

    public ProductFlags getFlags() {
        return flags;
    }

    public void setFlags(ProductFlags flags) {
        this.flags = flags;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getWebSlug() {
        return webSlug;
    }

    public void setWebSlug(String webSlug) {
        this.webSlug = webSlug;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public ISODate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ISODate creationDate) {
        this.creationDate = creationDate;
    }

    public ISODate getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(ISODate modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ISODate getScrapeDate() {
        return scrapeDate;
    }

    public void setScrapeDate(ISODate scrapeDate) {
        this.scrapeDate = scrapeDate;
    }

    public String getVpnConfigPath() {
        return vpnConfigPath;
    }

    public void setVpnConfigPath(String vpnConfigPath) {
        this.vpnConfigPath = vpnConfigPath;
    }

    public boolean isDetailsEnriched() {
        return detailsEnriched;
    }

    public void setDetailsEnriched(boolean detailsEnriched) {
        this.detailsEnriched = detailsEnriched;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getUpToKg() {
        return upToKg;
    }

    public void setUpToKg(Integer upToKg) {
        this.upToKg = upToKg;
    }
}