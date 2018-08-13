package com.insta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insta.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(name = "username")
	public WebElement userName;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath="//button[.='Log in']")
	public WebElement logInButton;
	
	@FindBy(xpath="//a[.='Not Now']")
	public WebElement notNow;




	//Login method @ Yaroslav
	public void InstaLogIn(String name , String pass) {
		userName.sendKeys( name );
		password.sendKeys(pass);
		logInButton.click();
	}
	
	
}

