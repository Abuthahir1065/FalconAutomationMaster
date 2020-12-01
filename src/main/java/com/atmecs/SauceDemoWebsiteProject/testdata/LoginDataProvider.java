package com.atmecs.SauceDemoWebsiteProject.testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.atmecs.SauceDemoWebsiteProject.constant.FilePathConstants;
import com.atmecs.falcon.automation.util.parser.XlsReader;

public class LoginDataProvider {
	@DataProvider(name = "loginData")

	public static Object[][] getLoginXlsData() {
		XlsReader xlsReader = new XlsReader();
		try {
			xlsReader.setPath(FilePathConstants.XLS_LOGIN_FILE_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sheetName = "LoginSheet";
		int rowCount = xlsReader.getRowCount(sheetName);
	
		Object[][] data = new Object[rowCount][1];
		for (int rowIndex = 1; rowIndex < rowCount + 1; rowIndex++) {
			SwagLabsUserLogin userLogin=new SwagLabsUserLogin();
			userLogin.setUserName(xlsReader.getCellDataByColumnIndex(sheetName, 0, rowIndex));
			userLogin.setPassword(xlsReader.getCellDataByColumnIndex(sheetName, 1, rowIndex));
			
				data[rowIndex - 1][0] = userLogin;
			}

		
		return data;
	}
}

//public static Object[][] getLoginXlsData() {
//	XlsReader xlsReader = new XlsReader();
//	try {
//		xlsReader.setPath(FilePathConstants.XLS_LOGIN_FILE_PATH);
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	String sheetName = "LoginSheet";
//	int rowCount = xlsReader.getRowCount(sheetName);
//	int columnCount = xlsReader.getColumnCount(sheetName);
//	Object[][] data = new Object[rowCount][columnCount];
//	for (int rowIndex = 1; rowIndex < rowCount + 1; rowIndex++) {
//		for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
//			String value = xlsReader.getCellDataByColumnIndex(sheetName, columnIndex, rowIndex);
//			data[rowIndex - 1][columnIndex] = value;
//		}
//
//	}
//	return data;
//}