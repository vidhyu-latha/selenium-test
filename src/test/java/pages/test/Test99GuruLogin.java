package pages.test;

import config.impl.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Guru99HomePage;
import pages.Guru99Login;

import java.util.concurrent.TimeUnit;

public class Test99GuruLogin  {
    //String driverPath = "C:\\geckodriver.exe";

    WebDriver driver;
    Guru99Login objLogin;
    Guru99HomePage objHomePage;
    @BeforeClass
    @Parameters({"browserName"})
    public void setup(String browserName){
        // System.setProperty("webdriver.gecko.driver", driverPath);
       driver = DriverFactory.getDriver(browserName);
       // driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }


    @Test(priority=0)
    public void test_Home_Page_Appear_Correct() {
        objLogin = new Guru99Login(driver);
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        objLogin.loginToGuru99("mgr123", "mgr!23");
        objHomePage = new Guru99HomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }

    @AfterTest
    public void closingBrowser(){
        driver.close();
    }
}
