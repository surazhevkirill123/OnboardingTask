package openWebsite.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleCloudMainPage extends AbstractPage {
    String GC_BASE_URL = "https://cloud.google.com/";
    private final Logger logger = LogManager.getRootLogger();



    public GoogleCloudMainPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudMainPage openPage(String url) {
        driver.get(url);
        logger.info("GoogleCloudMainPage opened");
        return this;
    }

}
