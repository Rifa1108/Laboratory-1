/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Calculate;
import model.Data_Exchange;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author rifa1
 */
public class Coordination {

    XSSFSheet myExcelSheet;
    Data_Exchange d_e = new Data_Exchange();
    Calculate calc = new Calculate();

    public String Import(String file, int list) {
        myExcelSheet = d_e.importFromExcel(file, list);
        if (myExcelSheet.getSheetName() == "not found") {
            return "No";
        } else {
            return "OK";
        }

    }
    public double[] geometric_mean(){
        return calc.geometric_means(myExcelSheet);
    
}
}

