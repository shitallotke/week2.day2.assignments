package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit' ]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		 driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Shreeyan");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//a[text()='Testleaf']")).click();
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TCS");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		 
		 
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		
	}

}
