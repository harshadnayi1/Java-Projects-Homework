import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BuyLaptop {

    WebDriver driver;
    @Test (priority = 1)
    void openBrowser() throws InterruptedException {
        System.out.println("1. Open Web Browser");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
    }

//    @Test(priority = 2)
//    void clickLogin(){
//        System.out.println("2. Open Login Page: ");
//        driver.findElement(By.className("ico-login")).click();
//    }
//
//    @Test (priority = 3)
//    void login() throws InterruptedException {
//        driver.findElement(By.className("email")).sendKeys("me@email.com");
//        Thread.sleep(1000);
//        driver.findElement(By.id("Password")).sendKeys("Password");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();//click on Login button
//        Thread.sleep(1000);
//    }

    @Test(priority = 4)
    void selectProduct() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click(); //click on Computers
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click(); // click on Desktop
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click(); // click on Lenovo IdeaCentre 600 All-in-One PC
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    void addToBasket() throws InterruptedException {
      driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/div/button")).click();//click on Add to cart
        Thread.sleep(1500);

    }
    @Test (priority = 6)
    void updateQuantity() throws InterruptedException {
        driver.findElement(By.linkText("Shopping cart")).click(); //click on shopping cart
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).clear(); //clear the quantity
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3"); // type 3 in quantity
        Thread.sleep(1000);

        driver.findElement(By.id("updatecart")).click();
    }
    @Test(priority = 7)
    void agreeCheckout() throws InterruptedException {
        driver.findElement(By.id("termsofservice")).click(); //click on Term & condition
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click(); // click on checkout
        Thread.sleep(1000);
    }
    @Test(priority = 8)
    void guestCheckout(){
       // driver.findElement(By.className("button-1 checkout-as-guest-button")).click();
        //driver.findElement(By.linkText("Checkout as Guest")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 9)
    void billingInfo() throws InterruptedException {
        driver.findElement(By.id("ShipToSameAddress")).isSelected();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("HC");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Nai");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("me@url.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("SSE IT");
        // driver.findElement(By.id("BillingNewAddress_CountryId")).s
        Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("India");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Silverstone Drive");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Rushey Meaed");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("LE4 1YZ");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("07742030303");
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("00999");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        Thread.sleep(1500);
    }
    @Test (priority = 10)
    void shippingMethod() throws InterruptedException {
        WebElement radio = driver.findElement(By.id("shippingoption_1"));
        radio.click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();


    }

    @Test(priority = 11)
    void paymentMethod() throws InterruptedException {
        Thread.sleep(1000);

        WebElement radio = driver.findElement(By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[1]/label/img")); //select credit card
            radio.click();
        //driver.findElement(By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[1]/label/img")).click();
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button"));
        button.click();
    }
    @Test(priority = 12)
    void paymentInfo() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("CardholderName")).sendKeys("harsh");
        driver.findElement(By.id("CardNumber")).sendKeys("10012202343494125");
        driver.findElement(By.id("ExpireMonth")).sendKeys("04");
        driver.findElement(By.id("ExpireYear")).sendKeys("2024");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[5]/td[2]/input")).sendKeys("123");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();// click on continue button
        Thread.sleep(1000);
    }
}
