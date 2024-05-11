package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = ("//input[@type='text']"))
	private WebElement username;
	
	@FindBy(xpath =("//input[@type='password']")) 
	private WebElement password;
	

	@FindBy(xpath =("//button[@name='login'])"))
	private WebElement login;
	
	@FindBy(xpath =("//a[text()='Create new account']"))
	private WebElement createNewAcc;

	@FindBy(xpath =("//a[text()='Forgotten password?']"))
	private WebElement forgotpass;
	
	public HomePage(WebDriver driver) {//constructor___________
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendusername(String userId) {
	username.sendKeys(userId);
	}
	
	public void ckpass(String pass) {
		password.sendKeys(pass);
	}
		
		public void loginCk() {
			login.click();
		}

		public void createacc() {
			createNewAcc.click();

}
		public void frogatepswd() {
			forgotpass.click();
		}
}


