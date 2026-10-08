package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement e1 = driver.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\fenob\\Downloads\\DDR.xlsx");

	}

}
