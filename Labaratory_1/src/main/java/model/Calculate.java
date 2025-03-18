/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.correlation.Covariance;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 *
 * @author rifa1
 */
public class Calculate {
    private XSSFSheet myExcelSheet;
    
    public Calculate(XSSFSheet myExcelSheet){
        this.myExcelSheet = myExcelSheet;
    }

    public double[] geometric_mean() {

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

    public double[] arifmetric_mean() {

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
            result[i] = descriptiveStatistics[i].getMean();
        }

        return result;

    }

    public double[] std() {

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
            result[i] = descriptiveStatistics[i].getStandardDeviation();
        }

        return result;

    }

    public double[] range() {

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
            result[i] = descriptiveStatistics[i].getMax() - descriptiveStatistics[i].getMin();
        }

        return result;

    }

    public double[][] cov() {

        int columns = myExcelSheet.getRow(0).getPhysicalNumberOfCells();
        int rows = myExcelSheet.getLastRowNum();
        double[][] selection = new double[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int k = 1; k < rows; k++) {
                selection[i][k] = myExcelSheet.getRow(k).getCell(i).getNumericCellValue();
            }
        }
        Covariance covariance = new Covariance(selection);
        double cov[][] = new double[columns][columns];
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < columns; k++) {
                cov[i][k] = covariance.covariance(selection[i], selection[k]);
            }
        }
        return cov;

    }

    public double[] number() {

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
            result[i] = descriptiveStatistics[i].getN();
        }

        return result;

    }

    public double[] coef_var() {

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
            result[i] = descriptiveStatistics[i].getVariance() / descriptiveStatistics[i].getMean();
        }

        return result;

    }

    public double[][] trust_interval(double y) {

        int count = myExcelSheet.getRow(0).getPhysicalNumberOfCells();
        double[][] result = new double[count][2];
        DescriptiveStatistics[] descriptiveStatistics = new DescriptiveStatistics[count];
        double u;
        for (int i = 0; i < count; i++) {
            descriptiveStatistics[i] = new DescriptiveStatistics();
        }
        for (int i = 1; i < myExcelSheet.getLastRowNum(); i++) {
            for (int k = 0; k < count; k++) {
                descriptiveStatistics[k].addValue(myExcelSheet.getRow(i).getCell(k).getNumericCellValue());

            }
        }
        for (int i = 0; i < count; i++) {
            u = new TDistribution(49).inverseCumulativeProbability((1 - y) / 2);
            double d = u * descriptiveStatistics[i].getStandardDeviation() / Math.sqrt(descriptiveStatistics[i].getN());
            result[i][0] = descriptiveStatistics[i].getMean() - d;
            result[i][1] = descriptiveStatistics[i].getMean() + d;

        }

        return result;

    }

    public double[] var() {

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
            result[i] = descriptiveStatistics[i].getVariance();
        }

        return result;

    }

    public double[] max() {

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
            result[i] = descriptiveStatistics[i].getMax();
        }

        return result;

    }

    public double[] min() {

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
            result[i] = descriptiveStatistics[i].getMin();

        }

        return result;

    }

}
