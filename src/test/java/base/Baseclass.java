package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;

	@BeforeTest
	public void setup()
	{
		
	    driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
	
		driver.get("https://filpz.com/");
		driver.manage().window().maximize();
		
	
	}


}
