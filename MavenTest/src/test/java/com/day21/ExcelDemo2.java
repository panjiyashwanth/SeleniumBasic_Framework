package com.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {

		String path = "./data/book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String v = wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(v);
			}
		}

		//wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("bhanu");

		// wb.write(new FileOutputStream(path));

		//wb.write(new FileOutputStream("./data/Book2.xlsx"));

		wb.close();
	}

}
