package openWebsiteTestNG.test;

import openWebsiteTestNG.page.GoogleSearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchPageTest extends AbstractTest {
    GoogleSearchPage propertyPage;
    private final Logger logger = LogManager.getRootLogger();

    @BeforeTest(description = "Open Google")
    public void openPage() {
        propertyPage = open(testData.getWebsite(), GoogleSearchPage.class);
        logger.info("GoogleSearch is opened");
    }

    @Test
    public void testCountry() {
        assertThat("Беларусь", equalTo(propertyPage.getCountry()));
        logger.info("Tested");
    }

    @Test
    public void testAllAboutGoogle() {
        assertThat("Всё о Google", equalTo(propertyPage.getAllAboutGoogle()));
        logger.info("Tested");
    }

    @Test
    public void testAd() {
        assertThat("Реклама", equalTo(propertyPage.getAd()));
        logger.info("Tested");
    }

    @Test
    public void testForBusiness() {
        assertThat("Для бизнеса", equalTo(propertyPage.getForBusiness()));
        logger.info("Tested");
    }

    @Test
    public void testHowWorksGoogleSearch() {
        assertThat("Как работает Google Поиск", equalTo(propertyPage.getHowWorksGoogleSearch()));
        logger.info("Tested");
    }

    @Test
    public void testConfidentiality() {
        assertThat("Конфиденциальность", equalTo(propertyPage.getConfidentiality()));
        logger.info("Tested");
    }

    @Test
    public void testTerms() {
        assertThat("Условия", equalTo(propertyPage.getTerms()));
        logger.info("Tested");
    }

    @Test
    public void testMail() {
        assertThat("Почта", equalTo(propertyPage.getMail()));
        logger.info("Tested");
    }

    @Test
    public void testPicturesBlabla() {
        assertThat("Картинки", equalTo(propertyPage.getPictures()));
        logger.info("Tested");
    }

    @Test
    public void testSettingsBlabla() {
        assertThat("Настройк", equalTo(propertyPage.getSettings()));
        logger.info("Tested");
    }
}
