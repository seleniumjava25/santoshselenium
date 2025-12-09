package Handlespupups;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdatefortodat {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ksrtc.in/");
		driver.findElement(By.xpath("(//div[@class='input-right-box'])[1]")).click();
		
	String	date=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd"));
		
		
//enforce using java executor 		
	     WebElement	ele=driver.findElement(By.xpath("(//a[text()='"+date+"'])[1]"));		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
	System.out.println(" the element is clickable now ");	


	}

}
