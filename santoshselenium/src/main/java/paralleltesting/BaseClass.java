package paralleltesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	
	WebDriver driver;
@BeforeClass
@Parameters({"browser","os"})
	public void setup(String br,String os) {
	    switch(br) {
	   case "Chrome":driver=new ChromeDriver();break;
	   case "edge":driver=new EdgeDriver();break;
	   case "firefox":driver=new FirefoxDriver();break;
	   default:System.out.println("invalid browser");return;
	   }
	    
	    
	    
	// driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();}



@AfterClass
public void teardown() {
	
	driver.close();
}

}
