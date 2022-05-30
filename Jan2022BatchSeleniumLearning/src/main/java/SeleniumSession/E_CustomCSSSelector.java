package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_CustomCSSSelector {
    /*
    ID
    #Email

    CSS SELECTOR PATH:
    button[class="button-1 search-box-button"]
    button[class="button-1 search-box-button"][type="submit"]

    class name use:
    button.button-1.register-button

    text method in css:
    input[id^='Pass'] : ^ means text will start with
    input[id$='word'] : $ means text will end with

    contains:
    button[id*='subscribe']

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.cssSelector("#Email")).sendKeys("tester@gmail.com");


    }
}
