package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/header/div[3]/a[2]")WebElement settings;
	@FindBy(xpath="//*[@id=\"settingsBox\"]/div/p[1]/a") WebElement login;
	@FindBy(xpath="//*[@id=\"CustomerEmail\"]") WebElement emailid;
	@FindBy(xpath="//*[@id=\"CustomerPassword\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div/input") WebElement signin;

	public void logincheck()
	{  
		login.click();    
		
	}
	public void setvalues(String email,String pswd)
	{  
		login.click();
		emailid.sendKeys(email);
		password.sendKeys(pswd);
		signin.click();
}
}
