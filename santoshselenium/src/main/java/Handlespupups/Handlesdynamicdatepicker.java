package Handlespupups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlesdynamicdatepicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ksrtc.in/");
		driver.findElement(By.xpath("(//div[@class='input-right-box'])[1]")).click();
		/*WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='25'])[1]"))).click();*/
		
	
		
		WebElement	ele=driver.findElement(By.xpath("(//a[text()='25'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
	System.out.println("elemetn is clickable ");	

	}

}
