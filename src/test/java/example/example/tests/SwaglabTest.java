package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class FaceBookLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class SwaglabTest extends BaseTest {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);

		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}

	@Test
	public void OpenCartTest() throws InterruptedException {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(3000);

		Assert.assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
	}

	@Test
	public void CheckOutTest() throws InterruptedException {
		driver.findElement(By.className("checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).sendKeys("Noor");
		driver.findElement(By.id("last-name")).sendKeys("Anik");
		driver.findElement(By.id("postal-code")).sendKeys("3100");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("finish")).click();

		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("Swag Labs", driver.getTitle());
	}

}
