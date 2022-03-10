package openWebsite.test;

import openWebsite.page.PropertyPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class GooglePageTest extends AbstractTest {
    PropertyPage propertyPage;
    private final Logger logger = LogManager.getRootLogger();

    @Test(description = "Open Google")
    public void openPage() {
        propertyPage = new PropertyPage(driver)
                .openPage(testData.getWebsite());
        logger.info("Google is opened");
    }
}
