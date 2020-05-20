package com.qa.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase;

public class SelectMenuPage extends TestBase {
	
	private static Logger logger=LogManager.getLogger(TestBase.class);

	public SelectMenuPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "speed")
	WebElement speed;

	@FindBy(id = "files")
	WebElement fileType;

	@FindBy(id = "number")
	WebElement number;

	@FindBy(id = "salutation")
	WebElement title;

	@FindBy(id = "speed-button")
	WebElement speed_dpdown;

	@FindBy(id = "files-button")
	WebElement fileType_dpdown;

	@FindBy(id = "number-button")
	WebElement number_dpdown;

	@FindBy(id = "salutation-button")
	WebElement title_dpdown;

	public WebElement getDropDownValue(int a) {
		return driver.findElement(By.xpath("(//li[@class='ui-menu-item']//div)["+a+"]"));
	}
	
	public void selectSpeed() {
		Select s = new Select(speed);
		int count = s.getOptions().size();
		for (int i = 1; i <= count; i++) {
			speed_dpdown.click();
			getDropDownValue(i).click();
		}
		logger.info("Speed is selected");
	}

	public void selectFile() {
		driver.navigate().refresh();
		Select s = new Select(fileType);
		int count = s.getOptions().size();
		for (int i = 1; i <= count; i++) {
			fileType_dpdown.click();
			getDropDownValue(i).click();
		}
		logger.info("File is selected");
	}

	public void selectNumber() throws InterruptedException {
		driver.navigate().refresh();
		for (int i = 1; i <= 6; i++) {
			number_dpdown.click();
			getDropDownValue(i).click();
		}
		logger.info("Number is selected");
	}

	public void selectTitle() {
		driver.navigate().refresh();
		Select s = new Select(title);
		int count = s.getOptions().size();
		for (int i = 1; i <= count-1; i++) {
			title_dpdown.click();
			getDropDownValue(i).click();
		}
		logger.info("Title is selected");
	}

}
