package help;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpBrowser {
	
	public HelpBrowser() {
		driver = this.driver;
	}
	
	public WebDriver driver;
	
	public WebDriver launchBrowser() {
		System.setProperty("Webdriver.chrome.driver", "/Users/harikrishna.r/Downloads/chromedriver");
		return driver = new ChromeDriver();
	}

	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void implicit() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public void setUrl() {
		driver.get("https://www.google.com");
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
	
	
	public  void clickonLogin() {
		driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
	}
	
	public void enterCredentials(String username, String password) {
		explicit(locateElement(Locators.XPATH, "//input[@placeholder='Enter Your Email-ID or Phone Number']"));
		locateElement(Locators.XPATH, "//input[@placeholder='Enter Your Email-ID or Phone Number']").sendKeys(username);
		locateElement(Locators.XPATH,"//input[@placeholder='Enter Your Password']").sendKeys(password);	
		System.out.println("Entering ::"+username +" "+password);
	}
	
	
	public WebElement locateElement(Locators loc,String path) {
		WebElement element = null;
		switch (loc) {
		case ID:
			element = finby(By.id(path));
			break;
		case XPATH:
			element = finby(By.xpath(path));
		default:
			break;
		}
		return element;
	
	}
	
	
	public WebElement finby(By finby) {
		return driver.findElement(finby);
	}
	
	
}

