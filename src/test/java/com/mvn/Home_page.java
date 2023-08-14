package com.mvn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_page {

	@Test(priority = 1)
	public void verifyMenuButton() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//div[@class='bm-burger-button']//button")).click();

		driver.findElement(By.id("inventory_sidebar_link")).click();
		
		driver.findElement(By.xpath("//div[@class='bm-burger-button']//button")).click();

        driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();

        driver.navigate().back();

		driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]")).click();

		driver.navigate().refresh();

		driver.close();
	}

	@Test(priority = 2)
	public void verifyAddToCardbutton() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();

		driver.close();
	}

	@Test(priority = 3)

	public void verifyAddToCardIcon() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//div[@id='inventory_container']//div//div[1]//div[1]//div//button"));

		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));

		driver.close();

	}

	@Test(priority = 4)
	public void verifyNameDropDwon() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		WebElement e1 = driver.findElement(By.xpath("//div[@id='inventory_filter_container']//select"));

		Select s1 = new Select(e1);

		s1.selectByIndex(0);

		WebElement e2 = driver.findElement(By.xpath("//div[@id='inventory_filter_container']//select"));

		Select s2 = new Select(e2);

		s2.selectByIndex(1);

		WebElement e3 = driver.findElement(By.xpath("//div[@id='inventory_filter_container']//select"));

		Select s3 = new Select(e3);

		s3.selectByIndex(2);

		WebElement e4 = driver.findElement(By.xpath("//div[@id='inventory_filter_container']//select"));
		Select s4 = new Select(e4);

		s4.selectByIndex(3);

		driver.close();
	}

}