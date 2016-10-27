package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class YandexMail {
	
	WebDriver driver;

	
	@FindBy(name = "login")
	private  WebElement login;
	
	@FindBy(name = "passwd")
	private  WebElement passwd;
	
	YandexMail(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void loginTo (String username,String userpass ){
		login.sendKeys(username);
		passwd.sendKeys(userpass);
		passwd.submit();
	}

}
