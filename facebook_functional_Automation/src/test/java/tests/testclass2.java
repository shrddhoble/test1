package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testclass2 {
	private WebDriver driver;
	private SoftAssert soft;
	
		public void launchBrowser() {
			System.out.println("Before Class");
			
		}
		
		@BeforeMethod
		public void launchForgotPasswordPage() {
			System.out.println("Before Method");
			soft =new SoftAssert();
			
		}
		
		@Test(priority = -1)
		public void verifyHomePage() {
			System.out.println("Test 4");
			String  actualUrl = "www.facebook.com/home";
			String expectedIURL = "www.faebook.com/hom";
			String actualTital = "Facebook1-home Page";
			String expectedTital= "Facebook1-Home Pag";
			soft.assertEquals(actualUrl,expectedIURL);
			
			soft.assertEquals(actualTital, expectedTital);
			soft.assertAll();
			
		}
		
		@Test(priority=1)
		public void verifySettingPage() {
			System.out.println("Test 2");
			String  actualUrl = "www.facebook.com/setting";
			String expectedIURL = "www.faebook.com/setng";
			String actualTital = "Facebook1-settng";
			String expectedTital= "Facebook1-setting";
			soft.assertEquals(actualUrl,expectedIURL);
			
			soft.assertEquals(actualTital, expectedTital);
			soft.assertAll();	
		}
		@AfterClass
		public void captureScreenshortOfFailedTest() {
			System.out.println("After Class");
		System.out.println("Take the scfreenshort of failed test");
		}
		
		@AfterMethod
		public void closedBrowser() {
			System.out.println("After Method");
			driver.close();
		}
	
		
		
		
	}

