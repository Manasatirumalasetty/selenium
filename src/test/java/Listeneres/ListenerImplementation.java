package Listeneres;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onStart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onSuccess");
	}	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onFail");
	}	

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onSkipp");
	}	

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.err.println("onstarted");
	}	

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.err.println("onFinish");
	}	
}