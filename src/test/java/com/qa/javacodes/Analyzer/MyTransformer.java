package com.qa.javacodes.Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer {
	
	
	
	public void transform(ITestAnnotation annotation, Constructor testconstructor, Class testclass, Method testmethod) {
		
		annotation.setRetryAnalyzer(com.qa.javacodes.Analyzer.RetryAnalyzer.class);
		
	}

}
