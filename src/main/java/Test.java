import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static WebDriver driver;

    void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\CSE\\SELENIUM\\DRIVER\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.id("login-button")).getAttribute("login-button"));
    }
    void logIn() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getTitle());
    }

    void AddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }

    void openCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
        System.out.println(driver.getTitle());
    }

    void goToCheckOut() {
        driver.findElement(By.id("checkout")).click();
        System.out.println(driver.getTitle());
    }

    void checkOut() {
        driver.findElement(By.id("first-name")).sendKeys("Noor");
        driver.findElement(By.id("last-name")).sendKeys("Anik");
        driver.findElement(By.id("postal-code")).sendKeys("3100");
        driver.findElement(By.id("continue")).click();
        System.out.println(driver.getTitle());
    }

    void finish() {
        driver.findElement(By.id("finish")).click();
    }

    public static void main(String[] args) {
        Test run = new Test();
        run.launchBrowser();
        run.logIn();
        run.AddToCart();
        run.openCart();
        run.goToCheckOut();
        run.checkOut();
        run.finish();
    }
}