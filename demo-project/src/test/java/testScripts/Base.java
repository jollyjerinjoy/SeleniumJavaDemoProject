package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver; //declaring globally so that every methods can use this
	@BeforeMethod
	public void browserInitialization() {
		//WebDriver driver=new ChromeDriver();
		//Global – in framework, base class. After loading url. Since it si base class – applicable to all. Static wait.
		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		//driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize()	;
		//driver.close();
		//driver.quit();
		}
	@AfterMethod
	public void browserClose()   {
	//	driver.close(); //closes only the current page
	//	driver.quit();//closes all the pages in the window   - use quit
	}
		
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Base base=new Base();
	//	base.browserInitialization();
	//	}

}