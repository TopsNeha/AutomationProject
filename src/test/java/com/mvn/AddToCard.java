package com.mvn;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddToCard {
	@Test
	public void verifyAddToCardIcon() {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//div[@id='inventory_container']//div[2]//div[3]//button")).click();

		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();

		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();

		driver.findElement(By.xpath("//div[@id='inventory_container']//div[2]//div[3]//button")).click();

		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();

		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();

		driver.findElement(By.id("first-name")).sendKeys("neha");

		driver.findElement(By.id("last-name")).sendKeys("patil");

		driver.findElement(By.id("postal-code")).sendKeys("12345");

		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();

		driver.findElement(By.id("first-name")).sendKeys("neha");

		driver.findElement(By.id("last-name")).sendKeys("patil");

		driver.findElement(By.id("postal-code")).sendKeys("12345");

		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();

		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();

		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();

		driver.findElement(By.id("first-name")).sendKeys("neha");

		driver.findElement(By.id("last-name")).sendKeys("patil");

		driver.findElement(By.id("postal-code")).sendKeys("12345");

		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/checkout-complete.html");

		WebElement msgElement = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div"));
		String msg = msgElement.getText();
		System.out.println(msg);
		assertEquals(msg, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");

		driver.findElement(By.xpath("//div[@class='bm-burger-button']//button")).click();

		driver.findElement(By.id("logout_sidebar_link")).click();

		driver.close();

	}
}
