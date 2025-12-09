package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
	WebElement	fiel1=driver.findElement(By.xpath("//input[@id='field1']"));
	fiel1.clear();
	fiel1.sendKeys("double click");
	WebElement	fiel2=driver.findElement(By.xpath("//input[@id='field2']"));
	WebElement	button =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	Actions act=new Actions(driver);
	act.doubleClick(button).perform();
String	text=fiel2.getAttribute("value");
System.out.println(text);
	if(text.equals("double click")) {
	   System.out.println("the text is copy correctly ");
	}
	else {
		System.out.println("the text not copy correctly ");
	}

	}

}
