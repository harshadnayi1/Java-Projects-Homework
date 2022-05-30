package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class B_WebDriverConcept {
    /* In the market there is a utility library to launch a browser without any executable file.
       To overcome setting up driver path  - There is an API bonigracia
       API saying use my API and i will do everything for you.

     */
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehalkumar.chavada\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
}
