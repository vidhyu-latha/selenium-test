package config.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverImpl extends DriverImpl {
    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
