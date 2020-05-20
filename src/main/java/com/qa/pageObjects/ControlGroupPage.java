package com.qa.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase;



public class ControlGroupPage extends TestBase {
	
	private static Logger logger=LogManager.getLogger(HomePage.class);

	public ControlGroupPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ui-id-8-button")
	WebElement carType_value;

	@FindBy(xpath = "//div[@class='controlgroup-vertical ui-controlgroup ui-controlgroup-vertical']//label[@class='ui-button ui-widget ui-checkboxradio-radio-label ui-checkboxradio-label ui-controlgroup-item'][contains(text(),'Standard')]")
	WebElement specific;

	@FindBy(xpath = "//input[@id='vertical-spinner']")
	WebElement noOfCars;

	@FindBy(xpath = "//button[@id='book']")
	WebElement bookNow_btn;

	@FindBy(xpath = "//label[@for='insurance-v']//span[@class='ui-checkboxradio-icon-space']")
	WebElement insurance_checkBox;

	public WebElement selectCar(String car) {
		return driver.findElement(By.xpath("//ul[@id='ui-id-8-menu']//li//div[text()='" + car + "']"));
	}

	public void bookStandardCar(String carType, int number) throws InterruptedException {
		carType_value.click();
		selectCar(carType).click();
		specific.click();
		String numberString = String.valueOf(number);
		noOfCars.sendKeys(numberString);
		bookNow_btn.click();
		insurance_checkBox.click();
		Thread.sleep(2000);
		logger.info("Car Rental");
	}
}
