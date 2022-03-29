import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithOutHttpProtocal {
    @Test
    public void testMethod1()throws Exception {
        WebDriver driver = new ChromeDriver();
        // without http:// throws an error invalid argument
        //String url = "www.softwaretestingmaterial.com";
        //Below is the correct URL
        String url = "http://www.softwaretestingmaterial.com";
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println(driver.getCurrentUrl());

    }
}
