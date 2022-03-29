import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class UsingBeforeClass {
     WebDriver driver;

   @BeforeClass
   public void setDriver(){
       //In Mac we dont need to setProperty for driver. we can directly place the chrome.exe file in /usr/local/bin path
//    System.setProperty("webdriver.chrome.driver","/Users/sveeramalla@unomaha.edu/Documents/Vidhya/IntelliJ/chromedriver");
     driver = new ChromeDriver();
    }


      @Test
      public void testMethod1()throws Exception{
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='input']")).sendKeys("hello");

      }
    @Test//(enabled = false)
   // @Ignore
    public void testMethod2()throws Exception{
       // System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        String url = "http://demo.guru99.com/V4/";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='uid']")).isDisplayed();

    }

    @AfterClass
    public void closeDriver(){
       driver.close();
    }
}


