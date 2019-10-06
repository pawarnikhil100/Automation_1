package practice_1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestList implements ITestListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test finished "+context.getName());
		
	}

	public void onStart(ITestContext arg) {
		// TODO Auto-generated method stub
		System.out.println("Driver started "+arg.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is failed "+result.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is stareted "+result.getName());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
