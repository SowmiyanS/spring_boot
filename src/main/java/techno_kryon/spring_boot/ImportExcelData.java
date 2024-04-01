package techno_kryon.spring_boot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
public class ImportExcelData {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @Value("${excel-file-path}")
    private String filePath; 

    Logger logger = LoggerFactory.getLogger(ImportExcelData.class);

    @PostConstruct
    public void importExcelData() {
        try {
            //FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            FileInputStream fileInputStream = new FileInputStream(ResourceUtils.getFile("classpath:data.xlsx"));

            logger.info("Successfully Opened Excel File");
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            Sheet employeeSheet = workbook.getSheetAt(0);
            Sheet departmentSheet = workbook.getSheetAt(1);

            for(Row row: departmentSheet) {
                if(row.getRowNum() == 0) continue;
                Department department = new Department();
                department.setDepartmentId((int)row.getCell(0).getNumericCellValue());
                department.setDepartmentName(row.getCell(1).getStringCellValue());
                department.setLocation(row.getCell(2).getStringCellValue());
                departmentService.createDepartment(department);
            }

            for(Row row : employeeSheet) {
                if(row.getRowNum() == 0) continue;
                Employee employee = new Employee();
                employee.setEmployeeId((int)row.getCell(0).getNumericCellValue());
                employee.setEmployeeName(row.getCell(1).getStringCellValue());
                employee.setEmployeeEmail(row.getCell(2).getStringCellValue());
                employee.setEmployeeAge((int)row.getCell(3).getNumericCellValue());
                employee.setEmployeePhone((long)row.getCell(4).getNumericCellValue());
                employee.setEmployeePassword(row.getCell(5).getStringCellValue());
                Department department = departmentService.getDepartment((int)row.getCell(6).getNumericCellValue()).orElseThrow(() -> new RuntimeException("Department id : "+row.getCell(6).getNumericCellValue()+" is not found!"));
                employee.setDepartment(department);
                employeeService.createEmployee(employee);
            }

            logger.info("Completed reading Excel file and stored results to the database");
            workbook.close();
            fileInputStream.close();
        }
        catch (IOException ioe) {
            System.out.println("IO ERROR OCCURED!");
            ioe.printStackTrace();
        }
    }
}

