package techno_kryon.spring_boot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.HSSFSheet;
//import org.apache.poi.xssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.XSSFSheet;
//import org.apache.poi.ss.usermodel.XSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;


import java.util.Iterator;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class ImportExcelData {


    //private String filePath = env.getProperty("excelfilepath");
    private String filePath = "./src/main/resources/data.xlsx";

    @PostConstruct
    public void importExcelData() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));

            System.out.println("Successfully Opened Excel File");


            // Main Logic Starts

            Workbook workbook = new XSSFWorkbook(fileInputStream);

            Sheet sheet = workbook.getSheetAt(0);

            for(Row row : sheet) {
                if(row.getRowNum() == 0) continue;
                System.out.print((int)row.getCell(0).getNumericCellValue()+" - ");
                System.out.print(row.getCell(1).getStringCellValue()+" - ");
                System.out.print(row.getCell(2).getStringCellValue()+" - ");
                System.out.print(row.getCell(3).getStringCellValue()+" - ");
                System.out.print((int)row.getCell(4).getNumericCellValue());
                System.out.println("");
            }

            //Iterator<Row> rowIterator = sheet.iterator();

            //while(rowIterator.hasNext()) {

            //    Row row = rowIterator.next();

            //    Iterator<Cell> cellIterator = row.cellIterator();

            //    while(cellIterator.hasNext()) {

            //        Cell cell = cellIterator.next();

            //        //int columnIndex = cell.getColumnIndex();
            //        
            //    //    switch(columnIndex) {

            //    //        case 0:
            //    //            System.out.print(cell.getStringCellValue() + "string 0");
            //    //            break;

            //    //        case 1:
            //    //            System.out.print(cell.getStringCellValue() + "string 1");
            //    //            break;
            //    //    }

            //    //    System.out.println(" ");
            //        System.out.print(cell.getStringCellValue() + " - ");
            //    }
            //    System.out.println("");

            //}

            workbook.close();
            fileInputStream.close();



        }
        catch (IOException ioe) {
            System.out.println("IO ERROR OCCURED!");
            ioe.printStackTrace();
        }
    }

//    private Object getCellValue(Cell cell) {
//        switch(cell.getCellType()) {
//            case Cell.CELL_TYPE_STRING:
//                return cell.getStringCellValue();
//            case Cell.CELL_TYPE_BOOLEAN:
//                return cell.getBooleanCellValue();
//            case Cell.CELL_TYPE_NUMERIC:
//                return cell.getNumericCellValue();
//        }
//
//        return null;
//    }
}

