import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");	
//1 switch to frame
		driver.switchTo().frame(0);
//2by sendkey
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("04/04/1911");
//3 using logic
		
		
		
		
		
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));		
WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
ele.click();
System.out.println("ele is clicked ");
	     //driver.findElement(By.xpath("//input[@type='text']")).click();



driver.close();
	}

}
