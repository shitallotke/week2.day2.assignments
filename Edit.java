package leafground.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf = new ChromeDriver();
		
		leaf.get("http://leafground.com/pages/Edit.html");
		leaf.manage().window().maximize();
		leaf.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter your email address
		leaf.findElement(By.id("email")).sendKeys("shree09@gmail.com");
		
		//Append a text and press keyboard tab
		/*WebElement inputField = leaf.findElement(By.("Append "));
	    inputField.sendKeys(Keys.TAB);*/
		
		//Get default text entered
		String txt = leaf.findElement(By.name("username")).getAttribute("value") ;
		System.out.println("Default text : " +txt);
		
		//Confirm that edit field is disabled
		System.out.println(leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
	
		//Clear the text
		leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
	
		
	}

}
