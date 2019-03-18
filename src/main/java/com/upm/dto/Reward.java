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
    "description",
    "icon-url",
    "id",
    "license",
    "license-description",
    "license-name",
    "license-svg-url",
    "license-url",
    "name",
    "type"
})
public class Reward {

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon-url")
    private String iconUrl;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("license")
    private String license;
    @JsonProperty("license-description")
    private String licenseDescription;
    @JsonProperty("license-name")
    private String licenseName;
    @JsonProperty("license-svg-url")
    private String licenseSvgUrl;
    @JsonProperty("license-url")
    private String licenseUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("icon-url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("icon-url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("license-description")
    public String getLicenseDescription() {
        return licenseDescription;
    }

    @JsonProperty("license-description")
    public void setLicenseDescription(String licenseDescription) {
        this.licenseDescription = licenseDescription;
    }

    @JsonProperty("license-name")
    public String getLicenseName() {
        return licenseName;
    }

    @JsonProperty("license-name")
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    @JsonProperty("license-svg-url")
    public String getLicenseSvgUrl() {
        return licenseSvgUrl;
    }

    @JsonProperty("license-svg-url")
    public void setLicenseSvgUrl(String licenseSvgUrl) {
        this.licenseSvgUrl = licenseSvgUrl;
    }

    @JsonProperty("license-url")
    public String getLicenseUrl() {
        return licenseUrl;
    }

    @JsonProperty("license-url")
    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

}
