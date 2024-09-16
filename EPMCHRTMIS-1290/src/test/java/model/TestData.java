package model;

public class TestData {
    private final String browser;
    private final String login;
    private final String password;
    private final String name;


    public TestData(String browser, String login, String password, String name) {
        this.browser = browser;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getBrowser() {
        return browser;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
