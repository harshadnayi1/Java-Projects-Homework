package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class J_DropDownHandel extends Utils{
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);

        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(1000);
//1.
//        driver.findElement(By.name("DateOfBirthDay")).sendKeys("11");
//        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
//        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");


        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

//2.
//        Select select = new Select(day);
//        select.selectByVisibleText("11");
//
//        Select select1 = new Select(month);
//        select1.selectByVisibleText("July");
//
//        Select select2 = new Select(year);
//        select2.selectByVisibleText("1996");

//3.
        selectValueFromDropDown(day,"11");
        selectValueFromDropDown(month,"May");
        selectValueFromDropDown(year,"1986");


    }



}
