package com.insta.step_definitions;

import static org.junit.Assert.assertEquals;

import com.insta.pages.HomePage;
import com.insta.pages.LoginPage;
import com.insta.utilities.BrowserUtils;
import com.insta.utilities.ConfigurationReader;
import com.insta.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveLogin {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String email, String password) {
		loginPage.userName.sendKeys(email);
		loginPage.password.sendKeys(password);
	}

	@When("the user clicks on the Sign in link")
	public void the_user_clicks_on_the_Sign_in_link() {
		loginPage.logInButton.click();
		BrowserUtils.waitFor(2);
		loginPage.notNow.click();
	}
	
	@Then("label {string} should be displayed")
	public void label_should_be_displayed(String expectedLabel) {
	   //assertEquals(expectedLabel, homePage.WelcomeUserName.getText());
	}



}
