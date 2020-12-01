package com.atmecs.SauceDemoWebsiteProject.testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.atmecs.SauceDemoWebsiteProject.constant.FilePathConstants;
import com.atmecs.falcon.automation.util.parser.XlsReader;

public class CheckOutDataProvider {
	@DataProvider(name = "checkOutData")

	public static Object[][] getCheckOutXlsData() {
		XlsReader xlsReader = new XlsReader();
		try {
			xlsReader.setPath(FilePathConstants.XLS_CHECKOUT_FILE_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sheetName = "CheckOutSheet";
		int rowCount = xlsReader.getRowCount(sheetName);
		
		Object[][] data = new Object[rowCount][1];
		for (int rowIndex = 1; rowIndex < rowCount + 1; rowIndex++) {
			SwagLabsUserCheckOut userCheckOut=new SwagLabsUserCheckOut();
			userCheckOut.setFirstName(xlsReader.getCellDataByColumnIndex(sheetName, 0, rowIndex));
			userCheckOut.setLastName(xlsReader.getCellDataByColumnIndex(sheetName, 1, rowIndex));
			userCheckOut.setPostalCode(xlsReader.getCellDataByColumnIndex(sheetName, 2, rowIndex));
			
				data[rowIndex - 1][0] = userCheckOut;
			}

		
		return data;
	}
}
