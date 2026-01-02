package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import utilities.ScreenshotUtility;

public class Base {
	public WebDriver driver; //declaring globally so that every methods can use this
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")  //Parameterization for multiple browser
	public void browserInitialization(String browser) throws Exception {
		if(browser.equalsIgnoreCase("chrome"))
		//WebDriver driver=new ChromeDriver();
		//Global – in framework, base class. After loading url. Since it si base class – applicable to all. Static wait.
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid browser");
		}

		
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		//driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize()	;
		//driver.close();
		//driver.quit();
		}
	@AfterMethod(alwaysRun=true)
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE)
		{
			ScreenshotUtility scrShot = new ScreenshotUtility(); // creating obj
			scrShot.getScreenShot(driver, iTestResult.getName());
		}
		driver.quit();
	////public void browserClose()   {
	//	driver.close(); //closes only the current page
	////driver.quit();//closes all the pages in the window   - use quit
	////}
		
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Base base=new Base();
	//	base.browserInitialization();
	//	}
	}
}