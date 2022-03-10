package openWebsiteTestNG.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.*;

public class GoogleTranslatorPage {
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//*[text()=\"История\"]")
    SelenideElement history;

    @FindBy(xpath = "//*[text()=\"Сохранённые\"]")
    SelenideElement saved;

    @FindBy(xpath = "//*[text()=\"Предложить перевод\"]")
    SelenideElement suggestTranslation;

    @FindBy(xpath = "//*[text()=\"русский\"]")
    SelenideElement russian;

    @FindBy(xpath = "//*[text()=\"английский\"]")
    SelenideElement english;

    @FindBy(xpath = "//*[text()=\"украинский\"]")
    SelenideElement ukrainian;

    @FindBy(xpath = "//*[text()=\"Текст\"]")
    SelenideElement text;

    @FindBy(xpath = "//*[text()=\"Документы\"]")
    SelenideElement documents;

    @FindBy(xpath = "//*[text()=\"Сайты\"]")
    SelenideElement sites;

    @FindBy(xpath = "//*[text()=\"Отправить отзыв\"]")
    SelenideElement postReview;

    public String getHistory() {
        return history.getText();
    }

    public String getSaved() {
        return saved.getText();
    }

    public String getSuggestTranslation() {
        return suggestTranslation.getText();
    }

    public String getRussian() {
        return russian.getText();
    }

    public String getEnglish() {
        return english.getText();
    }

    public String getUkrainian() {
        return ukrainian.getText();
    }

    public String getText() {
        return text.getText();
    }

    public String getDocuments() {
        return documents.getText();
    }

    public String getSites() {
        return sites.getText();
    }

    public String getPostReview() {
        return postReview.getText();
    }
}
