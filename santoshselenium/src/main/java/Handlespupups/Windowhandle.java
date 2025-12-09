package Handlespupups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ksrtc.in/");
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
 Set <String>allwinid=driver.getWindowHandles();
Iterator<String> it=allwinid.iterator();
         String parent=it.next();
         String child=it.next();
       
      
   
         driver.switchTo().window(child);
         System.out.println("the title of child wind  is "+driver.getTitle());
    driver.findElement(By.xpath("//input[@id='support-search-input']")).sendKeys("samira");
         
         driver.switchTo().window(parent);
    String    parentid=driver.getCurrentUrl();
         System.out.println("the title of parent win is "+driver.getTitle());
         driver.findElement(By.xpath("//img[@id='imgTwitter']")).isDisplayed();
         System.out.println("current url is"+driver.getCurrentUrl());
      String gwh=driver.getWindowHandle();
      if(gwh.equals("3A2971EB3A6C017E441E3631862CE8ED")) {
    	  driver.close();
      }
   
    	  
    	  
      }
	}


