package leafground.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf = new ChromeDriver();
		
		leaf.get("http://leafground.com/pages/Button.html");
		leaf.manage().window().maximize();
		leaf.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click button to travel home page
		leaf.findElement(By.xpath("//button[contains(text(),'Go to')]")).click(); 
		
		leaf.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();   //navigate to button.html
     
		//Find position of button (x,y)
		System.out.println(leaf.findElement(By.id("position")).getLocation().getX());
		
		//Find button color
		WebElement color =leaf.findElement(By.id("color"));
		String bgcolor = color.getCssValue("background-color");
		System.out.println("Color is :" +bgcolor);
		
		//Find the height and width
		System.out.println(leaf.findElement(By.xpath("//*[@id=\"size\"]")).getSize());
		
		
		
		
	}
}
