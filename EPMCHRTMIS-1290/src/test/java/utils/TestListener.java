package utils;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.reportportal.message.ReportPortalMessage;
import com.google.common.io.BaseEncoding;
import com.google.common.io.Resources;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;

public class TestListener implements ITestListener {

    private final Logger log = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Test [" + result.getName() + "] start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test [" + result.getName() + "] passed successfully");
        saveScreenshot("success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error("Test [" + result.getName() + "] failed");
        log.error(result.getThrowable());
        saveScreenshot("failure");
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

    private void saveScreenshot(String result) {
        File screenCapture = ((TakesScreenshot) WebDriverRunner
                .getWebDriver())
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenCapture, new File(
                    "src/main/resources/"
                            +
                            "screenshot.png"));
        } catch (IOException e) {
            log.error("Failed to save screenshot: " + e.getLocalizedMessage());
        }

        String screenshot = "screenshot.png";

        try {
            log.info(
                    "RP_MESSAGE#BASE64#{}#{}",
                    BaseEncoding.base64().encode(Resources.asByteSource(Resources.getResource(screenshot)).read()),
                    "on test " + result + " screenshot"

            );
            FileUtils.delete(new File(
                    "src/main/resources/"
                            +
                            "screenshot.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
