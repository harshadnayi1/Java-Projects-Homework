package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_FileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
        Thread.sleep(2000);

        driver.findElement(By.name("upfile")).sendKeys("C:\\Testing\\Jan 2022 Batch\\Selenium\\Selenium_Class_2.pdf");

    }
}
