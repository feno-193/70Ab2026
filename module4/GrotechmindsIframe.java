package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechmindsIframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/fenob/OneDrive/Documents/iframehtmlpagefromGROTECHMINDS.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement stName = driver.findElement(By.name("studentName"));
		stName.sendKeys("Fenobin");
		WebElement stMobile = driver.findElement(By.name("studentMobile"));
		stMobile.sendKeys("5175151707");

	}

}
