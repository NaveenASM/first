package com.qa.Mytests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Base.CustomListners;
import com.qa.Base.TestBase;

@Listeners(CustomListners.class)
public class ScreenshotForFailed extends TestBase{

	@Test()
	public void test1() throws Exception
	{
		driver.get("http://facebook.com");
		Assert.assertEquals(true, false);
	}
}
