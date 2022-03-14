package openWebsiteTestNG.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {

    @Test
    public void openGoogleTest() throws MalformedURLException {
        final String URL = "http://192.168.56.1";
        final String GOOGLE_LINK = "https://www.google.com/";
        WebDriver driver = new RemoteWebDriver(new URL(URL), new ChromeOptions());
        driver.get(GOOGLE_LINK);
        driver.close();
    }
}