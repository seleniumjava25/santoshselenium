package Filepopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//loading nametag starts input 
public class filepupload {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the_internet.herokuapp.com/download");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys(System.getProperty("user.dir").name)
//download file 
		driver.findElement(By.linkText("sample_zip_file.zip")).click();

	}

}
