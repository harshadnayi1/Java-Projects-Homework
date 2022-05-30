package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriverBasics {
    public static void main(String[] args) throws InterruptedException {

//        Step 2:Set up the Chromedriver - Path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehalkumar.chavada\\IdeaProjects\\Software\\Driver\\chromedriver.exe");

//        Step 1: Create an instance of webdriver
        WebDriver driver = new ChromeDriver();

//        Step 3 : Navigate to WebPage
        driver.get("https://demo.nopcommerce.com/");

//       Step 4 : Get page Title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

//       Step 5 : Expected Vs Actual  - Validation
        if (title.equals("nopCommerce demo store")) {
            System.out.println("The Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }

//       Step 6 :Navigation Functionality
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(2000);
//        Navigate back
        driver.navigate().back();
//        Navigate forward
        Thread.sleep(3000);
        driver.navigate().forward();

//      Step 7 : Maximize Screen or Full Screen
        driver.manage().window().maximize();

//      Step 8 : Refresh/Reload the Page
        Thread.sleep(3000);
        driver.navigate().refresh();

//      Step 9 :  Get URL and Check URL
        String Url = driver.getCurrentUrl();
        System.out.println("Current Url: " +Url);

//      Step 10: Close the browser
        driver.close(); //Close the current session
        driver.quit(); //Close everything
    }
}
