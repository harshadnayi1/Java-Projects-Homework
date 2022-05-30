package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class F_ImplicitWaits {
    /*
    Implicitwaits : Dynamic wait
    Global wait - Applied for all elements
    Ignore Extra Seconds - Save time and fast performance
    We can change anytime in your code.
    Implicitwaits is available inform of implicitly keyword in selenium
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.cssSelector("#Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("Tester");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
