package com.qa.pageObjects;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase;



public class HomePage extends TestBase {
	
	private static Logger logger=LogManager.getLogger(HomePage.class);
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Selectable')]")	WebElement selectable;
	
	@FindBy(xpath = "//a[contains(text(),'HTML contact form')]")	WebElement contactForm;
	
	@FindBy(xpath = "//a[contains(text(),'Droppable')]")	WebElement droppable;
	
	@FindBy(xpath = "//a[contains(text(),'Datepicker')]")	WebElement datepicker;
	
	@FindBy(xpath = "//a[contains(text(),'Selectmenu')]")	WebElement selectmenu;
	
	@FindBy(xpath = "//a[contains(text(),'Controlgroup')]")		WebElement controlgroup;
	
	public String openInNewTab() {
		return Keys.chord(Keys.CONTROL, Keys.ENTER);
	}
	
	public void switchToWindow() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}
	
	public void clickOnSelectTable_link() {
		selectable.sendKeys(openInNewTab());
		logger.info("Clicked On Select Table link");
		switchToWindow();
	}
	
	public void clickOnContactForm_link() {
		contactForm.sendKeys(openInNewTab());
		logger.info("Clicked On Contact Form link");
		switchToWindow();
	}
	
	public void clickOnDroppable_link() {
		droppable.sendKeys(openInNewTab());
		logger.info("Clicked On Droppable link");
		switchToWindow();
	}
	
	public void clickOnDatepicker_link() {
		datepicker.sendKeys(openInNewTab());
		logger.info("Clicked On Date picker link");
		switchToWindow();
	}
	
	public void clickOnSelectMenu_link() {
		selectmenu.sendKeys(openInNewTab());
		logger.info("Clicked On Select menu link");
		switchToWindow();
	}
	
	public void clickOnControlGroup_link() {
		controlgroup.sendKeys(openInNewTab());
		logger.info("Clicked On Control group link");
		switchToWindow();
	}

}
