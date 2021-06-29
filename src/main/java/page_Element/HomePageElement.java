package page_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.main.MyDriver;

public class HomePageElement extends MyDriver {

	public HomePageElement(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath = "//a[text()='Logins'][1]")
	public WebElement log;
	
	@FindBy(xpath = "(//img[@class='browse'])[5]")
	public WebElement tab4;
	
	@FindBy(xpath = "(//a[text()='Value-Based Care'])[2]")
	public WebElement value;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
