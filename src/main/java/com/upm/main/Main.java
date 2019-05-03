/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.main;

import com.upm.dto.ProjectDTO;
import com.upm.dto.ProjectFullDTO;
import com.upm.parser.ScraperWeb;
import com.upm.request.ProjectRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Djbosh
 */

public class Main {
    
    public static void main (String [] args){
        /*
        List<ProjectFullDTO> response;
        ProjectRequest request = new ProjectRequest();
        response = request.getProjectsFromGoteo("26");
        */
        
        String url = "https://www.un.org/sustainabledevelopment/es/climate-change-2/";
        ScraperWeb sw = new ScraperWeb();
        String res = sw.scrapWebONU13(url);
        System.out.println(res);
    }
}
