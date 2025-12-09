package Homework;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("samira");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("sdah");
//drop down	
	WebElement	month=driver.findElement(By.xpath("//select[@id='month']"));
		Select Smonths=new Select(month);
	
		 Smonths.selectByValue("4");
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	     Select sday =new Select(day);  
	     sday.selectByVisibleText("1");
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	     Select syear =new Select(year);  
	     syear.selectByVisibleText("1966");
//print all the month 
	     List <WebElement>  monthsoptions=Smonths.getOptions();
	    System.out.println("the number of the months are:"+" "+monthsoptions.size());
	     for(WebElement months:monthsoptions) {
	    	 System.out.print(" "+months.getText());
	    	 System.out.println(months.getSize());
	    	 System.out.println();
	     }
//print all the days 
	     
	     List <WebElement>  daysoptions=sday.getOptions();
		    System.out.println("the number of the days are:"+" "+daysoptions.size());
		     for(WebElement days:daysoptions) {
		    	 System.out.print(" "+days.getText());
		    	 System.out.println(days.getSize());
		    	 System.out.println();
		     }
//print all the years 
		     List <WebElement>  yearssoptions=syear.getOptions();
			    System.out.println("the number of the years are:"+" "+yearssoptions.size());
			     for(WebElement years:yearssoptions) {
			    	 System.out.print(" "+years.getText());
			    	 System.out.println(years.getSize());
			    	 System.out.println();
			     }  		
	
	}
}

