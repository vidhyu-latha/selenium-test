import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightClickAndDoubleClick {
    WebDriver driver;
    @BeforeClass
    public void setDriver(){
        //In Mac we dont need to setProperty for driver. we can directly place the chrome.exe file in /usr/local/bin path
//    System.setProperty("webdriver.chrome.driver","/Users/sveeramalla@unomaha.edu/Documents/Vidhya/IntelliJ/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    public void testMethod1()throws Exception {
        String url = " https://demoqa.com/buttons";
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement rightElement = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightElement).perform();
        Thread.sleep(2000);
        WebElement doubleEle = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleEle).perform();
    }
}
