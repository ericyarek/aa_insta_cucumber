package com.insta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insta.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//div/a[.='Instagram']")
		    public WebElement WelcomeUserName;
		    
		  
	@FindBy(xpath="//span[@class='uDNXD']")
	public WebElement htmlPopOutCloseButton;
	
	@FindBy(xpath="//div/div/div/article/div[2]/section/span/button/span[.='Like']")
	public WebElement like;

}
