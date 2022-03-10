package openWebsite.test;

import openWebsite.driver.DriverSingleton;
import openWebsite.model.TestData;
import openWebsite.service.TestDataCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AbstractTest {
    protected WebDriver driver;
    private final Logger logger = LogManager.getRootLogger();
    protected TestData testData;

    @BeforeTest(alwaysRun = true)
    public void browserSetup() {
        if (System.getProperty("environment") == null) {
            System.setProperty("environment", "dev");
        }
        testData = TestDataCreator.TestDataCreate();
        System.setProperty("browser", testData.getBrowser());
        driver = DriverSingleton.getDriver();
        logger.info(testData.getBrowser() + " opened");
    }

    @AfterTest(alwaysRun = true)
    public void browserExit() {
        DriverSingleton.closeDriver();
        logger.info(testData.getBrowser() + " closed");
    }
}
