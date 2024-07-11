package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "wp_user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WpUser {

    @Id
    @GeneratedValue
    private UUID uuid;

    @JsonProperty("id")
    @Column(name = "id")
    private String id;

    @JsonProperty("micro_name")
    @Column(name = "micro_name")
    private String microName;

    // Constructores, getters y setters

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

    public String getMicroName() {
        return microName;
    }

    public void setMicroName(String microName) {
        this.microName = microName;
    }
}