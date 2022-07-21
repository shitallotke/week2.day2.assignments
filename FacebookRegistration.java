package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistration {
	
	
		 public static void main(String[]args)
		 {

			 WebDriverManager.chromedriver().setup();//setup the browser
				ChromeDriver fb = new ChromeDriver();// launch the browser
				fb.get("https://en-gb.facebook.com/");
				
				fb.manage().window().maximize();
				fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				fb.findElement(By.linkText("Create New Account")).click();
				fb.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shital");
				fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lotle-Ll");
				fb.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ssl27@gmail.com");
				fb.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ssl27@gmail.com");
				fb.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("L123@asdfr");
				
				WebElement dateele =fb.findElement(By.xpath("//select[@id='day']"));
				Select selectdate = new Select(dateele);
				selectdate.selectByValue("27");
				
				WebElement monthele =fb.findElement(By.xpath("//select[@id='month']"));
				Select selectmonth = new Select(monthele);
				selectmonth.selectByValue("9");
				
				WebElement yearele = fb.findElement(By.xpath("//select[@id='year']"));
				Select selectyear = new Select(yearele);
				selectyear.selectByValue("1990");
				
				WebElement radiogender = fb.findElement(By.xpath("//label[text()='Female']"));  
				radiogender.click();
				
				fb.findElement(By.xpath("//button[contains (text(),'Sign')]")).click();
				
		}
}

