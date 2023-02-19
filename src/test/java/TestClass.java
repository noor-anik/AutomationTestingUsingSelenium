import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestClass {
    public static WebDriver driver;

    @Test
    void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\CSE\\SELENIUM\\DRIVER\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Assertions.assertEquals("Red Apple", driver.getTitle());
    }

    @Test
    void logIn() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assertions.assertEquals("Red Apple", driver.getTitle());
    }

    @Test
    void AddToCart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }

    @Test
    void openCart(){
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Test
    void goToCheckOut(){
        driver.findElement(By.id("checkout")).click();
    }

    @Test
    void checkOut(){
        driver.findElement(By.id("first-name")).sendKeys("Noor");
        driver.findElement(By.id("last-name")).sendKeys("Anik");
        driver.findElement(By.id("postal-code")).sendKeys("3100");
        driver.findElement(By.id("continue")).click();
    }

    @Test
    void finish(){
        driver.findElement(By.id("finish")).click();
    }
    public static void main(String[] args) {
        TestClass run = new TestClass();
        run.launchBrowser();
        run.logIn();
        run.AddToCart();
        run.openCart();
        run.goToCheckOut();
        run.checkOut();
        run.finish();
    }
}
