import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFuturedate {
	WebDriver driver;
	
	static void selectdatepicker(WebDriver driver, String month ,String year,String date) {
		
		while(true) {
		            String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		            String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		            if(currentmonth.equals(month) && currentyear.equals(year)){
		            	// driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//you access to pass date this one
		            	
		            	
		            	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//you can access to future date click this one 
		            	
		            }
		        //select date  
		     List<WebElement>    alldate  = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		              for( WebElement aldate:alldate)  {
		            	  if(aldate.getText().equals(date)) {
		            		  aldate.click();
		            	  }
		              }      
		}
		     
		            }

  
	

 
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://jqueryui.com/datepicker/");
      driver.manage().window().maximize();
      driver.switchTo().frame(0) ;
      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
     
  
      selectdatepicker(driver,"February","2024","3");
		
		
		
	driver.close();	

	}

}
