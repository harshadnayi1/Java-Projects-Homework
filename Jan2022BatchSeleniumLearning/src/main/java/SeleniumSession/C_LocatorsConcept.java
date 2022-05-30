package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_LocatorsConcept {
    /*
    Everything is a Webelement on the page.
    To interact with each element Automation Script Required Locators.
    There are 8 Locators available in selenium.
    1. ID:
    2. ClassName:
    3. xpath
    4. css selector
    5. LinkText
    6. Partial Link Text
    7. TagName
    8. Full path

     */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

//        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(1000);
//        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("Test@1");
//        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();
    }
}
