package techno_kryon.spring_boot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;


import java.util.Iterator;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class ImportExcelData {

    @Autowired
    private Environment env;

    //private String filePath = env.getProperty("excelfilepath");
    private String filePath = "./src/main/resources/data.xlsx";

    @PostConstruct
    public void importExcelData() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));

            System.out.println("Successfully Opened Excel File");


            // Main Logic Starts

            XSSFWorkbook = workbook = new XSSFWorkbook(fileInputStream);

            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            while(rowIterator.hasNext()) {

                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();

                while(cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();
                    
                    switch(cell.getCellType()) {

                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;

                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "s");
                            break;
                    }

                    System.out.println("");
                }

                fileInputStream.close();

            }



        }
        catch (IOException ioe) {
            System.out.println("IO ERROR OCCURED!");
            ioe.printStackTrace();
        }
    }

}
