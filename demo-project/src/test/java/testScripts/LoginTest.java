package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base{

	@Test (priority=1)
	void LoginWithCorrectCredentails()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(usernamevalue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(passwordvalue);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			System.out.println("submit");
		
			String nav=driver.getCurrentUrl();
			Assert.assertEquals(nav, "https://groceryapp.uniqassosiates.com/admin");
		   
		
	}
	
	@Test (priority=2)
	void LoginIncorrectPassword()
	{
		String usernamevalue="admin";
		String passwordvalue="admin123455";
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(usernamevalue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(passwordvalue);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
	}
	@Test(priority=3)
	void LoginIncorrectUsername()
	{
		String usernamevalue="admin24567";
		String passwordvalue="admin";
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(usernamevalue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(passwordvalue);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
	}
	@Test(priority=4)
	void LogininIncorrectUsernamepwd()
	{
		String usernamevalue="admin67888";
		String passwordvalue="admin36776";
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(usernamevalue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(passwordvalue);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
	}
	
}
