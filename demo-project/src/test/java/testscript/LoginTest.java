package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test(priority=1)
	public void verifyloginwithvalidcredentails()
	{
		String user="admin"; //webelement, method in page class
		String passwd="admin";
		LoginPage loginpage=new LoginPage(driver);  //pass value driver 
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		boolean dashboardpage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(dashboardpage);  //hard assertion , classname.methodname
	}
	@Test(priority=2)
	public void verifylogininvalidpassword()
	{
		String user="admin"; //webelement, method in page class
		String passwd="admin234343";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		
		boolean alertpage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertpage); //hard assertion , classname.methodname
	}
	@Test(priority=3)
	public void verifylogininvalidusername()
	{
		String user="admin243546"; //webelement, method in page class
		String passwd="admin";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		boolean alertpage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertpage); //hard assertion , classname.methodname
	}
	@Test(priority=4)
	public void verifylogininvalidusernamepwd()
	{
		String user="admin243546w"; //webelement, method in page class
		String passwd="admindsdsdw";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		boolean alertpage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertpage); //hard assertion , classname.methodname
	}
}
