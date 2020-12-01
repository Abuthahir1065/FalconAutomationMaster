package com.atmecs.SauceDemoWebsiteProject.pages;

import com.atmecs.falcon.automation.ui.selenium.Browser;

public class BasePage {
	Browser browser;

	public BasePage(Browser browser) {
		this.browser = browser;
	}

	public void navigate(String appUrl, String os, String osVersion, String br, String browserVersion) {
		browser.openURL(appUrl, os, osVersion, br, browserVersion);
	}

}
