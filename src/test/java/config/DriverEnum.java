package config;

public enum DriverEnum {

    INTERNET_EXPLORER("IE"),
    FIREFOX("FireFox"),
    CHROME("Chrome");

    private String browser;

    DriverEnum(String browser){
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }
}
