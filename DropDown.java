package leafground.assignments;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf = new ChromeDriver();
		
		String url ="http://www.leafground.com/pages/Dropdown.html";
		leaf.get(url);
		
		leaf.manage().window().maximize();
		leaf.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//selectByIndex()	
	WebElement training = leaf.findElement(By.xpath("//select[@id='dropdown1']"));
	Select index = new Select(training);
	index.selectByIndex(4);
	
	//selectByVisibleText
	WebElement training2 =leaf.findElement(By.xpath("//select[@name='dropdown2']"));
	Select text = new Select(training2);
	text.selectByVisibleText("Appium");
	
	//selectByValue
	WebElement training1 =	leaf.findElement(By.xpath("//select[@id='dropdown3']"));
	Select value = new Select(training1);
	value.selectByValue("3");
	
	//sendKeys()
	leaf.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select")).sendKeys("UFT/QTP");
	
	//Get the Number of DropDown Option 
	Select s = new Select(leaf.findElement(By.xpath("//select[@class='dropdown']")));
     List <WebElement> op = s.getOptions();
     int size = op.size();
     System.out.println("Total number of dropdown options : "+size);
     System.out.println("DropDown options result :");
     for(int i =0; i<size ; i++){
        String options = op.get(i).getText();
        System.out.println(options);
	
	}
     
     //select your program
     leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[3]")).click();

}
}