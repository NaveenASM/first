package com.qa.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class BrokenLinks extends TestBase{
	

	@Test()
	public void getBroken() throws MalformedURLException, IOException {
		driver.get("http://google.com");
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		li.addAll(driver.findElements(By.tagName("img")));
		
		ArrayList<WebElement> activelinks = new ArrayList<WebElement>();
		
		//activelinks without null
		for(WebElement e : li)
		{
			if(e.getAttribute("href") !=null && (!e.getAttribute("href").contains("javascript")))  {
				activelinks.add(e);
			}
		}
		
		//***** HttpURLConnection ******
		
		for(WebElement e2 : activelinks) {
			HttpURLConnection connection = (HttpURLConnection) new URL(e2.getAttribute("href")).openConnection();
			
			connection.connect();
			String s = connection.getResponseMessage();
			System.out.println(s + "---->" + e2.getAttribute("href"));
			connection.disconnect();
			
		}
	}
}
