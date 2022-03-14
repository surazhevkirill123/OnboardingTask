package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class MISPlatformPage {
    @FindBy(xpath = "//span[text()=\"New section\"]")
    SelenideElement newSectionButton;

    @FindBy(xpath = "//span[text()=\"Add input\"]")
    SelenideElement addInputButton;

    @FindBy(xpath = "//span[text()=\"UP\"]")
    SelenideElement upButton;

    @FindBy(xpath = "//p[text()=\"Please use unique name\"]")
    SelenideElement errorMessage;

    @FindBy(xpath = "//span[text()=\"Delete\"]")
    SelenideElement deleteButton;

    public static final String LI_PATTERN = "//li[text()=\"%s\"]";
    public static final String INPUT_FIELD_PATTERN = "(//div[@data-test=\"input-grid-item\"]/div)[%d]";
    public static final String NAME_PATTERN = "//input[@name=\"markupInputs[%d].name\"]";
    public static final String MARKUP_INPUTS_PATTERN = "//input[@name=\"markupInputs[1].%s\"]";

    public By ByWithDynamicXPath(String pattern, Object value) {
        return By.xpath(String.format(pattern, value));
    }

    public MISPlatformPage clickNewSectionButton() {
        newSectionButton.click();
        return this;
    }

    public MISPlatformPage selectInputExceptLabel(String type1, String type2) {
        addInputButton.click();
        $(ByWithDynamicXPath(LI_PATTERN, type1)).click();
        if (type1.equals("Fragment") || type1.equals("Reference")) {
            upButton.click();
        }
        addInputButton.click();
        $(ByWithDynamicXPath(LI_PATTERN, type2)).click();
        if (type2.equals("Fragment") || type2.equals("Reference")) {
            upButton.click();
        }
        return this;
    }

    public MISPlatformPage nameInputExceptLabel(String name) {
        $(ByWithDynamicXPath(INPUT_FIELD_PATTERN, 1)).click();
        $(ByWithDynamicXPath(NAME_PATTERN, 0)).append(name);

        $(ByWithDynamicXPath(INPUT_FIELD_PATTERN, 2)).click();
        $(ByWithDynamicXPath(NAME_PATTERN, 1)).append(name);
        return this;
    }

    public MISPlatformPage clickField(String name) {
        $(ByWithDynamicXPath(MARKUP_INPUTS_PATTERN, name)).click();
        return this;
    }

    public Boolean isErrorMessageTextDisplayed() {
        return errorMessage.isDisplayed();
    }

    public MISPlatformPage deleteInputs() {
        deleteButton.click();
        $(ByWithDynamicXPath(INPUT_FIELD_PATTERN, 1)).click();
        deleteButton.click();
        return this;
    }
}
