package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.ForgotPassword;
import pom.LoginOrSignUpPage;

public class AmezonTest1 {
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private ForgotPassword forgotPassword;
	
	
	 @Parameters ("browser")
		@BeforeTest
		public void launchBrowser(String browserName) {
			System.out.println("Before Test");
			if (browserName.equals("Chrome"))
			{
				driver= new ChromeDriver();
			}
			else
			{
				driver = new FirefoxDriver();
			}
		    driver.manage().window().maximize();
		}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
		forgotPassword =new ForgotPassword(driver);
	}
	@BeforeMethod
	public void launchForgotPasswordPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.sendUserName("Velocity@1234");
		loginOrSignUpPage.sendPassword("1234567892");
		loginOrSignUpPage.clickForgotPasswordButton();
		
	}
	
	@Test
	public void verifyPasswordShouldBeChangedSuccessfully() {
		System.out.println("Test 1");
		ForgotPassword forgotPassword = new ForgotPassword(driver);
		forgotPassword.sendEmailOrPhoneNo("velocity@1234");
		forgotPassword.clickOnSearchButton();
		
	}
	
	@Test
	public void verifyErrorMessagePasswordFunctilotyIsUsed() {
		System.out.println("Test 1");
		ForgotPassword forgotPassword = new ForgotPassword(driver);
		forgotPassword.sendEmailOrPhoneNo("bjhdfbhjsd");
		forgotPassword.clickOnSearchButton();
		
	}
	@AfterMethod
	public void captureScreenshortOfFailedTest() {
		System.out.println("After Method");
	System.out.println("Take the schreenshort of failed test");
	}
	@AfterClass
	public void afterClass() {
	}
	
	@AfterTest
	public void closedBrowser() {
		System.out.println("After Test");
		driver.close();
	}
	
}




