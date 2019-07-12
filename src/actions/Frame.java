package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Karthik\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		driver.findElement(By.name("email")).sendKeys("shambhu473@gmail.com");
		driver.findElement(By.className("button")).click();
	}

}
