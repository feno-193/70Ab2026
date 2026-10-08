package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment108 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		List <WebElement> e1 = driver.findElements(By.tagName("a"));
		int count = e1.size(); 
		System.out.println(count);
		

	}

}
