package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test
	public void verifyTheUserisAbleToLoginUsingValidCredentails()
	{
		String user="admin"; //webelment, method in page class
		String passwd="admin";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
	}

}
