package config.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverImpl extends DriverImpl {
    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
