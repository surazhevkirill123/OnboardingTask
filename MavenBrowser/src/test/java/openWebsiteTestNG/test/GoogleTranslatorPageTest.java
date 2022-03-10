package openWebsiteTestNG.test;

import openWebsiteTestNG.page.GoogleSearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTranslatorPageTest extends AbstractTest {
    GoogleSearchPage googleSearchPagePage;
    private final Logger logger = LogManager.getRootLogger();

    @BeforeTest(description = "Open Google")
    public void openPage() {
        googleSearchPagePage = open(testData.getWebsite(), GoogleSearchPage.class);
        logger.info("GoogleSearch is opened");
    }

    @Test
    public void testCountry() {
        assertThat("Беларусь", equalTo(googleSearchPagePage.getCountry()));
        logger.info("Tested");
    }

    @Test
    public void testAllAboutGoogle() {
        assertThat("Всё о Google", equalTo(googleSearchPagePage.getAllAboutGoogle()));
        logger.info("Tested");
    }

    @Test
    public void testAd() {
        assertThat("Реклама", equalTo(googleSearchPagePage.getAd()));
        logger.info("Tested");
    }

    @Test
    public void testForBusiness() {
        assertThat("Для бизнеса", equalTo(googleSearchPagePage.getForBusiness()));
        logger.info("Tested");
    }

    @Test
    public void testHowWorksGoogleSearch() {
        assertThat("Как работает Google Поиск", equalTo(googleSearchPagePage.getHowWorksGoogleSearch()));
        logger.info("Tested");
    }

    @Test
    public void testConfidentiality() {
        assertThat("Конфиденциальность", equalTo(googleSearchPagePage.getConfidentiality()));
        logger.info("Tested");
    }

    @Test
    public void testTerms() {
        assertThat("Условия", equalTo(googleSearchPagePage.getTerms()));
        logger.info("Tested");
    }

    @Test
    public void testMail() {
        assertThat("Почта", equalTo(googleSearchPagePage.getMail()));
        logger.info("Tested");
    }

    @Test
    public void testPictures() {
        assertThat("Картинки", equalTo(googleSearchPagePage.getPictures()));
        logger.info("Tested");
    }

    @Test
    public void testSettings() {
        assertThat("Настройки", equalTo(googleSearchPagePage.getSettings()));
        logger.info("Tested");
    }
}
