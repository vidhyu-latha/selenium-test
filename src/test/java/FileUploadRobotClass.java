import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import com.sun.glass.events.KeyEvent;
public class FileUploadRobotClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        // TODO Auto-generated method stub

        WebDriver drv = new ChromeDriver(); // starting Firefox browser
        drv.manage().window().maximize(); // maximizing window
        drv.manage().timeouts().pageLoadTimeout(10, TimeUnit. SECONDS);//for page load
        drv.get("https://www.grammarly.com/plagiarism-checker");//open testing website
        drv.manage().timeouts().implicitlyWait(10, TimeUnit. SECONDS);// for Implicit wait

//        JavascriptExecutor js = (JavascriptExecutor)drv; // Scroll operation using Js Executor
//        js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
//        Thread.sleep(2000); // suspending execution for specified time period

        WebElement browse = drv.findElement(By.xpath("//form[@id='file-upload-form']"));
        // using linkText, to click on browse element
        browse.click(); // Click on browse option on the webpage
        Thread.sleep(2000); // suspending execution for specified time period

        // creating object of Robot class
        Robot rb = new Robot();

        // copying File path to Clipboard
        StringSelection str = new StringSelection("/Users/sveeramalla@unomaha.edu/Documents/Vidhya/Self Introduction.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}
