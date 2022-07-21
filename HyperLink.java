package leafground.assignments;


import java.time.Duration;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf = new ChromeDriver();
		
		leaf.get("http://leafground.com/pages/Link.html");
		leaf.manage().window().maximize();
		leaf.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Find where am supposed to go without clicking me?
		System.out.println(leaf.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		//Go to Home Page
		leaf.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		
		//How many links are available in this page?
		List<WebElement> links = leaf.findElements(By.tagName("a"));
		int count = links.size();
	    System.out.println("The total number of links is "+count);
	    
	    //Display all the available link
	   for(WebElement allink : links)
	    {
	    	System.out.println(allink.getText() + " - " + allink.getAttribute("href"));
	    }
	   
	   	//Verify am I broken?
	 //  List<WebElement> link = leaf.findElements(By.tagName("a"));
	  
	}
	

}
