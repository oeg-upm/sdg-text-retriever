/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.parser;

import com.upm.db.Database;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author Djbosh
 */

public class PdfParser {

    public String getTextFromPDF(String pdfName, int ods) {
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        PDFTextStripper pdfStripper;
        String parsedText = "";

        File file = new File(pdfName);
        try {
            pdDoc = PDDocument.load(file);
            pdfStripper = new PDFTextStripper();
            parsedText = pdfStripper.getText(pdDoc);
            pdDoc.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (cosDoc != null) {
                    cosDoc.close();
                }
                if (pdDoc != null) {
                    pdDoc.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        Database db = new Database();
        db.insertTextIntoDatabase(ods, parsedText);
        return parsedText;
    }
    
    public String getTextFromReport(String pdfName, int startPage, int endPage, int ods){
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        PDFTextStripper pdfStripper;
        String parsedText = "";
        File file = new File(pdfName);
        try {
            pdDoc = PDDocument.load(file);
            pdfStripper = new PDFTextStripper();
            pdfStripper.setStartPage(startPage);
            pdfStripper.setEndPage(endPage);
            parsedText = pdfStripper.getText(pdDoc);
            Database db = new Database();
            db.insertTextIntoDatabase(ods, parsedText);
            pdDoc.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (cosDoc != null) {
                    cosDoc.close();
                }
                if (pdDoc != null) {
                    pdDoc.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        return parsedText;
    }
    
    public String getTextLineByLineFromReport(String pdfName){
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        PDFTextStripper pdfStripper;
        String parsedText = "";
        File file = new File(pdfName);
        try {
            pdDoc = PDDocument.load(file);
            pdfStripper = new PDFTextStripper();
            parsedText = pdfStripper.getText(pdDoc);
            
            String lines[] = parsedText.split("\\r?\\n");
            String ods1 = "";
            String ods2 = "";
            String ods3 = "";
            String ods4 = "";
            String ods5 = "";
            String ods6 = "";
            String ods7 = "";
            String ods8 = "";
            String ods9 = "";
            String ods10 = "";
            String ods11 = "";
            String ods12 = "";
            String ods13 = "";
            String ods14 = "";
            String ods15 = "";
            String ods16 = "";
            String ods17 = "";
            
            
            int i=0;
            while(!lines[i].contains("Objetivo 1")){
                i++;
            }
            while(!lines[i].contains("Objetivo 2")){
                if(lines[i].contains("1 La información adicional sobre los indicadores de los Objetivos de Desarrollo Sostenible, y la")
                        || lines[i].contains("lista completa de organizaciones contribuyentes se presentarán en: http://unstats.un.org/sdgs.")
                        || lines[i].contains("2 La información detallada sobre las agrupaciones regionales que figuran en el presente informe")
                        || lines[i].contains("se podrá consultar en: https://unstats.un.org/sdgs/indicators/regional-groups/.")
                        || lines[i].contains("2/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods1 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 3")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods2 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 4")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods3 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 5")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods4 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 6")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods5 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 7")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods6 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 8")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods7 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 9")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods8 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 10")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods9 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 11")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods10 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 12")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods11 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 13")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods12 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 14")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods13 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 15")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")
                        || lines[i].contains("3 Organización de las Naciones Unidas para la Educación, la Ciencia y la Cultura, Informe")
                        || lines[i].contains("Mundial sobre las Ciencias Oceánicas: el estado actual de las ciencias oceánicas en el mundo")
                        || lines[i].contains("(2017).")){
                    i++;
                    continue;
                }
                ods14 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 16")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods15 += lines[i];
                i++;
            }
            while(!lines[i].contains("Objetivo 17")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods16 += lines[i];
                i++;
            }
            while(!lines[i].contains("75% por lo menos.")){
                if(lines[i].contains("/21")
                        || lines[i].contains("18-07638")
                        || lines[i].contains("E/2018/64")
                        || lines[i].contains("__________________")){
                    i++;
                    continue;
                }
                ods17 += lines[i];
                i++;
            }
            ods17 += lines[i];
            Database db = new Database();
            db.insertTextIntoDatabase(1, ods1);
            db.insertTextIntoDatabase(2, ods2);
            db.insertTextIntoDatabase(3, ods3);
            db.insertTextIntoDatabase(4, ods4);
            db.insertTextIntoDatabase(5, ods5);
            db.insertTextIntoDatabase(6, ods6);
            db.insertTextIntoDatabase(7, ods7);
            db.insertTextIntoDatabase(8, ods8);
            db.insertTextIntoDatabase(9, ods9);
            db.insertTextIntoDatabase(10, ods10);
            db.insertTextIntoDatabase(11, ods11);
            db.insertTextIntoDatabase(12, ods12);
            db.insertTextIntoDatabase(13, ods13);
            db.insertTextIntoDatabase(14, ods14);
            db.insertTextIntoDatabase(15, ods15);
            db.insertTextIntoDatabase(16, ods16);
            db.insertTextIntoDatabase(17, ods17);
            
            pdDoc.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return parsedText;
    }
}
