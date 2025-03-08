/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


/**
 *
 * @author rifa1
 */
public class Calculate {

    public double[] geometric_means(XSSFSheet myExcelSheet) {
        int count = myExcelSheet.getRow(0).getPhysicalNumberOfCells();
        double[] result = new double[count];
        DescriptiveStatistics[] descriptiveStatistics = new DescriptiveStatistics[count];
        for (int i = 0; i < count; i++) {
            descriptiveStatistics[i] = new DescriptiveStatistics();
        }
        for (int i = 1; i < myExcelSheet.getLastRowNum(); i++) {
            for (int k = 0; k < count; k++) {
                descriptiveStatistics[k].addValue(myExcelSheet.getRow(i).getCell(k).getNumericCellValue());

            }
        }
        for (int i = 0; i < count; i++) {
            result[i] = descriptiveStatistics[i].getGeometricMean();
        }

        return result;

    }
}
