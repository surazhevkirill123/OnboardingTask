package openGoogle.test;

import openGoogle.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AbstractTest {
    protected WebDriver driver;
    private final Logger logger = LogManager.getRootLogger();

    @BeforeTest(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();
        logger.info(System.getProperty("browser") + " opened");
    }

    @AfterTest(alwaysRun = true)
    public void browserExit() {
        DriverSingleton.closeDriver();
        logger.info(System.getProperty("browser") + " closed");
    }
}
