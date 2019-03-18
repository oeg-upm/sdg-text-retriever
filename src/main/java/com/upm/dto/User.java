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
    "date-created",
    "id",
    "name",
    "node",
    "profile-image-url",
    "profile-url"
})
public class User {

    @JsonProperty("date-created")
    private String dateCreated;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("node")
    private String node;
    @JsonProperty("profile-image-url")
    private String profileImageUrl;
    @JsonProperty("profile-url")
    private String profileUrl;

    @JsonProperty("date-created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date-created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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

    @JsonProperty("profile-image-url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile-image-url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    @JsonProperty("profile-url")
    public String getProfileUrl() {
        return profileUrl;
    }

    @JsonProperty("profile-url")
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

}
