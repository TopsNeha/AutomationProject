package com.mvn.MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class LoginPage {
	
	WebDriver driver=null;
	
	public void Test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("neha@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("neha123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		Thread.sleep(2000);
		
		
		
	}

}
