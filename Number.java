package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class Number {
    public Number(String out, String in) throws IOException {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(out));
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        Pattern p = Pattern.compile("^(\\+?\\d\\ \\(\\d{3}\\)\\ \\d{3}\\-\\d{2}\\-\\d{2})$");
        FileWriter n = new FileWriter(in);
        for(int i = 0; i<xssfSheet.getLastRowNum(); i++){
            String b = String.valueOf(xssfSheet.getRow(i).getCell(0));
            if(b.matches(String.valueOf(p))){
                n.write(b+"\n");
                n.flush();
            }
        }
    }
}