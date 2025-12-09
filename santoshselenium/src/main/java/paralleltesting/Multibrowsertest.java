package paralleltesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multibrowsertest extends BaseClass {

	
@Test
public void login() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("samira");
	driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("sdah");
//select DOB
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
	
//before selection	
System.out.println("before selection");
WebElement female=driver.findElement(By.xpath("//label[text()='Female']"));
WebElement male=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
WebElement custom= driver.findElement(By.xpath("//label[normalize-space()='Custom']"));
System.out.println(female.isSelected());
System.out.println(male.isSelected());
System.out.println(custom.isSelected());
//driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
custom.click();
 
System.out.println("after selected male ");
System.out.println(female.isSelected());
System.out.println(male.isSelected());
System.out.println(custom.isSelected());

WebElement pronoun=driver.findElement(By.xpath("//select[@id='preferred_pronoun']"));
Select message=new Select(pronoun);
message.selectByValue("1");


WebElement genderm=driver.findElement(By.xpath("//input[@id='custom_gender']"));
genderm.clear();
Thread.sleep(1000);
genderm.sendKeys("anna");



driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("4245786965");
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
System.out.println("you succesfully login");


 
 System.out.println("login successfully");
}


}