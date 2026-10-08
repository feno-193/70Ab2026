package Selenium.seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLoginPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(name="email")
	WebElement uName;
	
	@FindBy(id="continue")
	WebElement contButton;
	
	@FindBy(xpath="//span(id='intention-submit-button')")
	WebElement submit;
	
	@FindBy(xpath="//input(placeholder='First and last name')")
	WebElement firstAndLastName;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="passwordCheck")
	WebElement reEnterPwd;
	
	@FindBy(xpath="//img([linkText='Create your Amazon account']")
	WebElement submitcreateAccount;
	
	@FindBy(name="code")
	WebElement securityCode;
	
	@FindBy(id="signInSubmit")
	WebElement signIn;
	
	//@FindBy(xpath="//span([@text()='Create your Amazon account']")
	//WebElement captchaLink;
	
	public void enterUserName() {
		wait.until(ExpectedConditions.visibilityOf(uName));
		uName.sendKeys("fenobin16@gmail.com");
	}
	
	public void clickOnContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(contButton));
		contButton.click();
	}
	
	public void enterPassword() {
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("Feno_193");
	}
		
		public void reEnterPassword() {
			wait.until(ExpectedConditions.visibilityOf(reEnterPwd));
			reEnterPwd.sendKeys("Feno_193");
		
	}
		public void enterValidDetails() {
			wait.until(ExpectedConditions.visibilityOf(firstAndLastName));
			firstAndLastName.sendKeys("Fenobin Mathew");
		}
	
	public void clickSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
		signIn.click();
	}
	
	public void proceedTocreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
	}
	
	public void enterValidSecurityCode() {
		wait.until(ExpectedConditions.visibilityOf(firstAndLastName));
		securityCode.sendKeys("");
	}
	public void clickCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(securityCode));
		submitcreateAccount.click();
	}
	public AmazonLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

}
