package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	
	@FindBy(xpath = ("//table//td//div"))
	private WebElement message;
	
	@FindBy(xpath = ("//input[@type='text']"))
	private WebElement emailOrPhoneNumber;
	
	@FindBy(xpath = ("//a[@role='button'][1]"))
	private WebElement cancelButton ;
	
	@FindBy(xpath = ("//button[@id='did_submit']"))
	private WebElement searchButton ;
	
	//Constructor -public =>WebElement initialize
	public ForgotPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Method- public=>Action on WebElement
	public String getMessage () {
		return message.getText();
	}
	
	public void sendEmailOrPhoneNo(String userId) {
		emailOrPhoneNumber.sendKeys(userId);
	}
	
	public void clickOnCancleButton() {
		cancelButton.clear();
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
		
		
	}
	

}
