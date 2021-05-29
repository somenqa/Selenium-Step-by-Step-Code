package testng_listener;

import Base.ScriptBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends ScriptBase implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Start");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Success");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Fail");
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}

