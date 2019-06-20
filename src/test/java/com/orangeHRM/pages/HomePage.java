package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.utils.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//li[text()='Dashboard']")
	public WebElement dashboardText;
	
	@FindBy(partialLinkText="PIM")
    public WebElement PIM;
	
    @FindBy(partialLinkText="Add Employee")
    public WebElement addEmployee;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
