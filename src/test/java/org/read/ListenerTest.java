package org.read;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class ListenerTest implements ITestListener{

	
	public void onStart(ITestContext arg0) {
		System.out.println("------------Test Starts-----------------");
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("The test case started is "+result.getName());
		
	}
	

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Failure but success percentage");
		
	}

	public void onTestFailure(ITestResult result) {
		String tn = result.getName();
		System.out.println("The name of the test case failed is-------> "+tn);
		
		Date d=new Date();
		
		String path = d.toString().replaceAll(":", "_");
		TakesScreenshot t=(TakesScreenshot)Execution.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File des =new File("C:\\Users\\sM\\eclipse-workspace\\ProjectMaven\\Failed_Test_Screenshot\\"+path+".png");
	    
		try {
			FileUtils.copyFile(src, des);
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		Execution.driver.quit();
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the skipped test case is------> "+result.getName());
		
	}

	

	public void onTestSuccess(ITestResult result) {
		System.out.println("The Passed test case name is ------>"+result.getName());
		
	}

	public void onFinish(ITestContext arg0) {
		System.out.println("Test completed");
		
	}



}
