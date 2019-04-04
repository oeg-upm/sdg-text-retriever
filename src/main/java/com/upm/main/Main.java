/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.main;

import com.upm.dto.ProjectFullDTO;
import com.upm.request.ProjectRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Djbosh
 */

public class Main {
    
    public static void main (String [] args){
        List<ProjectFullDTO> listaPrueba = new ArrayList<>();
        ProjectRequest request = new ProjectRequest();
        listaPrueba = request.getProjectsFromGoteo();
    }
}
