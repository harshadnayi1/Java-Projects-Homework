import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
Open
Login
Find
Select
Add
Buy
Close
 */
public class SecondTestNGTestCase {
    @Test(priority = 4)
    void openBrowser() {
        System.out.println("Open Browser");
    }
    @Test(priority = 5)
    void login() throws InterruptedException {
        System.out.println("User able to login");
    }
    @Test(priority = 6)
    void find() throws InterruptedException {
        System.out.println("User able to find");
    }
    @Test(priority = 7)
    void select() throws InterruptedException {
        System.out.println("User able to select");
    }
    @Test(priority = 8)
    void add() throws InterruptedException {
        System.out.println("User able to add");
    }
    @Test(priority = 9)
    void buy() throws InterruptedException {
        System.out.println("User able to buy");
    }
    @Test(priority = 10)
    void closeBrowser() throws InterruptedException {
        System.out.println("Close Browser");
    }


}
