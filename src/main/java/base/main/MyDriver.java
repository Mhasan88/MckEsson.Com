package base.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyDriver {
	
	public WebDriver driver = null;
	
	public MyDriver(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void click(WebElement element) {
		element.click();
		
		}
	
	public void wait(int sc) throws InterruptedException {
		Thread.sleep( sc *100);
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
