package config.impl;

import config.Driver;
import org.openqa.selenium.WebDriver;

abstract class DriverImpl implements Driver {
    @Override
    public void closeDriver(WebDriver driver) {
        driver.close();
    }
}
