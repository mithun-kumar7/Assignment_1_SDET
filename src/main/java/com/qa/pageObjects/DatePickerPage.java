package com.qa.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase;

public class DatePickerPage extends TestBase {

	private static Logger logger = LogManager.getLogger(HomePage.class);

	public DatePickerPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='datepicker']")
	WebElement dateMenu;

	@FindBy(xpath = "//span[@class='ui-datepicker-month']")
	WebElement monthEle;

	@FindBy(xpath = "//span[@class='ui-datepicker-year']")
	WebElement yearEle;

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
	WebElement prevBtn;

	public void enterDOB(String day, String month, String Year) {
		dateMenu.click();
		while (true) {
			String currentMonth = monthEle.getText();
			String currentYear = yearEle.getText();
			if (currentMonth.equals(month) && currentYear.equals(Year)) {
				break;
			}

			else {
				prevBtn.click();
			}
		}
		driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']//tbody//tr//td//a)[" + day + "]"))
				.click();

		logger.info("Date of Birth is selected");
	}

}
