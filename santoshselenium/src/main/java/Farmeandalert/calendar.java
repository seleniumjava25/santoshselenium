package Farmeandalert;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//admin:admin@(url)
		driver.get("https://www.hotwire.com/?nid=N-TXA-WEL&did=&vid=V-TXA-WEL-DEF-1T-V1&cid=211ac7d596410fd745e1849fb66a8e7f&r=Y");
		
		
		driver.manage().window().maximize();
		
	/*JavascriptExecutor js=(JavascriptExecutor) driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement cle=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-bdd='farefinder-hotel-startdate-input']")));
			WebElement	cl=driver.findElement(By.xpath("//div[@data-bdd='farefinder-hotel-startdate-input']"));
Thread.sleep(1000);
	js.executeScript("arguments[0].click()",cl);*/
		//driver.findElement(By.xpath("//div[@role='button']")).click();
		//driver.findElement(By.xpath("//div[@data-bdd='farefinder-hotel-startdate-input']")).click();
	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(20));
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='farefinder-option active']//span[@class='SVGIcon active icon']")));

driver.findElement(By.xpath("//div[@class='farefinder-option active']//span[@class='SVGIcon active icon']")).click();
		//driver.findElement(By.xpath("//div[@data-bdd='farefinder-car-startdate-input']")).click();
Thread.sleep(1000);
      
		System.out.println("the link is clicked ");
	Thread.sleep(1000);	
	driver.close();	
	}

}
