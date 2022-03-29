import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingSttaicBlcok {
   static  WebDriver driver;
    static {
    System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
     driver = new ChromeDriver();
    }


      @Test
      public void testMethod1()throws Exception{

          String url = " https://www.tutorialspoint.com/questions/index.php";
          driver.get(url);
          Thread.sleep(2000);
          driver.findElement(By.id("//input[@id=\'search-strings\']")).sendKeys("hello");

      }
    @Test
    public void testMethod2()throws Exception{
       // System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class=\'tp-logo\']"));
    }


}


