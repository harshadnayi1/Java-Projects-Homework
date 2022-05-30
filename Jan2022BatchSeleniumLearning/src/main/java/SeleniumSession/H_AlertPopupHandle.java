package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_AlertPopupHandle{
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
        Thread.sleep(2000);

        Alert alert =driver.switchTo().alert();

        System.out.println(alert.getText());
        Thread.sleep(2000);
//        alert.accept(); //it will click on ok
        alert.dismiss(); // cancel the alert
        Thread.sleep(2000);

        driver.quit();

    }
}
