/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import model.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author rifa1
 */
public class Coordination {

    XSSFSheet myExcelSheet;
    Data_Exchange d_e = new Data_Exchange();
    Calculate calc = new Calculate();
    double[] g_m;

    public String Import(String file, int list) {
        myExcelSheet = d_e.importFromExcel(file, list);
        if (myExcelSheet.getSheetName() == "not found") {
            return "No";
        } else {
            return "OK";
        }
        

    }

    public void geometric_mean() {
        g_m = calc.geometric_means(myExcelSheet);
 

    }
    public void Export(){
        try{
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet(myExcelSheet.getSheetName());

        Row row1 = sheet.createRow(0); 
        for (int i=0; i< myExcelSheet.getRow(0).getLastCellNum(); i++){
            row1.createCell(i).setCellValue(myExcelSheet.getRow(0).getCell(i).getStringCellValue());
        }
        
        Row row2 = sheet.createRow(1);
        
       row2.createCell(0).setCellValue("Среднее геометрическое");
       Row row3 = sheet.createRow(2);
       for (int i=0; i< g_m.length; i++){
            row3.createCell(i).setCellValue(g_m[i]);
        }
       sheet.autoSizeColumn(1);
        book.write(new FileOutputStream("Result.xlsx"));
        book.close();
        }
        catch(IOException io){
            
        }
               /*try {
            FileWriter writer = new FileWriter("example.txt");
            
            writer.write("");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }*/
    }
}

