package page;

import com.codeborne.selenide.SelenideElement;
import model.TestData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MISLoginPage {
    public static final String URL = "https://misp-qa.by2.epm-chrt.projects.epam.com/login";

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//input[@name = \"login\"]")
    SelenideElement loginInputField;

    @FindBy(xpath = "//input[@name=\"password\"]")
    SelenideElement passwordInputField;

    @FindBy(xpath = "//span[text()=\"Вход\"]")
    SelenideElement signInButton;

    public MISPlatformPage logInAsAdmin(TestData testData){
        loginInputField.append(testData.getLogin());
        passwordInputField.append(testData.getPassword());
        signInButton.click();
        return page(MISPlatformPage.class);
    }
}
