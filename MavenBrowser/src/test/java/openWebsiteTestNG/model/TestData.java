package openWebsiteTestNG.model;

import java.util.Objects;

public class TestData {
    private final String browser;
    private final String website;

    public TestData(String browser, String site) {
        this.browser = browser;
        this.website = site;
    }

    public String getBrowser() {
        return browser;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestData testData = (TestData) o;
        return Objects.equals(browser, testData.browser) && Objects.equals(website, testData.website);
    }

    @Override
    public int hashCode() {
        return Objects.hash(browser, website);
    }

    @Override
    public String toString() {
        return "TestData{" +
                "browser='" + browser + '\'' +
                ", site='" + website + '\'' +
                '}';
    }
}
