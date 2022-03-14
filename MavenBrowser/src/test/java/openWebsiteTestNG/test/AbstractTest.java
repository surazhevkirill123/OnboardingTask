package openWebsiteTestNG.test;

import com.codeborne.selenide.Configuration;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import openWebsiteTestNG.model.TestData;
import openWebsiteTestNG.service.TestDataCreator;
import openWebsiteTestNG.util.TestListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class, ReportPortalTestNGListener.class})
public class AbstractTest {
    private final Logger logger = LogManager.getRootLogger();
    protected TestData testData;
    protected final int WAIT_TIMEOUT_MILLISECONDS = 5000;

    @BeforeTest(alwaysRun = true)
    public void browserSetup() {
        if (System.getProperty("environment") == null) {
            System.setProperty("environment", "dev");
        }
        testData = TestDataCreator.TestDataCreate();
        Configuration.browser = testData.getBrowser();
        Configuration.timeout = WAIT_TIMEOUT_MILLISECONDS;
        logger.info(testData.getBrowser() + " opened");
    }
}
