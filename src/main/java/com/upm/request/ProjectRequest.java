/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.request;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Djbosh
 */

public class ProjectRequest {
    private Client client;
    private WebTarget target;
    
    @PostConstruct
    public void init(){
        client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.goteo.org/v1/projects/");
    }
}
    

