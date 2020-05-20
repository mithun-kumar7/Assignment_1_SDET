package com.qa.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase;



public class DroppablePage extends TestBase {
	private static Logger logger=LogManager.getLogger(HomePage.class);
	
	public DroppablePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='draggable']")
	WebElement src;
	
	@FindBy(xpath = "//div[@id='droppable']")
	WebElement dest;
	
	@FindBy(xpath = "//div[@id='droppable']//p")
	WebElement dropped;
	
	public void dragAndDrop() {
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
		logger.info("Drag and Drop action is performed.");
	}
	
	public String afterDragging() {
		return dropped.getText();
	}

}
