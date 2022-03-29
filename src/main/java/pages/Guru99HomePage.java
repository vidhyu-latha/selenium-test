package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    public Guru99HomePage(WebDriver driver){
        this.driver = driver;
    }


    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return    driver.findElement(homePageUserName).getText();
    }
}
