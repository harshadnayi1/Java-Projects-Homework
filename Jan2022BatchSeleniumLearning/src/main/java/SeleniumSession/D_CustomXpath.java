package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_CustomXpath {
    /*
    1. Property
    Syntax: //htmltag[@Property='Value']
    E.G.: //input[@id='Email']
    Original: /html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a
    Custom : //a[@class='ico-login']
    2. Properties
    Syntax: //htmltag[@Property='value' and @Property='value']
    //input[@id='Email' and @name='Email']
    3.Using Contain() in xpath
    Syntax: //htmltag[contains(@Property, 'value')]
    //button[contains(@class,'button-1 search-box-button')]
    4.with and without contains
    //button[@class='button-1 search-box-button' and contains(@type,'submit')]
    5. text()
    syntax: //htmltag[text()='value']
    //a[text()='Apply for vendor account']


     */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@role='status' and @aria-live]")).click();

    }
}
