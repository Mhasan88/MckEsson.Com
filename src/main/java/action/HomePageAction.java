package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page_Element.HomePageElement;

public class HomePageAction extends HomePageElement {

	public HomePageAction(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);
	}
	
	public void homepage_Click() throws InterruptedException {
		click(log);
		click(tab4);
		wait(100);
		click(value);
		
	}

}
