package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\harsh\\IdeaProjects\\Software\\Driver\\geckodriver.exe");

        WebDriver driverF = new FirefoxDriver();

        driverF.get("https://demo.nopcommerce.com/");


    }
}
