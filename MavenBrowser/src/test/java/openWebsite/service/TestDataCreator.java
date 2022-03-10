package openWebsite.service;

import openWebsite.model.TestData;

public class TestDataCreator {
    public static final String TESTDATA_BROWSER = "testdata.browser";

    public static final String TESTDATA_WEBSITE = "testdata.website";

    public static TestData TestDataCreate() {
        return new TestData(TestDataReader.getTestData(TESTDATA_BROWSER),
                TestDataReader.getTestData(TESTDATA_WEBSITE));
    }
}
