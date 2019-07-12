package org.actions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Karthik\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		List<WebElement> listFrame = driver.findElements(By.tagName("frame"));
		int s = listFrame.size();
		System.out.println(s);
		//To enter customer id
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("66360979");
		// To enter submit button
		//driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		//Alert al = driver.switchTo().alert();
		//al.accept();
		
		driver.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("34567");
		//Alert al = driver.switchTo().alert();
		//al.accept();
		driver.findElement(By.xpath("//input[@id='chkrsastu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Login']")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
