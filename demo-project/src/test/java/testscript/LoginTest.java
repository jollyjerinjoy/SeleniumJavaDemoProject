package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test(priority=1)
	public void verifyloginwithvalidcredentails()
	{
		String user="admin"; //webelement, method in page class
		String passwd="admin";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
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
	}
}
