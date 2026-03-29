package org.example.ex14_Data_Driven_Testing;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class UtileExcel {
    // Apache POI
    // Read the File - FileInputStream
    //  Workbook Create - WorkbookFactory
    // Sheet - book
    // Row and Cell- sheet
    // 2D Object  - getData() and loop


    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH =
            System.getProperty("user.dir") + "\\src\\test\\resources\\Book1.xlsx";


    public static Object[][] getTestDataFromExcel(String sheetName) throws IOException {
        System.out.println("USER DIR = " + System.getProperty("user.dir"));

        FileInputStream file = null;
        try {
            file = new FileInputStream(SHEET_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        book = WorkbookFactory.create(file);
        sheet  = book.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        // 5x2
        for (int i = 0; i < sheet.getLastRowNum() ; i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }

    @DataProvider(parallel = true)
    public Object[][] getData() throws IOException {
        return getTestDataFromExcel("Sheet1");
        //return getTestDataFromSQL("Sheet1");
    }






}