/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author Alberto Sánchez Ruiz
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items",
    "meta",
    "time-elapsed"
})
public class ProjectDTO {

    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("time-elapsed")
    private Double timeElapsed;

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("time-elapsed")
    public Double getTimeElapsed() {
        return timeElapsed;
    }

    @JsonProperty("time-elapsed")
    public void setTimeElapsed(Double timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

}
