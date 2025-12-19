package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
//POM -page factory-login has two class page class and test class.
//page factory used to locate WebWlements , used "finbBy
//WebElements and methods	
	    public WebDriver driver;
		@FindBy(xpath="//input[@name='username']")WebElement username;
		@FindBy(xpath="//input[@name='password']")WebElement password;
		@FindBy(xpath="//button[@type='submit']")WebElement submit;
		@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
		@FindBy(xpath="//div[contains(@class,'alert alert-danger alert-dismissible')]")WebElement alert;
public LoginPage(WebDriver driver) {
		this.driver=driver; //assign current class driver to global driver
		PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
		//to initialise webelements we use initElements.
		}
public void enterTheUsername(String user)
{
	username.sendKeys(user);
}
public void enterThePasword(String passwd)
{
password.sendKeys(passwd);
}
public void signin()
{
	submit.click();
}

public boolean isHomePageDisplayed()
{
			return dashboard.isDisplayed();
}

public boolean isAlertDisplayed()
{
			return alert.isDisplayed();

}
}