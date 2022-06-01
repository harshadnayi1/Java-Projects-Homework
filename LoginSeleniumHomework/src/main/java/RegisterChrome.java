import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);
        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Harshad");
        driver.findElement(By.id("LastName")).sendKeys("Nayi");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("14");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1982");
        driver.findElement(By.id("Email")).sendKeys("email@url.com");
        driver.findElement(By.id("Company")).sendKeys("SSE IT");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click(); //untick the newsletter
        driver.findElement(By.name("Password")).sendKeys("Passw0rd!");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Passw0rd!");

        Thread.sleep(2000);

        driver.findElement(By.name("register-button")).click();


    }
}
