import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBroswers {
    static WebDriver driver;

    @Parameters("broswerName")
    @BeforeClass
    void setDriver(String broswerName){

        if(broswerName.equalsIgnoreCase("chrome")){
            //In Mac we dont need to setProperty for driver. we can directly place the chrome.exe file in /usr/local/bin path
            // System.setProperty("webdriver.chrome.driver","/Users/sveeramalla@unomaha.edu/Documents/Vidhya/IntelliJ/chromedriver");
            driver = new ChromeDriver();
            System.out.println("In Before Class: The Broswer name is :" +broswerName+" and thread Id:"+Thread.currentThread().getId());
        }
        else if(broswerName.equalsIgnoreCase("InternetExplore")){
            //In Mac we dont need to setProperty for driver. we can directly place the chrome.exe file in /usr/local/bin path
            // System.setProperty("webdriver.chrome.driver","/Users/sveeramalla@unomaha.edu/Documents/Vidhya/IntelliJ/chromedriver");
            driver = new ChromeDriver();
            System.out.println("In Before Class: The Broswer name is :" +broswerName+" and thread Id:"+Thread.currentThread().getId());
        }
        else if(broswerName.equalsIgnoreCase("FireFox")){
            //In Mac we dont need to setProperty for driver. we can directly place the chrome.exe file in /usr/local/bin path
            // System.setProperty("webdriver.chrome.driver","/Users/sveeramalla@unomaha.edu/Documents/Vidhya/IntelliJ/chromedriver");
            driver = new ChromeDriver();
            System.out.println("In Before Class: The Broswer name is :" +broswerName+" and thread Id:"+Thread.currentThread().getId());
        }

    }

    @Test
    public void testMethod1()throws Exception{
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='input']")).sendKeys("hello");
        System.out.println("");
    }
}
