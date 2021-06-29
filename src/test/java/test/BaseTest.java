package test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.main.R_WPropertiesFile;

public class BaseTest {

	public WebDriver driver = null;

	@BeforeClass
	public void start() throws IOException {

		Properties prop = new R_WPropertiesFile().properties("src\\main\\java\\base\\config\\config.properties");
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser Name is Chrome");
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty(" ", " ");
			driver = new FirefoxDriver();

		} else {
			System.out.println("No Browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mckesson.com");

	}

}
