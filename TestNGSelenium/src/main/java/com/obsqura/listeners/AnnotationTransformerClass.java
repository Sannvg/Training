package com.obsqura.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformerClass implements IAnnotationTransformer {
//program to retry test case during runtime(to avoid writing retry analyzer keyword  for each @Test)
	//need to specify the class name in xml file too
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod ) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);		
	}
	
}
