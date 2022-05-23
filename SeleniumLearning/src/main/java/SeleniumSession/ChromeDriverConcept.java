package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        WebDriver cDriver = new ChromeDriver();

        //// Navigate to a website
        cDriver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000); //delay execution for 3 seconds

        cDriver.manage().window().maximize(); // Maximise the window

        String title = cDriver.getTitle();
        System.out.println("Title of this site is:" + title); //Print the title



        cDriver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);// open register page and delay 3 seconds

        cDriver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000); //open login page and delay 3 seconds

        cDriver.navigate().refresh();
        Thread.sleep(3000);// refresh page and delay 3 seconds

        cDriver.navigate().back();// click on back button and delay 3 seconds
        Thread.sleep(3000);


       cDriver.close(); // close the browser
      //  cDriver.quit();
    }
}


