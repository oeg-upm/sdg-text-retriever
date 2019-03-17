/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.dto;

/**
 *
 * @author Djbosh
 */
public class UserDTO {
    private Integer idUser;
    private String name;
    private Integer nProjects;

    public UserDTO(Integer idUser, String name, Integer nProjects) {
        this.idUser = idUser;
        this.name = name;
        this.nProjects = nProjects;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getnProjects() {
        return nProjects;
    }

    public void setnProjects(Integer nProjects) {
        this.nProjects = nProjects;
    }
    
    
}
