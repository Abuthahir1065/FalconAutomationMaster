/***
 *
 */
package com.atmecs.SauceDemoWebsiteProject.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.falcon.automation.ui.selenium.Browser;

public class SampleTestSuiteBase {
	public String os, osVersion, br, browserVersion;
	public Browser browser;

	@BeforeMethod
	public void preSetup() {
		browser = new Browser();
	}

	@AfterMethod
	public void teardown() {
		browser.closeBrowser();
	}

}