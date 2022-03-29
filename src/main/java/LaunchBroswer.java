import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LaunchBroswer{
public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
        driver.findElement(By.id("//input[@id=\'search-strings\']")).sendKeys("hello");
        driver.findElement(By.xpath("//img[@class=\'tp-logo\']"));

        }
        }