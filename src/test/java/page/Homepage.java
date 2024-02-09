package page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/header/h1/a/img") WebElement logo;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[1]/a") WebElement iphones;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[1]/ul/li[5]/a") WebElement iphone6splus;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[2]/a") WebElement ipads;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[2]/ul/li[3]/a") WebElement ipadair;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[3]/a") WebElement laptops;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[4]/a") WebElement deals;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[5]/a")WebElement accessories;
	@FindBy(xpath="//*[@id=\"siteNav\"]/li[5]/div/ul/li[11]/a")WebElement homedecor;
	@FindBy(xpath="//*[@id=\"header\"]/header/div[3]/a[1]/i")WebElement search ;
	@FindBy(xpath="//*[@id=\"searchPopup\"]/form/div[1]/input[1]")WebElement searchfield ;
	@FindBy(xpath="//*[@id=\"header\"]/header/div[4]/a[2]/i")WebElement account ;
	@FindBy(xpath="//*[@id=\"cartLink\"]/i")WebElement cart ;
	@FindBy(xpath="//*[@id=\"Collection\"]/div[1]/div[1]/div[1]/button")WebElement filter ;
	@FindBy(xpath="//*[@id=\"SortBySt\"]")WebElement sortby ;
	@FindBy(xpath="//*[@id=\"Collection\"]/div[1]/div[2]/div/a")WebElement loadmore ;
	@FindBy(xpath="//*[@class=\"footer-block__item wd100 newsletter tc\"]/div/form/div/input")WebElement subscribeemail; ;
	@FindBy(xpath="//*[@class=\"footer-block__item wd100 newsletter tc\"]/div/form/div/span/button]")WebElement subscribe ;
	@FindBy(xpath="//*[@id=\"slidedown-body\"]/div[2]")WebElement alert ;
	@FindBy(xpath="//*[@id=\"onesignal-slidedown-cancel-button\"]")WebElement alertno;
	
		public void titleverification()
	{
		
		String actualtitle=driver.getTitle();
		System.out.println("Actual title is " +actualtitle);
		String exptitle= "Online Shopping for Electronics, Mobile Phones ETC";
		Assert.assertEquals(actualtitle, exptitle);	
	}
		public void alerthandling()
		{  
			WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(50));
			explicitwait.until(ExpectedConditions.visibilityOf(alert));
			alertno.click();
		}
	
	public void logocheck()
	{
		WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(30));
		explicitwait.until(ExpectedConditions.visibilityOf(logo));
		boolean bn=logo.isDisplayed();
		if(bn)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
	public void mousehoveriphones()
	{
		Actions act=new Actions(driver);
		act.moveToElement(iphones);
		act.perform();
		iphone6splus.click();
		driver.navigate().back();
	
	}
	public void mousehoveripads()
	{
		Actions act=new Actions(driver);
		act.moveToElement(ipads);
		act.perform();
		ipadair.click();
		driver.navigate().back();
	
	}
	public void laptops()
	{
		
		laptops.click();
		driver.navigate().back();
	
	}
	public void deals()
	{
		
		deals.click();
		driver.navigate().back();
	
	}
	public void mousehoveraccessories()
	{
		Actions act=new Actions(driver);
		act.moveToElement(accessories);
		act.perform();
		homedecor.click();
		driver.navigate().back();
	
	}
	public void search()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		search.click();
		searchfield.sendKeys("lenova");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
		
	}
	
}
	




