package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]")));
		
	WebElement	source1=driver.findElement(By.xpath("//li[1]"));
	System.out.println(source1);
	WebElement	source2=driver.findElement(By.xpath("//li[2]"));
	WebElement	source3=driver.findElement(By.xpath("//li[3]"));
	WebElement	source4=driver.findElement(By.xpath("//li[4]"));
	
	WebElement	target =driver.findElement(By.xpath(" //div[@id='trash']"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(source3, target).perform();
	act.dragAndDrop(source1, target).perform();
	act.dragAndDrop(source2, target).perform();
	act.dragAndDrop(source4, target).perform();

	
		
		

	}

}
