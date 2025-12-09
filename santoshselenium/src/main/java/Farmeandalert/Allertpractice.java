package Farmeandalert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allertpractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//normal alert 	
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();
//confirmation allert 
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();*/
//prompt alert
	WebElement	ele=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	ele.click();
		
	Alert	prompt =driver.switchTo().alert();
	System.out.println(prompt.getText());
	
	
	
	prompt.sendKeys("prompt practice");
	prompt.accept();
	}

}
