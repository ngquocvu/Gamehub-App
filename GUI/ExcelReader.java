/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DTO.DTO_Customer;
import DTO.DTO_Genre;
import DTO.DTO_Product;
import DTO.DTO_Publisher;
import DTO.DTO_Staff;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


/**
 *
 * @author Vu Nguyen
 */
public class ExcelReader {
    ExcelReader() {}
    public ArrayList<DTO_Product> readExcelForProduct(String excelFilePath) throws IOException {
        ArrayList<DTO_Product> array = new ArrayList<DTO_Product>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workproduct
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for product object
            DTO_Product product = new DTO_Product();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                // Set value for product object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                case 0:               
                    if(cell.getCellType().toString().equals("STRING"))
                                {
                                    product.setId(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    product.setId(String.valueOf(id));
                                }
                    break;  
                case 1:
                    product.setName(cell.getStringCellValue());
                    break;
                case 2:
                    product.setPrice((Double) cell.getNumericCellValue());
                    break;    
                case 3:
                     product.setQuantity((int) cell.getNumericCellValue());
                    break;
                case 4:                
                   if(cell.getCellType().toString().equals("STRING"))
                                {
                                    product.setPublisherID(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    product.setPublisherID(String.valueOf(id));
                                }
                    break;  
               case 5:
                    product.setPlatform(cell.getStringCellValue());
                    break;
               case 6:
                      if(cell.getCellType().toString().equals("STRING"))
                                {
                                    product.setGenreID(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    product.setGenreID(String.valueOf(id));
                                }
                    break;  
               case 7:
                    product.setReleaseDate(cell.getStringCellValue());
                    break;
                default:
                    break;
                }
 
            }
            array.add(product);
        }
 
        inputStream.close();
 
        return array;
    }
    
    public ArrayList<DTO_Staff> readExcelForStaff(String excelFilePath) throws IOException {
        ArrayList<DTO_Staff> array = new ArrayList<DTO_Staff>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workproduct
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for product object
            DTO_Staff staff = new DTO_Staff();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                // Set value for product object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                case 0:       
                        if(cell.getCellType().toString().equals("STRING"))
                                {
                                    staff.setId(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    staff.setId(String.valueOf(id));
                                }
                    
                    break;
                case 1:
                    staff.setFirstname(cell.getStringCellValue());
                    break;
                case 2:
                    staff.setLastname(cell.getStringCellValue());
                    break;    
                case 3:
                     staff.setEmail(cell.getStringCellValue());
                    break;
                case 4:                
                    staff.setPassword(cell.getStringCellValue());
                    break;
               case 5:
                    staff.setAddress(cell.getStringCellValue());
                    break;
               case 6:
                    if(cell.getCellType().toString().equals("STRING"))
                                {
                                    staff.setPhonenumber(cell.getStringCellValue());
                                }
                        else
                            {
                                int phoneNum = (int) cell.getNumericCellValue();
                                    staff.setPhonenumber(String.valueOf(phoneNum));
                                }
                    break;  
               case 7:
                    staff.setRole(cell.getStringCellValue());
                    break;
               case 8:
                    staff.setSex(cell.getStringCellValue());
                    break;    
                default:
                    break;
                }
 
            }
            array.add(staff);
        }
 
        inputStream.close();
 
        return array;
    }
    
    public ArrayList<DTO_Genre> readExcelForGenre(String excelFilePath) throws IOException {
        ArrayList<DTO_Genre> array = new ArrayList<DTO_Genre>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workproduct
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for product object
            DTO_Genre genre = new DTO_Genre();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                // Set value for product object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                case 0:       
                        if(cell.getCellType().toString().equals("STRING"))
                                {
                                    genre.setId(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    genre.setId(String.valueOf(id));
                                }
                    
                    break;
                 case 1:
                    genre.setName(cell.getStringCellValue());
                    break;  
                default:
                    break;
                }
 
            }
            array.add(genre);
        }
 
        inputStream.close();
 
        return array;
    }
    
       public ArrayList<DTO_Publisher> readExcelForPublisher(String excelFilePath) throws IOException {
        ArrayList<DTO_Publisher> array = new ArrayList<DTO_Publisher>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workproduct
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for product object
            DTO_Publisher publisher = new DTO_Publisher();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                // Set value for product object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                case 0:       
                        if(cell.getCellType().toString().equals("STRING"))
                                {
                                    publisher.setId(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    publisher.setId(String.valueOf(id));
                                }
                    
                    break;
                 case 1:
                    publisher.setName(cell.getStringCellValue());
                    break;  
                default:
                    break;
                }
 
            }
            array.add(publisher);
        }
 
        inputStream.close();
 
        return array;
    }
    
    public ArrayList<DTO_Customer> readExcelForCustomer(String excelFilePath) throws IOException {
        ArrayList<DTO_Customer> array = new ArrayList<DTO_Customer>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workproduct
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for product object
            DTO_Customer customer = new DTO_Customer();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                // Set value for product object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                case 0:               
                    if(cell.getCellType().toString().equals("STRING"))
                                {
                                    customer.setId(cell.getStringCellValue());
                                }
                        else
                            {
                                int id = (int) cell.getNumericCellValue();
                                    customer.setId(String.valueOf(id));
                                }
                    break;  
                case 1:
                    customer.setFirstname(cell.getStringCellValue());
                    break;
                case 2:
                    customer.setLastname(cell.getStringCellValue());
                    break;    
                case 3:
                     customer.setEmail(cell.getStringCellValue());
                    break;
                case 4:                
                    customer.setPassword(cell.getStringCellValue());
                    break;  
               case 5:
                    if(cell.getCellType().toString().equals("STRING"))
                                {
                                    customer.setPhonenumber(cell.getStringCellValue());
                                }
                        else
                            {
                                int phonenum = (int) cell.getNumericCellValue();
                                    customer.setPhonenumber(String.valueOf(phonenum));
                                }
               break;
              
                }
 
            }
            array.add(customer);
        }
 
        inputStream.close();
 
        return array;
    }
    
    
    
    // Get Workbook
    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }
 
        return workbook;
    }
 
   private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();
        Object cellValue = null;
        switch (cellType) {
        case BOOLEAN:
            cellValue = cell.getBooleanCellValue();
            break;
        case FORMULA:
            Workbook workbook = cell.getSheet().getWorkbook();
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            cellValue = evaluator.evaluate(cell).getNumberValue();
            break;
        case NUMERIC:
            cellValue = cell.getNumericCellValue();
            
            break;
        case STRING:
            cellValue = cell.getStringCellValue();
            break;
        case _NONE:
        case BLANK:
        case ERROR:
            break;
        default:
            break;
        }
 
        return cellValue;
    }
    
}
