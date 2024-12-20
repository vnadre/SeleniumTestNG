package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	public WebDriver driver;
	
	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@value='Login']");
	private By loggedInSuccessfully = By.xpath("//a[text()='Account']");

	// declare the webdriver

	// Add email
	// Add password
	// Add login button

	public loginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement clickLogin() {
		return driver.findElement(login);
	}
	public WebElement loginInSuccessfully() {
		return driver.findElement(loggedInSuccessfully);
	}
	
}
