package service;

import model.TestData;

public class TestDataCreator {
    public static final String TESTDATA_BROWSER = "testdata.browser";

    public static final String TESTDATA_LOGIN = "testdata.login";
    public static final String TESTDATA_PASSWORD = "testdata.password";

    public static final String TESTDATA_NAME = "testdata.name";


    public static TestData TestDataCreate() {
        return new TestData(TestDataReader.getTestData(TESTDATA_BROWSER),
                TestDataReader.getTestData(TESTDATA_LOGIN),
                TestDataReader.getTestData(TESTDATA_PASSWORD),
                TestDataReader.getTestData(TESTDATA_NAME));
    }
}
