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
    "image-url",
    "resource-url"
})
public class ImageGallery {

    @JsonProperty("image-url")
    private String imageUrl;
    @JsonProperty("resource-url")
    private Object resourceUrl;

    @JsonProperty("image-url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image-url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("resource-url")
    public Object getResourceUrl() {
        return resourceUrl;
    }

    @JsonProperty("resource-url")
    public void setResourceUrl(Object resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

}
