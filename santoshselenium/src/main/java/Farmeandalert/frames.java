package Farmeandalert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@id='ts_first_name']")).sendKeys("samira");
	driver.findElement(By.xpath("//input[@id='ts_last_name']")).sendKeys("dah");
    driver.findElement(By.xpath("//textarea[@id='ts_address']")).sendKeys("lawrensville georgia ");
   WebElement ele=driver.findElement(By.xpath("//select[@id='ts_country']"));
   Select sele=new Select(ele);
   sele.selectByValue("0");
   driver.findElement(By.xpath("//input[@value='female']")).click();
   List <WebElement>  radiob=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
   
   List <String>  button=Arrays.asList("football","cricket","hockey");
  //pick specific selection 
  /* for( WebElement rb:radiob) {
	   String  value=rb.getAttribute("value");
	   if(button.contains(value)){
		   rb.click();
	   }
   }*/
//how to pich random 
   Thread.sleep(1000);
  Random rand=new Random();
 String randomchoice=button.get(rand.nextInt(button.size()));
  for( WebElement rb:radiob) {
	   String  value=rb.getAttribute("value");
	   if(value.equals(randomchoice)){
		   rb.click();
		   break;//stop clicking after choising one 
		   }
	   }

  driver.findElement(By.xpath("//input[@name='Submit1']")).click();


   
   
   
  /* for( WebElement rb:radiob) {
	   
	   if(rb.getAttribute("value").equals("football") || rb.getAttribute("value").equals("cricket")) {
		   rb.click();
	   }
   }*/
   //driver.findElement(By.xpath(null))
   //driver.switchTo().parentFrame();
  driver.switchTo().defaultContent();

   driver.findElement(By.xpath("//span[normalize-space()='abhresh']")).click();
}	


}
