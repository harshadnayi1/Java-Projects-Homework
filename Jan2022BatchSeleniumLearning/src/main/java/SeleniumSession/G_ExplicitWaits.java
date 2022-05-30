package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class G_ExplicitWaits {
    /*
    Explicit wait is more power than implicit waits - also dynamic
    Explicit wait will available inform of Webdriver Wait. (Predefined class- wait class)
    If we don't know the time best approach to use explicit wait.
    It can handle webelements and non-webelements.
    No explicitly keywords or methods.
    Specific to elements
    */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        WebDriverWait wait =new WebDriverWait(driver,20); //timeout
        wait.until(ExpectedConditions.titleContains("nopCommerce"));// Boolean Method
        System.out.println(driver.getTitle());



    }



}
