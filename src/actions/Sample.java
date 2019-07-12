package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Karthik\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/editorial-images");
		driver.manage().window().maximize();
		WebElement btnClick = driver.findElement(By.xpath("//a[@class='text-link--sly action--with-emphasis is-selected']"));
		btnClick.click();
		driver.findElement(By.xpath("//a[text()='Entertainment']")).click();
	}

}
