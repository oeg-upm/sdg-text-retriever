/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.main;

import com.upm.dto.ProjectDTO;
import com.upm.dto.ProjectFullDTO;
import com.upm.parser.PdfParser;
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
        
        /*
        String url = "https://www.un.org/sustainabledevelopment/es/globalpartnerships/";
        ScraperWeb sw = new ScraperWeb();
        String res = sw.scrapWebONU17(url);
        System.out.println(res);
        */
        
        /*
        String path = "C:\\Users\\Djbosh\\Documents\\ODS\\ODSReport.pdf";
        PdfParser parser = new PdfParser();
        parser.getTextFromReport(path, 22, 25, 3);
        parser.getTextFromReport(path, 26, 27, 4);
        parser.getTextFromReport(path, 28, 31, 5);
        parser.getTextFromReport(path, 32, 33, 6);
        parser.getTextFromReport(path, 34, 35, 7);
        parser.getTextFromReport(path, 36, 37, 8);
        parser.getTextFromReport(path, 38, 39, 9);
        parser.getTextFromReport(path, 40, 41, 10);
        parser.getTextFromReport(path, 42, 43, 11);
        parser.getTextFromReport(path, 44, 45, 12);
        parser.getTextFromReport(path, 46, 47, 13);
        parser.getTextFromReport(path, 48, 49, 14);
        parser.getTextFromReport(path, 50, 51, 15);
        parser.getTextFromReport(path, 52, 55, 16);
        parser.getTextFromReport(path, 56, 59, 17);
        */
        
        String path = "C:\\Users\\Djbosh\\Documents\\ODS\\ReportODS2018.pdf";
        PdfParser parser = new PdfParser();
        parser.getTextLineByLineFromReport(path);
        
    }
}
