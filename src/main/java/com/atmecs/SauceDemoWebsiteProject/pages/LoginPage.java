package com.atmecs.SauceDemoWebsiteProject.pages;

import com.atmecs.SauceDemoWebsiteProject.constant.FilePathConstants;
import com.atmecs.SauceDemoWebsiteProject.utils.PropertyReader;
import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;

public class LoginPage extends BasePage {
	private ReportLogService report = new ReportLogServiceImpl(LoginPage.class);
	PropertyReader loginProperty = new PropertyReader(FilePathConstants.LOCATOR_FILE_PATH);

	public LoginPage(Browser browser) {
		super(browser);

	}

	public void login(String userName, String password) {
		report.info("Entering UserName and Password");
		browser.getTextField().enterTextField(LocatorType.XPATH, loginProperty.get("userNameXpath"), userName);
		browser.getTextField().enterTextField(LocatorType.XPATH, loginProperty.get("passwordXpath"), password);
		report.info("Clicking Login Button");
		browser.getClick().performClick(LocatorType.XPATH, loginProperty.get("loginButtonXpath"));

	}

}
