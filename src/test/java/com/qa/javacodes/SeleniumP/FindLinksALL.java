package com.qa.javacodes.SeleniumP;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinksALL {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com");
		
		List <WebElement> ll = driver.findElements(By.tagName("a"));
		
		System.out.println(ll.size());  //available links
		
		for(WebElement e : ll) {
			System.out.println(e.getText());  //printing links
		}

		//traversing iterator
		Iterator<WebElement> it = ll.iterator();
		
		while(it.hasNext()) {
			WebElement e1 = it.next();
			if(e1.getText().equalsIgnoreCase("Fashion")) {
				System.out.println("Naveen nv thopu ra");
			}
			
		}
		
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
