/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author Alberto Sánchez Ruiz
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "date-created",
    "date-published",
    "description-short",
    "id",
    "image-url",
    "lang",
    "latitude",
    "longitude",
    "minimum",
    "name",
    "node",
    "optimum",
    "owner",
    "owner-name",
    "project-url",
    "region",
    "status"
})
public class Item {

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("date-created")
    private String dateCreated;
    @JsonProperty("date-published")
    private String datePublished;
    @JsonProperty("description-short")
    private String descriptionShort;
    @JsonProperty("id")
    private String id;
    @JsonProperty("image-url")
    private String imageUrl;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("minimum")
    private Double minimum;
    @JsonProperty("name")
    private String name;
    @JsonProperty("node")
    private String node;
    @JsonProperty("optimum")
    private Double optimum;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("owner-name")
    private String ownerName;
    @JsonProperty("project-url")
    private String projectUrl;
    @JsonProperty("region")
    private String region;
    @JsonProperty("status")
    private String status;

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("date-created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date-created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("date-published")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("date-published")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @JsonProperty("description-short")
    public String getDescriptionShort() {
        return descriptionShort;
    }

    @JsonProperty("description-short")
    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("image-url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image-url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    @JsonProperty("optimum")
    public Double getOptimum() {
        return optimum;
    }

    @JsonProperty("optimum")
    public void setOptimum(Double optimum) {
        this.optimum = optimum;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("owner-name")
    public String getOwnerName() {
        return ownerName;
    }

    @JsonProperty("owner-name")
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @JsonProperty("project-url")
    public String getProjectUrl() {
        return projectUrl;
    }

    @JsonProperty("project-url")
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

}
