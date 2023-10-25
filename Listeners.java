package Common;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Utility implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		 System.out.println("Test Start: " + result.getName());
		
	}

    public void onTestSuccess(ITestResult result) {
    	System.out.println("Test PASSED");
    	System.out.println("Test Success: " + result.getName());
		
	}
    
      public void onTestFailure(ITestResult result) {
    	  System.out.println("FAILED Test");
    	  System.out.println("Test Failure: " + result.getName());
    	  if (result.getStatus() == ITestResult.FAILURE) {
         	 captureScreenshot(result.getName());
         }
    	  
		
	}

}
