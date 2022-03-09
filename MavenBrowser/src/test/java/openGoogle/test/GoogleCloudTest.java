package openGoogle.test;

import openGoogle.page.GoogleMainPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class GoogleCloudTest extends AbstractTest {
    GoogleMainPage mainPage;
    private final Logger logger = LogManager.getRootLogger();

    @Test(description = "Open Google")
    public void openGoogle() {
        mainPage = new GoogleMainPage(driver)
                .openPage();
        logger.info("Google is opened");
    }
}
