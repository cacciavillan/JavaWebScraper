package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("wp_user")
public class WpUser {
    @Id
    private UUID uuid;

    @JsonProperty("id")
    private String id;

    @JsonProperty("micro_name")
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