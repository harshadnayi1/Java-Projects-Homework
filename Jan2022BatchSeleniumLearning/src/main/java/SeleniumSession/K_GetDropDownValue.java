package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class K_GetDropDownValue {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);

        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(1000);

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(month);
        List<WebElement> monthlist = select.getOptions();
        System.out.println(monthlist.size());

        for(int i=0;i< monthlist.size();i++){
            String text = monthlist.get(i).getText();
            System.out.println(text);
        }

    }
}
