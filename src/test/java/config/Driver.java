package config;

import org.openqa.selenium.WebDriver;

public interface Driver {
    WebDriver getDriver();
    void closeDriver(WebDriver driver);
}
