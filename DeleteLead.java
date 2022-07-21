package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		//driver.findElement(By.linkText("Phone")).click();                                //Enter phone using linkText locator
		driver.findElement(By.xpath("//span[text()='Phone']")).click();                    //Enter phone using Xpath
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("4142334456");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		 
		// driver.findElement(By.xpath("//button[text()='Find Leads']")).click();           
		// driver.findElement(By.linkText("Find Leads")).click();	                         //click find lead using linkText locator
		
		//driver.findElement(By.linkText("14049")).click();                                  //Capture lead ID of First Resulting lead using linkText locator
		driver.findElement(By.xpath("//a[text()='14053']")).click();
	//	driver.findElement(By.xpath("//a[@id = 'ext-gen928']")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen871\"]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"ext-gen246\"]")).sendKeys("14053");
		 driver.findElement(By.linkText("Find Leads")).click();	                    
			
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		
		
		
		
		
	}

}
