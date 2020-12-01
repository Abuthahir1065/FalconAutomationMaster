package com.atmecs.SauceDemoWebsiteProject.testscript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.SauceDemoWebsiteProject.pages.BuyProductPage;
import com.atmecs.SauceDemoWebsiteProject.testsuite.SampleTestSuiteBase;
import com.atmecs.SauceDemoWebsiteProject.testdata.CheckOutDataProvider;
import com.atmecs.SauceDemoWebsiteProject.testdata.SwagLabsUserCheckOut;
import com.atmecs.falcon.automation.util.parser.PropertyParser;

public class BuyProductClass extends SampleTestSuiteBase {

	String buyProductUrl = PropertyParser.readEnvOrConfigProperty("buyProductUrl");

	@BeforeMethod
	@Parameters({ "os", "osVersion", "browser", "browserVersion" })
	public void initBrowser(String os, String osVersioin, String br, String browserVersion) {
		this.os = os;
		this.osVersion = osVersion;
		this.br = br;
		this.browserVersion = browserVersion;

	}

	@Test(dataProvider = "checkOutData", dataProviderClass = CheckOutDataProvider.class)
	public void buyProductTest(SwagLabsUserCheckOut userCheckOut) {

		BuyProductPage buyProduct = new BuyProductPage(browser);
		buyProduct.navigate(buyProductUrl, os, osVersion, br, browserVersion);
		buyProduct.buyProduct(userCheckOut.getFirstName(), userCheckOut.getLastName(), userCheckOut.getPostalCode());

	}
}
