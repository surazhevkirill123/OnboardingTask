package openGoogle.test;

import openGoogle.driver.DriverSingleton;
import openGoogle.service.TestDataReader;
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
        if (System.getProperty("environment") == null){
            System.setProperty("environment","dev");
        }
        driver = DriverSingleton.getDriver();
        logger.info(TestDataReader.getTestData("browser") + " opened");
    }

    @AfterTest(alwaysRun = true)
    public void browserExit() {
        DriverSingleton.closeDriver();
        logger.info(TestDataReader.getTestData("browser") + " closed");
    }
}
