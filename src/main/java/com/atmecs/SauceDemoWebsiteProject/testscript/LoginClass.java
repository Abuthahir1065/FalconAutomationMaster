package com.atmecs.SauceDemoWebsiteProject.testscript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.SauceDemoWebsiteProject.pages.LoginPage;
import com.atmecs.SauceDemoWebsiteProject.testsuite.SampleTestSuiteBase;
import com.atmecs.SauceDemoWebsiteProject.testdata.LoginDataProvider;
import com.atmecs.SauceDemoWebsiteProject.testdata.SwagLabsUserLogin;
import com.atmecs.falcon.automation.util.parser.PropertyParser;

public class LoginClass extends SampleTestSuiteBase {

	String appUrl = PropertyParser.readEnvOrConfigProperty("appUrl");

	@BeforeMethod
	@Parameters({ "os", "osVersion", "browser", "browserVersion" })
	public void initBrowser(String os, String osVersioin, String br, String browserVersion) {
		this.os = os;
		this.osVersion = osVersion;
		this.br = br;
		this.browserVersion = browserVersion;

	}

//	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
//	public void loginTest(String userName, String password) {
//		LoginPage loginPage = new LoginPage(browser);
//		loginPage.navigate(appUrl, os, osVersion, br, browserVersion);
//		loginPage.login(userName, password);
//
//	}
	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void loginTest(SwagLabsUserLogin userLogin)
	{
		LoginPage loginPage = new LoginPage(browser);
		loginPage.navigate(appUrl, os, osVersion, br, browserVersion);
		loginPage.login(userLogin.getUserName(), userLogin.getPassword());
	}
	
	
}
