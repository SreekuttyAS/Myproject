package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registrationpage{
	WebDriver driver;
   public Registrationpage(WebDriver driver)
  {
	this.driver=driver;
	PageFactory.initElements(driver, this);
  }
   @FindBy(xpath="//*[@id=\"header\"]/header/div[3]/a[2]")WebElement settings;
   @FindBy(xpath="//*[@id=\"settingsBox\"]/div/p[2]/a")WebElement registernow;
   @FindBy(xpath="//*[@id=\"FirstName\"]")WebElement firstname; 
   @FindBy(xpath="//*[@id=\"LastName\"]")WebElement lastname;
   @FindBy(xpath="//*[@id=\"RegisterForm-email\"]")WebElement email;
   @FindBy(xpath="//*[@id=\"RegisterForm-password\"]")WebElement password;
   @FindBy(xpath="//*[@id=\"RegisterForm\"]/p[2]/input")WebElement submit;
   
   
   public void createaccount()
	{
		settings.click();
		registernow.click();
		firstname.sendKeys("abc");
		lastname.sendKeys("def");
		email.sendKeys("adef518568800@gmail.com");
		password.sendKeys("abc@2856000");
		submit.click();
		
		
	}



}
