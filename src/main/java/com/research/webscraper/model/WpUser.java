package com.research.webscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "wp_user")
public class WpUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @JsonProperty("id")
    private String id;
    @JsonProperty("micro_name")
    private String microName;

    // Completar la clase con los detalles de los usuarios.
    // Constructores, getters y setters
}