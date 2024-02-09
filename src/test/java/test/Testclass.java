package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.Homepage;
import page.Registrationpage;

public class Testclass  extends Baseclass {
	@Test
	public void hometest() 
	{
		Homepage ob=new Homepage(driver);
		ob.titleverification();
		ob.alerthandling();
		ob.logocheck();
		ob.mousehoveriphones();
		ob.mousehoveripads();
		ob.laptops();
		ob.deals();
		ob.mousehoveraccessories();
		ob.search();
		
	} 
	@Test(priority=1)
	public void registrationtest() 
	{
		Registrationpage ob=new Registrationpage(driver);
		ob.createaccount();
		
	}





}
