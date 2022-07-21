package leafground.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf = new ChromeDriver();
		
		leaf.get("http://leafground.com/pages/checkbox.html");
		leaf.manage().window().maximize();
		leaf.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select the languages that you know?
		WebElement lang1 = leaf.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		lang1.click();
		
		WebElement lang2 = leaf.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[4]"));
		lang2.click();
		

		WebElement lang3 = leaf.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[5]"));
		lang3.click();
		
		WebElement lang4 = leaf.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
		lang4.click();
		
		//DeSelect only checked 
		WebElement deselect = leaf.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		deselect.click();
		
		//Confirm Selenium is checked
		System.out.println(leaf.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input")).isSelected());
		
		//Select all below checkboxes
		WebElement option1 = leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		option1.click();
		WebElement option2 = leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		option2.click();
		WebElement option3 = leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		option3.click();
		WebElement option4 = leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		option4.click();
		WebElement option5 = leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		option5.click();
		WebElement option6 = leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		option6.click();
		
	}

}
