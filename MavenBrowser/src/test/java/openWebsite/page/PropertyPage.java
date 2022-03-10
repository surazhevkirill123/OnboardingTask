package openWebsite.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PropertyPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    public PropertyPage(WebDriver driver) {
        super(driver);
    }

    public PropertyPage openPage(String url) {
        driver.get(url);
        logger.info("GoogleCloudMainPage opened");
        return this;
    }

}
