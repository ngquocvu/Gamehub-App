/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DTO.DTO_Customer;
import DTO.DTO_Product;
import DTO.DTO_Staff;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;

/**
 *
 * @author Vu Nguyen
 */
public class ExcelWriter {
    ExcelWriter(){}
    public void writeExcelForProduct(ArrayList<DTO_Product> products, String excelFilePath) throws IOException  {
        // Create Workbook
        Workbook workbook = getWorkbook(excelFilePath);
        if(workbook == null )
        {
         workbook = new HSSFWorkbook();  
        }
        // Create sheet
        Sheet sheet = workbook.createSheet("Products"); // Create sheet with sheet name
 
        int rowIndex = 0;
         
        // Write header
        writeProductHeader(sheet, rowIndex);
 
        // Write data
        rowIndex++;
        for (DTO_Product product : products) {
            // Create row
            Row row = sheet.createRow(rowIndex);
            // Write data on row
            writeProduct(product, row);
            rowIndex++;
        }
         
 
        // Auto resize column witdth
        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        autosizeColumn(sheet, numberOfColumn);
 
        // Create file excel
        createOutputFile(workbook, excelFilePath);
        JOptionPane.showMessageDialog(null,"Successully !\nDirectory: " + excelFilePath);
    }
    
    public void writeExcelForStaff(ArrayList<DTO_Staff> staffs, String excelFilePath) throws IOException  {
        // Create Workbook
        Workbook workbook = getWorkbook(excelFilePath);
        if(workbook == null )
        {
         workbook = new HSSFWorkbook();  
        }
        // Create sheet
        Sheet sheet = workbook.createSheet("Staffs"); // Create sheet with sheet name
 
        int rowIndex = 0;
         
        // Write header
        writeStaffHeader(sheet, rowIndex);
 
        // Write data
        rowIndex++;
        for (DTO_Staff staff : staffs) {
            // Create row
            Row row = sheet.createRow(rowIndex);
            // Write data on row
            writeStaff(staff, row);
            rowIndex++;
        }
         
 
        // Auto resize column witdth
        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        autosizeColumn(sheet, numberOfColumn);
 
        // Create file excel
        createOutputFile(workbook, excelFilePath);
        JOptionPane.showMessageDialog(null,"Successully !\nDirectory: " + excelFilePath);
    }
    
    
    public void writeExcelForCustomer(ArrayList<DTO_Customer> users, String excelFilePath) throws IOException  {
        // Create Workbook
        Workbook workbook = getWorkbook(excelFilePath);
        if(workbook == null )
        {
         workbook = new HSSFWorkbook();  
        }
        // Create sheet
        Sheet sheet = workbook.createSheet("Customers"); // Create sheet with sheet name
 
        int rowIndex = 0;
         
        // Write header
        writeCustomerHeader(sheet, rowIndex);
 
        // Write data
        rowIndex++;
        for (DTO_Customer user : users) {
            // Create row
            Row row = sheet.createRow(rowIndex);
            // Write data on row
            writeCustomer(user, row);
            rowIndex++;
        }
         
 
        // Auto resize column witdth
        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        autosizeColumn(sheet, numberOfColumn);
 
        // Create file excel
        createOutputFile(workbook, excelFilePath);
        JOptionPane.showMessageDialog(null,"Successully !\nDirectory: " + excelFilePath);
    }
    
    
    private static void writeProductHeader(Sheet sheet, int rowIndex) {
        // create CellStyle
        CellStyle cellStyle = createStyleForHeader(sheet);
         
        // Create row
        Row row = sheet.createRow(rowIndex);
         
        // Create cells
        Cell cell = row.createCell(0);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("ID");
 
        cell = row.createCell(1);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Name");
 
        cell = row.createCell(2);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Price");
 
        cell = row.createCell(3);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Quantity");
        
        cell = row.createCell(4);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Publisher");
        
        cell = row.createCell(5);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Platform");
        
        cell = row.createCell(6);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Genre");
 
        cell = row.createCell(7);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Release Year");
    }
    
