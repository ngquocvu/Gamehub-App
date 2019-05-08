/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DTO.DTO_Product;
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
                    product.setId(cell.getStringCellValue());
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
                    product.setPublisherID(cell.getStringCellValue());
                    break;
               case 5:
                    product.setPlatform(cell.getStringCellValue());
                    break;
               case 6:
                    product.setGenreID(cell.getStringCellValue());
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
