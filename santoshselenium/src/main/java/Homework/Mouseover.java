package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/amz-books/store?ou=psf&ie=UTF8&ref_=nav_cs_all_books&ref_=nav_cs_all_books");
		driver.manage().window().maximize();
	WebElement	ele=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	 Actions act=new Actions(driver);
	 act.moveToElement(ele).build().perform();

	}

}