     private static void writeStaffHeader(Sheet sheet, int rowIndex) {
        // create CellStyle
        CellStyle cellStyle = createStyleForHeader(sheet);
         
        // Create row
        Row row = sheet.createRow(rowIndex);
         
        // Create cells
        Cell cell = row.createCell(0);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("ID");
 
        cell = row.createCell(1);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("First Name");
 
        cell = row.createCell(2);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Last Name");
 
        cell = row.createCell(3);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Email");
        
        cell = row.createCell(4);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Password");
        
        cell = row.createCell(5);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Address");
        
        cell = row.createCell(6);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Phone number");
 
        cell = row.createCell(7);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Role");
        
        cell = row.createCell(8);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Sex");
    }
     
    private static void writeCustomerHeader(Sheet sheet, int rowIndex) {
        // create CellStyle
        CellStyle cellStyle = createStyleForHeader(sheet);
         
        // Create row
        Row row = sheet.createRow(rowIndex);
         
        // Create cells
        Cell cell = row.createCell(0);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("ID");
 
        cell = row.createCell(1);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("First Name");
 
        cell = row.createCell(2);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Last Name");
 
        cell = row.createCell(3);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Email");
        
        cell = row.createCell(4);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Password");
        
        cell = row.createCell(5);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Phone number");
 
    }
     
      
     
     
     private static CellStyle createStyleForHeader(Sheet sheet) {
        // Create font
        Font font = sheet.getWorkbook().createFont();
        font.setFontName("Arial");
        font.setBold(true);
        font.setColor(IndexedColors.BLACK.getIndex()); // text color
 
        // Create CellStyle
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        return cellStyle;
    }
    private static Workbook getWorkbook(String excelFilePath) throws IOException {
        Workbook workbook = null;
         if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook();
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }
 
        return workbook;
    }
    
    private static void writeProduct(DTO_Product product, Row row) {
         
        Cell cell = row.createCell(0);
        cell.setCellValue(product.getId());
 
        cell = row.createCell(1);
        cell.setCellValue(product.getName());
 
        cell = row.createCell(2);
        cell.setCellValue(product.getPrice());
 
        cell = row.createCell(3);
        cell.setCellValue(product.getQuantity());
        
        cell = row.createCell(4);
        cell.setCellValue(product.getPublisherID());
        
        cell = row.createCell(5);
        cell.setCellValue(product.getPlatform());
        
        cell = row.createCell(6);
        cell.setCellValue(product.getGenreID());
        
        cell = row.createCell(7);
        cell.setCellValue(product.getReleaseDate());

    }
    
    private static void writeStaff(DTO_Staff staff, Row row) {
         
        Cell cell = row.createCell(0);
        cell.setCellValue(staff.getId());
 
        cell = row.createCell(1);
        cell.setCellValue(staff.getFirstname());
 
        cell = row.createCell(2);
        cell.setCellValue(staff.getLastname());
 
        cell = row.createCell(3);
        cell.setCellValue(staff.getEmail());
        
        cell = row.createCell(4);
        cell.setCellValue(staff.getPassword());
        
        cell = row.createCell(5);
        cell.setCellValue(staff.getAddress());
        
        cell = row.createCell(6);
        cell.setCellValue(staff.getPhonenumber());
        
        cell = row.createCell(7);
        cell.setCellValue(staff.getRole());
        
        cell = row.createCell(8);
        cell.setCellValue(staff.getSex());

    }
    
    
        
    private static void writeCustomer(DTO_Customer customer, Row row) {
         
        Cell cell = row.createCell(0);
        cell.setCellValue(customer.getId());
 
        cell = row.createCell(1);
        cell.setCellValue(customer.getFirstname());
 
        cell = row.createCell(2);
        cell.setCellValue(customer.getLastname());
 
        cell = row.createCell(3);
        cell.setCellValue(customer.getEmail());
        
        cell = row.createCell(4);
        cell.setCellValue(customer.getPassword());
        
        cell = row.createCell(5);
        cell.setCellValue(customer.getPhonenumber());
        

    }
    
    // Auto resize column width
    private static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }
     
    // Create output file
    private static void createOutputFile(Workbook workbook, String excelFilePath) throws IOException {
        try (OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
        }
    }
    
}
