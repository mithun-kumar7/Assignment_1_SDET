package com.qa.testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.TestBase;
import com.qa.pageObjects.HomePage;


public class HomePageTest extends TestBase{
	
	HomePage homepage;
	
	@BeforeMethod
	public void setup() throws IOException {
		initialise();
		homepage=new HomePage();		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void selectTableTest() {
		homepage.clickOnSelectTable_link();
	}
	
	@Test
	public void contactFormTest() {
		homepage.clickOnContactForm_link();
	}
	
	@Test
	public void droppableTest() {
		homepage.clickOnDroppable_link();
	}
	
	@Test
	public void DatePickerTest() {
		homepage.clickOnDatepicker_link();
	}
	
	@Test
	public void selectMenuTest() {
		homepage.clickOnSelectMenu_link();
	}
	
	@Test
	public void controlGroupTest() {
		homepage.clickOnControlGroup_link();
	}

}
