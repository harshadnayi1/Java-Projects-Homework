/*
Open Browser - Enter Url
Click on Login link - Enter valid Details and click on login. Logout
Close Browser
 */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGTestCase {
WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        String title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store. Login1",title,"Page title not matched");


    }
    @Test(priority = 2)
    void login() throws InterruptedException {
        System.out.println("User able to login");
        driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Tester@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
    @Test(priority = 3)
    void closeBrowser() throws InterruptedException {
        System.out.println("Close Browser");
        Thread.sleep(1000);
        driver.quit();
    }

}
