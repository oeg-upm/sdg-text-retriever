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
    "about",
    "description",
    "description-short",
    "motivation"
})
public class Eu {

    @JsonProperty("about")
    private String about;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description-short")
    private String descriptionShort;
    @JsonProperty("motivation")
    private String motivation;

    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description-short")
    public String getDescriptionShort() {
        return descriptionShort;
    }

    @JsonProperty("description-short")
    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    @JsonProperty("motivation")
    public String getMotivation() {
        return motivation;
    }

    @JsonProperty("motivation")
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

}
