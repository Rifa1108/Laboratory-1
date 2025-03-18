/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author rifa1
 */
public class Data_Exchange {

    public XSSFSheet importFromExcel(String file, int list) {
        try {
            XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet myExcelSheet = myExcelBook.getSheetAt(list);
            return myExcelSheet;
        } catch (IOException e) {

        } catch (IllegalArgumentException ex) {

        }
        return new XSSFWorkbook().createSheet("not found");
    }

    public Workbook exportInExcel(XSSFSheet myExcelSheet, double[] g_m, double[] a_m,
            double[] std, double[] range, double[][] cov, double[] number, double[] coef_var,
            double[][] trust_interval, double[] var, double[] max, double[] min) {
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet(myExcelSheet.getSheetName());
        Row row;
        try {
            row = sheet.createRow(0);
            for (int i = 0; i < myExcelSheet.getRow(0).getLastCellNum(); i++) {
                row.createCell(i).setCellValue(myExcelSheet.getRow(0).getCell(i).getStringCellValue());
            }
            row = sheet.createRow(1);
            row.createCell(0).setCellValue("Среднее геометрическое");
            row = sheet.createRow(2);
            for (int i = 0; i < g_m.length; i++) {
                row.createCell(i).setCellValue(g_m[i]);
            }
            row = sheet.createRow(3);
            row.createCell(0).setCellValue("Среднее арифмитическое");
            row = sheet.createRow(4);
            for (int i = 0; i < a_m.length; i++) {
                row.createCell(i).setCellValue(a_m[i]);
            }
            row = sheet.createRow(5);
            row.createCell(0).setCellValue("Оценка стандартного отклонения");
            row = sheet.createRow(6);
            for (int i = 0; i < std.length; i++) {
                row.createCell(i).setCellValue(std[i]);
            }
            row = sheet.createRow(7);
            row.createCell(0).setCellValue("Размах");
            row = sheet.createRow(8);
            for (int i = 0; i < range.length; i++) {
                row.createCell(i).setCellValue(range[i]);
            }
            row = sheet.createRow(9);
            row.createCell(0).setCellValue("Коэффициенты ковариации");
            row = sheet.createRow(10);
            row.createCell(0).setCellValue("");
            for (int i = 0; i < cov[0].length; i++) {
                    row.createCell(i+1).setCellValue(myExcelSheet.getRow(0).getCell(i).getStringCellValue());          
            }
            for (int i = 0; i < cov[0].length; i++) {
                row = sheet.createRow(sheet.getLastRowNum()+1);
                row.createCell(0).setCellValue(myExcelSheet.getRow(0).getCell(i).getStringCellValue());
                for (int k = 0; k < cov[0].length; k++) { 
                    row.createCell(k+1).setCellValue(cov[i][k]);
                }
            }

            row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue("Количество элементов");
            row = sheet.createRow(sheet.getLastRowNum()+1);
            for (int i = 0; i < number.length; i++) {
                row.createCell(i).setCellValue(number[i]);
            }
            row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue("Коэффициент вариации");
            row = sheet.createRow(sheet.getLastRowNum()+1);
            for (int i = 0; i < coef_var.length; i++) {
                row.createCell(i).setCellValue(coef_var[i]);
            }
            row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue("Доверительный интервал для мат. ожидания");
            row = sheet.createRow(sheet.getLastRowNum()+1);
            for (int i = 0; i < coef_var.length; i++) {
                row.createCell(i).setCellValue(trust_interval[i][1] + " - " + trust_interval[i][0]);
            }
            row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue("Оценка дисперсии");
            row = sheet.createRow(sheet.getLastRowNum()+1);
            for (int i = 0; i < var.length; i++) {
                row.createCell(i).setCellValue(var[i]);
            }
            row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue("Максимум");
            row = sheet.createRow(sheet.getLastRowNum()+1);
            for (int i = 0; i < max.length; i++) {
                row.createCell(i).setCellValue(max[i]);
            }
            row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue("Минимум");
            row = sheet.createRow(sheet.getLastRowNum()+1);
            for (int i = 0; i < min.length; i++) {
                row.createCell(i).setCellValue(min[i]);
            }
            for (int i = 0; i < min.length+1; i++) {
                sheet.autoSizeColumn(i);
            }
        } catch (NullPointerException nul) {

        }
        return book;

    }

}
