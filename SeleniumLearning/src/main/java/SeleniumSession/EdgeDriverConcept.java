package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverConcept {
    public static void main (String [] args){
        System.setProperty("webdriver.edge.driver","C:\\Users\\harsh\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");

        WebDriver eDriver = new EdgeDriver();

        eDriver.get("https://demo.nopcommerce.com/");



    }
}
