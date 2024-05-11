package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;
import pom.ForgotPassword;
import pom.LoginOrSignUpPage;

public class AmezonTest2 extends Base {
	
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private ForgotPassword forgotPassword;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		System.out.println("Before Test");
		System.out.println(browserName);
		if (browserName.equals("Chrome"))
		{
			//driver = Basse.openChromeBrowser();
			driver= openChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
			driver= openFirefioxBrowser();
		}
		if(browserName.equals("Edge"))
		{
			driver= openEdgeBrowser();
		}
	    driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void launchForgotPasswordPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.sendUserName("Velocity@1234");
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


