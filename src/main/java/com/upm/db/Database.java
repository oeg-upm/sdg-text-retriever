/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.db;

import com.upm.dto.ProjectFullDTO;
import java.sql.*;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Djbosh
 */
public class Database {

    private static final  String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final  String BD_URL = "jdbc:mysql://localhost/goteo_ods?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final  String USUARIO = "alberto";
    private static final  String PASS = "ods";
    private static Connection conexion = null;
    
    public void openConnection(){
        try{
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(BD_URL, USUARIO, PASS);
        } catch (Exception e){
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void insertProjectsIntoDatabase(List<ProjectFullDTO> projectList) {
        try {
            for (int i = 0; i < projectList.size(); i++) {
                openConnection();
                ProjectFullDTO project = projectList.get(i);
                String insertQuery = "INSERT INTO project (name,short_description,description,id_user) VALUES (?,?,?,?)";
                PreparedStatement pst = null;
                pst = conexion.prepareStatement(insertQuery);
                pst.setString(1,project.getName());
                pst.setString(2,project.getDescriptionShort());
                pst.setString(3,project.getDescription());
                pst.setString(4,project.getOwner());
                pst.executeUpdate();
                pst.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertTextIntoDatabase (int ods, String text){
        try{
            openConnection();
            String insertQuery = "INSERT INTO ods_text (ods,text) VALUES (?,?)";
            PreparedStatement pst = null;
            pst = conexion.prepareStatement(insertQuery);
            pst.setInt(1, ods);
            pst.setString(2, text);
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
