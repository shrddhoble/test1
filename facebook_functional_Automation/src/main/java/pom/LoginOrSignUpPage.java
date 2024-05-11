package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginOrSignUpPage {
	//variable -private=>webElement
	
	@FindBy(xpath = ("input[@name='email']"))
    private WebElement search;	
			
	@FindBy(xpath = ("//a[text()='Forgotten password']"))
	private WebElement forgotPasswordLink;	
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement username;
	
	@FindBy(xpath = ("//input[@type='password']"))
	private WebElement password;
	
	@FindBy(xpath = ("//button[@name='login']"))
	private WebElement logInButton;
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement createNewAccButton;
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement day	;	
	
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement month;	
	
		private WebDriver driver;
		private WebDriverWait wait;
		private Actions act;
	
	//constructor-public=>action on webelement
	public LoginOrSignUpPage(WebDriver driver)
	{
		this.driver =driver;
		//wait= new WebDriverWait(driver,Duration)
		act = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	//method -public=>action on webElement
	public void clickOnLoginButton()
	{
		//Actions act = new Actions(driver);
		act.moveToElement(logInButton).click().build().perform();
	}
	
	 public void clickOncreateNewAccButton() {
		//Actions act = new Actions(driver);
		 createNewAccButton.click();
	 }
	 
	 //OR
	 //group of action
	 public void login() {
		 username.sendKeys("sonu@gmail.com");
	    password.sendKeys("123456789");
	    logInButton.click();
			
}		
			
			
	
	
	

}
