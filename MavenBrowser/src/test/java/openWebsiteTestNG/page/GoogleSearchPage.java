package openWebsiteTestNG.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.*;

public class GoogleSearchPage {
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//*[text()=\"Беларусь\"]")
    SelenideElement country;

    @FindBy(xpath = "//*[text()=\"Всё о Google\"]")
    SelenideElement allAboutGoogle;

    @FindBy(xpath = "//*[text()=\"Реклама\"]")
    SelenideElement ad;

    @FindBy(xpath = "//*[text()=\"Для бизнеса\"]")
    SelenideElement forBusiness;

    @FindBy(xpath = "//*[text()=\"Как работает Google Поиск\"]")
    SelenideElement howWorksGoogleSearch;

    @FindBy(xpath = "//*[text()=\"Конфиденциальность\"]")
    SelenideElement confidentiality;

    @FindBy(xpath = "//*[text()=\"Условия\"]")
    SelenideElement terms;

    @FindBy(xpath = "//*[text()=\"Почта\"]")
    SelenideElement mail;

    @FindBy(xpath = "//*[text()=\"Картинки\"]")
    SelenideElement pictures;

    @FindBy(xpath = "//*[text()=\"Настройки\"]")
    SelenideElement settings;

    public String getCountry() {
        return country.getText();
    }

    public String getAllAboutGoogle() {
        return allAboutGoogle.getText();
    }

    public String getAd() {
        return ad.getText();
    }

    public String getForBusiness() {
        return forBusiness.getText();
    }

    public String getHowWorksGoogleSearch() {
        return howWorksGoogleSearch.getText();
    }

    public String getConfidentiality() {
        return confidentiality.getText();
    }

    public String getTerms() {
        return terms.getText();
    }

    public String getMail() {
        return mail.getText();
    }

    public String getPictures() {
        return pictures.getText();
    }

    public String getSettings() {
        return settings.getText();
    }
}
