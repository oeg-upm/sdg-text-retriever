/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.request;

import com.upm.dto.ProjectFullDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Alberto Sánchez Ruiz
 */

public class ProjectRequest {
    
    public void getProjectsFromGoteo(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic YWxiZXJ0c3I6MWMwOTk4NjE0MTIxN2JjNzdjNmFiY2ExNjk0ZGIyM2Y=");
        List<ProjectFullDTO> projectList = new ArrayList<>();
        for(int i=0; i<5; i++){
            ProjectFullDTO project = restTemplate.getForObject("https://api.goteo.org/v1/projects/",ProjectFullDTO.class);
        }
    }
}
    

