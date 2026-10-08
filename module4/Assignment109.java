package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment109 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		List <WebElement> e1 = driver.findElements(By.tagName("a"));
		int count = e1.size(); 
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
		WebElement e2 = e1.get(i);
		String text = e2.getText();
		System.out.println(text);
		}
		

	}

}
