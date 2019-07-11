package testpack.kun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium class appllication\\eclipse oxygen\\Kunal1\\driv\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//to get browser title
String ti = driver.getTitle();
System.out.println(ti);
//to get browser current url
String ul = driver.getCurrentUrl();
System.out.println(ul);
//
 WebElement li=driver.findElement(By.id("email"));
 li.sendKeys("rockboykunasl");
WebElement ki = driver.findElement(By.id("pass"));
ki.sendKeys("password@123");
WebElement ko=driver.findElement(By.id("u_0_2"));
ko.click();
	}

}
