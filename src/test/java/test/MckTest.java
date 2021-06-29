package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import action.HomePageAction;

public class MckTest extends BaseTest {
	 
	@Test
	public void t() throws InterruptedException {
		HomePageAction act =new HomePageAction(driver);
		act.homepage_Click();
		
	}
	


	}


