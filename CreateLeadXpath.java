package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit' ]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Testleaf");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shreeyan");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("LOle");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("4142334456");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("shree09@gmail.com");
		 
		WebElement source = driver.findElement(By.xpath("//select[@id ='createLeadForm_generalStateProvinceGeoId']"));
		Select drop1 = new Select(source);
	    //drop1.selectByIndex(3);
	    drop1.selectByVisibleText("Texas");
	    
	   driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	    
	    String title = driver.getTitle();
	    System.out.println("Title : "+title);
		 
		
	}

}
