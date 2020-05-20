package com.qa.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase;



public class ContactFormPage extends TestBase {
	
	private static Logger logger=LogManager.getLogger(TestBase.class);

	public ContactFormPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Your name..']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='lname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='country']")
	WebElement countryName;
	
	@FindBy(xpath = "//textarea[@id='subject']")
	WebElement subject;
	
	@FindBy(xpath = "//input[4]")
	WebElement submitBtn;

	@FindBy(partialLinkText = "Google Link")
	WebElement link1;

	@FindBy(partialLinkText = "Google Link is")
	WebElement link2;

	public String openInNewTab() {
		return Keys.chord(Keys.CONTROL, Keys.ENTER);
	}

	public void enterFirstName(String name1) {
		firstName.sendKeys(name1);
		logger.info("First name is entered");
	}

	public void enterLastName(String Name2) {
		lastName.sendKeys(Name2);
		logger.info("Last name is entered");
	}

	public void enterCountryName(String yourCountryName) {
		countryName.sendKeys(yourCountryName);
		logger.info("country name is entered");
	}
	
	public void enterSubject(String subjects) {
		subject.sendKeys(subjects);
		logger.info("Subject is entered");
	}
	
	public void clickOnSUbmitBtn() {
		submitBtn.click();
		logger.info("Clicked on submit button");
	}

	public void clickOn1stLink() {
		link1.isDisplayed();
		link1.sendKeys(openInNewTab());
		logger.info("First link is opened in next tab");
	}

	public void clickOn2ndLink() {
		link2.isDisplayed();
		link2.sendKeys(openInNewTab());
		logger.info("Second link is opened in next tab");
	}
}
