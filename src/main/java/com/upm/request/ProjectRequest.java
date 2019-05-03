/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.request;

import com.upm.db.Database;
import com.upm.dto.Item;
import com.upm.dto.ProjectDTO;
import com.upm.dto.ProjectFullDTO;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Alberto Sánchez Ruiz
 */
public class ProjectRequest {

    private List<ProjectFullDTO> projectFinalList = new ArrayList<>();

    public ProjectDTO getProjectPageFromGoteo(String pageNumber) {
        String url = "https://api.goteo.org/v1/projects?page=" + pageNumber + "&limit=50";
        /*Map<String,String> headersMap = new HashMap<>();
         String bodyParams = "page="+pageNumber;
         String response = doRequest(url,bodyParams,headersMap,null);
         return response;*/
        try {
            String user = "albertsr";
            String pass = "a39b2f45c847fbe69e3d480c34f077cf";
            byte[] authBytes = String.join(":", user, pass).getBytes("utf-8");
            String auth = Base64.getEncoder().encodeToString(authBytes);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", "Basic " + auth);
            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params);
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<ProjectDTO> response = restTemplate.exchange(url, HttpMethod.GET, entity, ProjectDTO.class, request);

            if (response.getStatusCode() == HttpStatus.OK) {
                ProjectDTO bodyResponse = (ProjectDTO) response.getBody();
                return bodyResponse;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ProjectFullDTO getProjectByID(String id) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://api.goteo.org/v1/projects/" + id;
            String user = "albertsr";
            String pass = "a39b2f45c847fbe69e3d480c34f077cf";
            byte[] authBytes = String.join(":", user, pass).getBytes("utf-8");
            String auth = Base64.getEncoder().encodeToString(authBytes);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", "Basic " + auth);
            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params);
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<ProjectFullDTO> response = restTemplate.exchange(url, HttpMethod.GET, entity, ProjectFullDTO.class, request);
            if (response.getStatusCode() == HttpStatus.OK) {
                ProjectFullDTO bodyResponse = (ProjectFullDTO) response.getBody();
                return bodyResponse;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ProjectFullDTO> getProjectsFromGoteo(String page) {
        ProjectDTO projects = getProjectPageFromGoteo(page);
        int amountProjects = projects.getItems().size();
        for (int i = 0; i < amountProjects; i++) {
            Item item = projects.getItems().get(i);
            String id = item.getId();
            ProjectFullDTO project = getProjectByID(id);
            projectFinalList.add(project);
        }

        Database db = new Database();
        db.insertProjectsIntoDatabase(projectFinalList);
        return projectFinalList;
    }


    /*public String doRequest(String urlString, String bodyParams, Map<String, String> headers, String contentType) {
     String result = "-1";
     int httpResponseCode = -1;
     try {
     URL url = new URL(urlString);
     HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
     connection.setConnectTimeout(90000);
     connection.setReadTimeout(90000);
     long initialTime = System.currentTimeMillis();
     connection.setDoOutput(true);
     connection.setDoInput(true);
     connection.setInstanceFollowRedirects(true);
     connection.setRequestMethod("GET");
     if (contentType != null) {
     connection.setRequestProperty("Content-Type", contentType);
     }
     connection.setRequestProperty("charset", "utf-8");
     connection.setRequestProperty("Content-Length", "" + Integer.toString(bodyParams.getBytes().length));
     if (headers != null) {
     for (String key : headers.keySet()) {
     connection.addRequestProperty(key, headers.get(key));
     }
     }
     String encoding = Base64.getEncoder().encodeToString("albertsr:a39b2f45c847fbe69e3d480c34f077cf".getBytes("utf-8"));
     connection.setRequestProperty("Authorization", "Basic " + encoding);
     connection.setUseCaches(false);
     try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
     try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(wr, "UTF-8"))) {
     writer.write(bodyParams);
     } catch (Exception e) {
     wr.writeUTF(bodyParams);
     }
     wr.flush();
     wr.close();
     httpResponseCode = connection.getResponseCode();
     if (httpResponseCode == HttpURLConnection.HTTP_OK) {
     BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
     String line;
     String output = "";
     while ((line = br.readLine()) != null) {
     output += line;
     }
     result = output;
     }
     }
     connection.disconnect();
     } catch (MalformedURLException e) {
     e.printStackTrace();
     } catch (IOException e) {
     e.printStackTrace();
     }

     return result;
     }*/
}
