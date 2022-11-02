package com.qa.Mytests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Analyzer.AnnotationTransformer;



public class RetryLogic {

	@Test()
	public void retry1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test()
	public void retry2()
	{
		Assert.assertEquals(true, true);
	}
}
