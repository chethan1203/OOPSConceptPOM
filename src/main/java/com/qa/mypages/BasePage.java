package com.qa.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void waitForElementPresent(By locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForPageTitle(String Title) {
		// TODO Auto-generated method stub
		
	}

}
