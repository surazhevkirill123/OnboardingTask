package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private final Logger log = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {

        log.info("Test [" + result.getName() + "] start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test [" + result.getName() + "] passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error("Test [" + result.getName() + "] failed");
        log.error(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
