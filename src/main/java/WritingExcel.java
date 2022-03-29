package study.testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcel {
    public static void main(String[] args) throws IOException {
        //String path = "//Users/sveeramalla@unomaha.edu/documents/vidhya/TestingPurpose.xlsx";
        FileInputStream fs = new FileInputStream("/Users/sveeramalla@unomaha.edu/documents/vidhya/TestingPurpose.xlsx");
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sheet1 = wb.getSheetAt(0);
        int lastRow = sheet1.getLastRowNum();
        for(int i=0; i<=lastRow; i++){
            Row row = sheet1.getRow(i);
            Cell cell = row.createCell(2);

            cell.setCellValue("WriteintoExcel");

        }

       FileOutputStream fos = new FileOutputStream("/Users/sveeramalla@unomaha.edu/documents/vidhya/TestingPurpose.xlsx");
        wb.write(fos);
        fos.close();
    }
}
