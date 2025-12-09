package day23;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("samira");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("dahm");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1236547899");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("samdag@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("235 lawrensville");
		driver.findElement(By.name("city")).sendKeys("lawrensville");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("georgia");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("40034");
	WebElement	dropcountry=driver.findElement(By.xpath("//select[@name='country']"));
	Select country=new Select(dropcountry);
	country.selectByVisibleText("ANGUILLA");
	
	List <WebElement>	option=country.getOptions();
	 int number=option.size();

    System.out.println( number);
    
    /* for(int i=0;i<number;i++) {
    	 System.out.println(option.get(i).getText());
     }*/
  WebElement firstname= driver.findElement(By.xpath("(//b[contains(text(),'First')])[1]")) ;
  System.out.println("the elemetn is display "+firstname.isDisplayed());
  boolean logo =driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']")).isDisplayed();
  System.out.println(logo);
  for( WebElement  ctry:option) {
	  System.out.println(ctry.getText());
  }
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("samj@gmail.com");;

 
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin987");;
 
 
  driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("admin987");

  
  //JavascriptExecutor
  
  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("arguments[0].click()",submit );
  
  WebElement secces=driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering.')]"));
  System.out.println(secces.getText());
 
  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
  
  
  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("samj@gmail.com");
  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin987");
   driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
   
 
 
  boolean logins=driver.findElement(By.xpath("//h3[text()='Login Successfully']")).isDisplayed();
  
  System.out.println(logins);
  
 WebElement textsuc=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
   System.out.println(textsuc.getText());
  //deal with window  
 //  Set <String>  windowsid=driver.getWindowHandles();
  //for(String x:windowsid) {
	  //System.out.println(x);*/
	  
//List<String>  windowlist=new ArrayList(windowsid);
  //String parentid=windowlist.get(0);
  //driver.switchTo().window(parentid);
 
	 /*String titles=driver.switchTo().window(x).getTitle();
	 System.out.println("the title"+titles);
	 
	 /*if(titles.equals("Register: Mercury Tours")) {
		 driver.close();
	 }*/
	/* if(titles.equals("Register: Mercury Tours")) {
		 System.out.println("the curremy"+driver.getCurrentUrl());
	 }*/
	 
  }
   
   
  

}

