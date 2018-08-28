package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pojos.BrowserType;

/**
 * @author Harikrishna Recharla
 *
 */

public class TestBase {
	
	public RemoteWebDriver driver;
	public Properties prop;
	public TestBase() {
		PageFactory.initElements(driver, this);
		setProperties();
		
	}
	
	
	
	public void setProperties() {
		try {
			prop = new Properties();
			FileInputStream in = new FileInputStream("./src/main/resources/qa.properties");
			prop.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}
	
	public String getBrowser() {
		return prop.getProperty("browser").toUpperCase();
	}
	
	public void initialize(BrowserType type) {
		
		switch (type) {
		case CHROME:
			System.setProperty("Webdriver.chrome.driver", "/Users/harikrishna.r/Downloads/chromedriver");
			driver = new ChromeDriver();
			break;
			
		case FIREFOX:
			
			break;

		default:
			break;
		}
		setUrl();
	}
	
	
	

	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void explicit(WebElement element) {
		WebDriverWait wait =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void setUrl() {
		String url  = prop.getProperty("URL");
		driver.get(url);
	}
	
}
