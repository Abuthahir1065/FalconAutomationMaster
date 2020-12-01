package com.atmecs.SauceDemoWebsiteProject.pages;

import com.atmecs.SauceDemoWebsiteProject.constant.FilePathConstants;
import com.atmecs.SauceDemoWebsiteProject.utils.PropertyReader;
import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;

public class BuyProductPage extends BasePage {
	private ReportLogService report = new ReportLogServiceImpl(LoginPage.class);
	PropertyReader Property = new PropertyReader(FilePathConstants.LOCATOR_FILE_PATH);

	public BuyProductPage(Browser browser) {
		super(browser);
	}

	public void buyProduct(String firstName, String lastName, String postalCode) {
		report.info("Product added to cart");
		browser.getClick().performClick(LocatorType.XPATH, Property.get("addToCartXpath"));
		browser.getClick().performClick(LocatorType.XPATH, Property.get("cartXpath"));
		browser.getClick().performClick(LocatorType.XPATH, Property.get("checkOutButtonXpath"));
		report.info("Entering Checkout Details ");
		browser.getTextField().enterTextField(LocatorType.XPATH, Property.get("firstNameXpath"), firstName);
		browser.getTextField().enterTextField(LocatorType.XPATH, Property.get("lastNameXpath"), lastName);
		browser.getTextField().enterTextField(LocatorType.XPATH, Property.get("postalCodeXpath"), postalCode);
		browser.getClick().performClick(LocatorType.XPATH, Property.get("continueButtonXpath"));
		browser.getClick().performClick(LocatorType.XPATH, Property.get("finishButtonXpath"));
		report.info("Product has been Ordered");

	}
}
