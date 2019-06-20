package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.utils.BaseClass;
import com.orangeHRM.utils.CommonMethods;

public class LoginPage extends BaseClass{
	//locating WebElement using @FindBy annotation
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(css="img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(xpath="//div[@class='toast-message']")
    public WebElement message;

	
	//initialize all of our variables
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String pwd) {
		CommonMethods.sendText(userName, uname);
		CommonMethods.sendText(password, pwd);
		CommonMethods.click(loginBtn);
	}
}
