package com.qa.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase;



public class SelectTablePage extends TestBase {
	
	private static Logger logger=LogManager.getLogger(HomePage.class);

	public SelectTablePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[contains(text(),'Item 1')]")
	WebElement firstElement;

	@FindBy(xpath = "//li[contains(text(),'Item 2')]")
	WebElement secondElement;

	@FindBy(xpath = "//li[contains(text(),'Item 3')]")
	WebElement thirdElement;

	@FindBy(xpath = "//li[contains(text(),'Item 4')]")
	WebElement forthElement;

	@FindBy(xpath = "//li[contains(text(),'Item 5')]")
	WebElement fifthElement;

	@FindBy(xpath = "//li[contains(text(),'Item 6')]")
	WebElement sixthElement;

	@FindBy(xpath = "//li[contains(text(),'Item 7')]")
	WebElement seventhElement;

	public String select1Item() {
		firstElement.click();
		logger.info("First item id Selected");
		return firstElement.getText();
	}

	public String select2Item() {
		secondElement.click();
		logger.info("Second item id Selected");
		return secondElement.getText();
	}

	public String select3Item() {
		thirdElement.click();
		logger.info("Third item id Selected");
		return thirdElement.getText();
	}

	public String select4Item() {
		forthElement.click();
		logger.info("Fourth item id Selected");
		return forthElement.getText();
	}

	public String select5Item() {
		fifthElement.click();
		logger.info("Fifth item id Selected");
		return fifthElement.getText();
	}

	public String select6Item() {
		sixthElement.click();
		logger.info("Sixth item id Selected");
		return sixthElement.getText();
	}

	public String select7Item() {
		seventhElement.click();
		logger.info("Seventh item id Selected");
		return seventhElement.getText();
	}

}
