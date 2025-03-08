/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author rifa1
 */
public class Data_Exchange {

    public XSSFSheet importFromExcel(String file, int list) {
        try {
            XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
            
            XSSFSheet myExcelSheet = myExcelBook.cloneSheet(list, "Var 1");
            return myExcelSheet;
        } catch (IOException e) {
            System.out.println("Erroe");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Erroe");
        }
        return new XSSFWorkbook().createSheet("not found");
    }
}


/*XSSFRow row = myExcelSheet.getRow(1);

            if (row.getCell(0).getCellType() == CellType.NUMERIC) {
                System.out.println(row.getCell(0));
            }
            System.out.println(row.getCell(0).getCellType());

            myExcelBook.close();*/
