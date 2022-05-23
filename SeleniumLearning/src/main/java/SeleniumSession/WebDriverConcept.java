package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// File created in Class


public class WebDriverConcept {
    public static void main(String[] args) throws InterruptedException {
        //step 2: set up the chrome driver & PATH of browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\IdeaProjects\\Software\\Driver\\chromedriver.exe");

//step 1: create an instance of web driver
        WebDriver driver = new ChromeDriver();

// step 3: navigate to webpage
        driver.get("https://demo.nopcommerce.com/");

//step 4: get page title
        String title = driver.getTitle();
        System.out.println("Page Title:" + title);

        Thread.sleep(300);
        driver.navigate().back();

//Step 5: Expected vs Actual - validation
        //if (title.equals (""))

    }
}
