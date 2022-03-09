package openGoogle.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class GoogleMainPage extends AbstractPage {
    String GOOGLE_URL = "https://google.com/";
    private final Logger logger = LogManager.getRootLogger();

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    public GoogleMainPage openPage() {
        driver.get(GOOGLE_URL);
        logger.info("GoogleCloudMainPage opened");
        return this;
    }
}
