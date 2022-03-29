package study.testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingNWritingExcel {
    public static void main (String [] args) throws IOException{
//Path of the excel file
        FileInputStream fs = new FileInputStream("/Users/sveeramalla@unomaha.edu/documents/vidhya/Jobs applied.xlsx");
//Creating a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
       // System.out.println(sheet.getRow(0).getCell(0));
        //System.out.println(row.getCell(0));
        System.out.println(cell);
        Row row1 = sheet.getRow(1);
        Cell cell1 = row1.getCell(1);
        System.out.println(sheet.getRow(0).getCell(1));
        Row row2 = sheet.getRow(1);
        Cell cell2 = row2.getCell(1);
        System.out.println(sheet.getRow(1).getCell(0));
        Row row3 = sheet.getRow(1);
        Cell cell3 = row3.getCell(1);
        System.out.println(sheet.getRow(1).getCell(1));
//String cellval = cell.getStringCellValue();
//System.out.println(cellval);
    }
}
