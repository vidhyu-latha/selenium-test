package config.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverImpl extends  DriverImpl{
    @Override
    public WebDriver getDriver() {
        return new InternetExplorerDriver();
    }
}
