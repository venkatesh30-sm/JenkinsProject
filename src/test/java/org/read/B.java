package org.read;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class B implements IRetryAnalyzer{

	int minCount=0,maxCount=10;
	
	public boolean retry(ITestResult a) {
		
	  if(minCount<maxCount) {
			
			minCount++;
			return true;
		}
		
		
		return false;
	}

   
}