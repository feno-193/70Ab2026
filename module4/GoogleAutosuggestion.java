package module4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GoogleAutosuggestion {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		Thread.sleep(4000);
		int count = list.size();
		System.out.println(count);
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Automation\\AutomationPractice\\seleniumwebdriver\\test-output\\Screenshots\\photo.png");
		FileHandler.copy(source, destination);

	}

}
