import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InputTextWithoutSendKeys {
    WebDriver driver;

    @BeforeClass
    public void setDriver(){
        //In Mac we dont need to setProperty for driver. we can directly place the chrome.exe file in /usr/local/bin path
//    System.setProperty("webdriver.chrome.driver","/Users/sveeramalla@unomaha.edu/Documents/Vidhya/IntelliJ/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testMethod1()throws Exception{

       // driver = new ChromeDriver();
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
        Thread.sleep(2000);
        JavascriptExecutor JS = (JavascriptExecutor)driver;
        JS.executeScript("document.getElementById('search-strings').value='SoftwareTestingMaterial.com'");
        //driver.findElement(By.id("//input[@id='search-strings']")).sendKeys("hello");





    }
}
