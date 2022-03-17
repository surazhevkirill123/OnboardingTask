package test;

import com.codeborne.selenide.Configuration;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import model.TestData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import service.TestDataCreator;
import utils.TestListener;

@Listeners({ReportPortalTestNGListener.class, TestListener.class})
public class AbstractTest {
    private final Logger logger = LogManager.getRootLogger();
    protected TestData testData;
    protected final int WAIT_TIMEOUT_MILLISECONDS = 5000;

    @BeforeSuite(alwaysRun = true)
    public void browserSetup() {
        if (System.getProperty("environment") == null) {
            System.setProperty("environment", "qa");
        }
        testData = TestDataCreator.TestDataCreate();
        Configuration.browser = testData.getBrowser();
        Configuration.timeout = WAIT_TIMEOUT_MILLISECONDS;
        logger.info(testData.getBrowser() + " opened");
    }
}
