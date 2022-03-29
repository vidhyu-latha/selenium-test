package config.impl;

import config.DriverEnum;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    static public WebDriver getDriver(String driverName) {
        WebDriver driver = null;

        try {
            if (driverName.equalsIgnoreCase(DriverEnum.CHROME.name())) {
                driver = getChromeDriver();
            } else if (driverName.equalsIgnoreCase(DriverEnum.FIREFOX.name())) {
                driver = getFireFoxDriver();
            } else if (driverName.equalsIgnoreCase(DriverEnum.INTERNET_EXPLORER.name())) {
                driver = getInternetExplorerDriver();
            } else {
                throw new Exception("driverName invalid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

    static public WebDriver getChromeDriver() {
        return new ChromeDriverImpl().getDriver();
    }

    static public WebDriver getFireFoxDriver() {
        return new FirefoxDriverImpl().getDriver();
    }

    static public WebDriver getInternetExplorerDriver() {
        return new IEDriverImpl().getDriver();
    }
}
