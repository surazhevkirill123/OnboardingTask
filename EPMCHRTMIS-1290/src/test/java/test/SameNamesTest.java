package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.MISLoginPage;
import page.MISPlatformPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SameNamesTest extends AbstractTest {
    MISLoginPage misLoginPage;
    MISPlatformPage misPlatformPage;
    private final Logger logger = LogManager.getRootLogger();

    @BeforeTest(description = "Login in MIS as Admin")
    public void openPage() {
        misLoginPage = open(MISLoginPage.URL, MISLoginPage.class);
        misPlatformPage = misLoginPage.logInAsAdmin(testData);
        misPlatformPage
                .clickNewSectionButton();
        logger.info("Login in MIS as Admin is passed");
    }

    @Test(description = "Choose Boolean and Integer inputs and click inputType field")
    public void inputsBooleanAndIntegerAndClickInputTypeField() {
        misPlatformPage
                .selectInputExceptLabel("Boolean","Integer")
                .nameInputExceptLabel(testData.getName())
                .clickField("inputType");
        assertThat(misPlatformPage.isErrorMessageTextDisplayed(), is(true));
        misPlatformPage.deleteInputs();
        logger.info("Choose Boolean and Integer inputs and click inputType field is passed");
    }

    @Test(description = "Choose Decimal and String inputs and click name field")
    public void inputsDecimalAndStringAndClickNameField() {
        misPlatformPage
                .selectInputExceptLabel("Decimal","String")
                .nameInputExceptLabel(testData.getName())
                .clickField("name");
        assertThat(misPlatformPage.isErrorMessageTextDisplayed(), is(true));
        misPlatformPage.deleteInputs();
        logger.info("Choose Decimal and String inputs and click name field is passed");
    }

    @Test(description = "Choose Code and Time inputs and click label field")
    public void inputsCodeAndTimeAndClickLabelField() {
        misPlatformPage
                .selectInputExceptLabel("Code","Time")
                .nameInputExceptLabel(testData.getName())
                .clickField("label");
        assertThat(misPlatformPage.isErrorMessageTextDisplayed(), is(true));
        misPlatformPage.deleteInputs();
        logger.info("Choose Code and Time inputs and click label field is passed");
    }

    @Test(description = "Choose Date and Date&Time inputs and click description field")
    public void inputsDateAndDateAndTimeAndClickDescriptionField() {
        misPlatformPage
                .selectInputExceptLabel("Date","Date&Time")
                .nameInputExceptLabel(testData.getName())
                .clickField("description");
        assertThat(misPlatformPage.isErrorMessageTextDisplayed(), is(true));
        misPlatformPage.deleteInputs();
        logger.info("Choose Date and Date&Time inputs and click description field is passed");
    }

    @Test(description = "Choose Fragment and Reference inputs and click inputType field")
    public void inputsFragmentAndReferenceAndTimeAndClickDescriptionField() {
        misPlatformPage
                .selectInputExceptLabel("Fragment","Reference")
                .nameInputExceptLabel(testData.getName())
                .clickField("inputType");
        assertThat(misPlatformPage.isErrorMessageTextDisplayed(), is(true));
        misPlatformPage.deleteInputs();
        logger.info("Choose Fragment and Reference inputs and click description field is passed");
    }

}
