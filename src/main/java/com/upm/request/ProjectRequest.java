/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.request;

import com.upm.dto.Item;
import com.upm.dto.ProjectDTO;
import com.upm.dto.ProjectFullDTO;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Alberto Sánchez Ruiz
 */
public class ProjectRequest {

    private List<ProjectFullDTO> projectFinalList = new ArrayList<>();

    private ProjectDTO getProjectPageFromGoteo(String pageNumber) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.goteo.org/v1/projects/?page=" + pageNumber;
        HttpHeaders headers = createHeaders("albertsr", "1c09986141217bc77c6abca1694db23f");
        ProjectDTO response = restTemplate.getForObject(url, ProjectDTO.class, headers);
        return response;
    }

    private ProjectFullDTO getProjectByID(String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.goteo.org/v1/projects/" + id;
        HttpHeaders headers = createHeaders("thealbertsr", "1c09986141217bc77c6abca1694db23f");
        ProjectFullDTO response = restTemplate.getForObject(url, ProjectFullDTO.class, headers);
        return response;
    }

    private HttpHeaders createHeaders(String username, String password) {
        String plainCreds = username + ":" + password;
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        return headers;
    }

    public List<ProjectFullDTO> getProjectsFromGoteo() {
        boolean projectsLeft = true;
        int page = 1;
        while (projectsLeft) {
            ProjectDTO projects = getProjectPageFromGoteo(Integer.toString(page++));
            int amountProjects = projects.getItems().size();
            if (amountProjects == 0) {
                projectsLeft = false;
            }
            for (int i = 0; i < amountProjects; i++) {
                Item item = projects.getItems().get(i);
                String id = item.getId();
                ProjectFullDTO project = getProjectByID(id);
                projectFinalList.add(project);
            }
        }
        return projectFinalList;
    }
}
