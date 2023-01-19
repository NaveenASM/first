import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public  class JavaScriptExecutorConcept {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		WebElement elemnet = driver.findElement(By.xpath("//a[text()='Sign in']"));
		
//JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//For border
		js.executeScript("arguments[0].style.border = '2px solid red'", elemnet);
		
		//For background
		js.executeScript("arguments[0].style.background = 'yellow'", elemnet);
		
		//For background and border
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background: yellow')", elemnet);
		
		
		


	}
	
}

