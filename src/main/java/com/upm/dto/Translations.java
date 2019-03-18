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
    "eu"
})
public class Translations {

    @JsonProperty("eu")
    private Eu eu;

    @JsonProperty("eu")
    public Eu getEu() {
        return eu;
    }

    @JsonProperty("eu")
    public void setEu(Eu eu) {
        this.eu = eu;
    }

}
