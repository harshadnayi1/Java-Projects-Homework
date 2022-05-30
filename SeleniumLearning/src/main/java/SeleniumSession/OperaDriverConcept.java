package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverConcept {
    public static void main(String[] args) {

        System.setProperty("webdriver.opera.driver","C:\\Users\\harsh\\IdeaProjects\\Software\\operadriver.exe");

        WebDriver oDriver = new OperaDriver();
        oDriver.get("https://www.bbc.co.uk/news");

        String title = oDriver.getTitle();
        System.out.println("Page Title:" + title);
    }
}
