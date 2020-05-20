package com.qa.testCases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.TestBase;
import com.qa.pageObjects.ContactFormPage;
import com.qa.pageObjects.ControlGroupPage;
import com.qa.pageObjects.DatePickerPage;
import com.qa.pageObjects.DroppablePage;
import com.qa.pageObjects.HomePage;
import com.qa.pageObjects.SelectMenuPage;
import com.qa.pageObjects.SelectTablePage;



public class AllActivitiesTest extends TestBase {
	
	private static Logger logger=LogManager.getLogger(HomePage.class);
	
	HomePage homepage;
	SelectTablePage selectTablePage;
	ContactFormPage contactPage;
	DroppablePage droppablePage;
	DatePickerPage datePickerPage;
	SelectMenuPage selectMenuPage;
	ControlGroupPage controlGroupPage;

	@BeforeMethod
	public void setup(Method m) throws IOException {
		initialise();
		homepage = new HomePage();
		selectTablePage = new SelectTablePage();
		contactPage = new ContactFormPage();
		droppablePage = new DroppablePage();
		datePickerPage = new DatePickerPage();
		selectMenuPage = new SelectMenuPage();
		controlGroupPage = new ControlGroupPage();
		System.out.println("\n"+"********** starting test: *********"+m.getName()+"***********"+"\n");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("Browser is closed");
	}

	@Test
	public void selectTableTest() {
		homepage.clickOnSelectTable_link();
		System.out.println("Selected Items are follows: ");
		System.out.println(selectTablePage.select1Item());
		System.out.println(selectTablePage.select2Item());
		System.out.println(selectTablePage.select3Item());
		System.out.println(selectTablePage.select4Item());
		System.out.println(selectTablePage.select5Item());
		System.out.println(selectTablePage.select6Item());
		System.out.println(selectTablePage.select7Item());
	}

	@Test
	public void contactFormTest() throws InterruptedException {
		homepage.clickOnContactForm_link();
		contactPage.enterFirstName("Mithun");
		contactPage.enterLastName("kumar");
		contactPage.enterCountryName("India");
		contactPage.clickOn1stLink();
		contactPage.clickOn2ndLink();
		contactPage.enterSubject("Hi! How are You??");
		contactPage.clickOnSUbmitBtn();
		Thread.sleep(3000);
	}

	@Test
	public void dragAndDropTest() throws InterruptedException {
		homepage.clickOnDroppable_link();
		droppablePage.dragAndDrop();
		Thread.sleep(3000);
		System.out.print("After Dropping the text is: ");
		System.out.println(droppablePage.afterDragging());
		Thread.sleep(3000);
	}

	@Test
	public void datePickerTest() {
		homepage.clickOnDatepicker_link();
		datePickerPage.enterDOB("3", "September", "1995");
	}

	@Test
	public void selectMenuTest() throws InterruptedException {
		homepage.clickOnSelectMenu_link();
		selectMenuPage.selectSpeed();
		selectMenuPage.selectFile();
		selectMenuPage.selectNumber();
		selectMenuPage.selectTitle();
	}

	@Test
	public void rentCarTest() throws InterruptedException {
		homepage.clickOnControlGroup_link();
		controlGroupPage.bookStandardCar("SUV", 2);
	}

}
