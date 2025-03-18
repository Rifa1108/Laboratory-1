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
    Calculate calc; 
    double[] g_m;
    double[] a_m;
    double[] std;
    double[] range;
    double[][] cov;
    double[] number;
    double[] coef_var;
    double[][] trust_interval;
    double[] var;
    double[] max;
    double[] min;

    public String data_import(String file, int list) {

        myExcelSheet = d_e.importFromExcel(file, list);
        if (myExcelSheet.getSheetName() == "not found") {
            return "No";
        } else {
            return "OK";
        }

    }

    public void calculation(double y) {
        
        calc = new Calculate(myExcelSheet);
        g_m = calc.geometric_mean();
        a_m = calc.arifmetric_mean();
        std = calc.std();
        range = calc.range();
        cov = calc.cov();
        number = calc.number();
        coef_var = calc.coef_var();
        trust_interval = calc.trust_interval(y);
        var = calc.var();
        max = calc.max();
        min = calc.min();

    }

    public String data_export(String name) {

        try {
            Workbook book = d_e.exportInExcel(myExcelSheet, g_m, a_m, std, range, cov, number, coef_var,
                    trust_interval, var, max, min);
            book.write(new FileOutputStream(name));
            book.close();
            return "Ok";
        } catch (IOException io) {
            return "Error";
        }

    }

}
