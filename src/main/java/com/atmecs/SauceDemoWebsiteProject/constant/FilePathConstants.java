package com.atmecs.SauceDemoWebsiteProject.constant;

import java.io.File;

public class FilePathConstants {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;

	public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "main" + File.separator
			+ "resources" + File.separator;

	public final static String LOCATOR_HOME = RESOURCES_HOME + "locators" + File.separator;
	public final static String ATMECS_HOME = LOCATOR_HOME + "atmecs" + File.separator;

	public final static String LIB_HOME = USER_HOME + "lib" + File.separator;

	public final static String LOCATOR_FILE_PATH = ATMECS_HOME + "Locators.properties";
	public final static String XLS_LOGIN_FILE_PATH = RESOURCES_HOME + "xlsFile" + File.separator + "LoginData.xlsx";
	public final static String XLS_CHECKOUT_FILE_PATH = RESOURCES_HOME + "xlsFile" + File.separator
			+ "CheckOutData.xlsx";

}
