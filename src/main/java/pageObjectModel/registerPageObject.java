package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObject {

	public WebDriver driver;
	
	private By firstName = By.xpath("//input[@name='firstname']");
	private By lastName = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmPassword = By.xpath("//input[@name='confirm']");
	private By privacyPolicy = By.xpath("//input[@type='checkbox']");
	private By continueButton =By.xpath("//input[@value='Continue']");
	private By registrationSuccessfully =By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	//Blank field error message xpath
	private By firstnameErrorMessage =By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By lastnameErrorMessage =By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By emailErrorMessage =By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By telephoneErrorMessage =By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By passwordErrorMessage =By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By WarningErrorMessage =By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");
 
	public registerPageObject(WebDriver driver) {
		this.driver = driver;
}
	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
	 public WebElement enterLastName() {
		 return driver.findElement(lastName);
	 }
	 public WebElement enterEmail() {
			return driver.findElement(email);	
		}
	 public WebElement enterTelephone() {
			return driver.findElement(telephone);	
		}
	 public WebElement enterPassword() {
			return driver.findElement(password);	
		}
	 public WebElement enterConfirmPassword() {
			return driver.findElement(confirmPassword);	
		}
	 public WebElement checkPrivacyPolicy() {
			return driver.findElement(privacyPolicy);	
		}
	 public WebElement clickContinue() {
			return driver.findElement(continueButton);	
		}
	 public WebElement registrationSuccessfully() {
			return driver.findElement(registrationSuccessfully);	
		}
	 
	 public WebElement diaplayFirstnameErrorMessage() {
			return driver.findElement(firstnameErrorMessage);	
		}
	 
	 public WebElement diaplayLastnameErrorMessage() {
			return driver.findElement(lastnameErrorMessage);	
		}
	 public WebElement diaplayEmailErrorMessage() {
			return driver.findElement(emailErrorMessage);	
		}
	 public WebElement diaplayTelephoneErrorMessage() {
			return driver.findElement(telephoneErrorMessage);	
		}
	 public WebElement diaplayPasswordErrorMessage() {
			return driver.findElement(passwordErrorMessage);	
		}
	 public WebElement diaplayWarningErrorMessage() {
			return driver.findElement(WarningErrorMessage);	
		}
}
