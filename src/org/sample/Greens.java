package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Greens {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kingston\\workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://wwww.facebook.com/");
			driver.manage().window().maximize();
			WebElement mail=driver.findElement(By.xpath("//input[@name='email']"));
			mail.sendKeys("raghavkarthik1191@gmail.com");
			WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
			pass.sendKeys("raghavkarthik1!");
			WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
			login.click();
		}

	}


