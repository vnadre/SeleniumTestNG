package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	
	public WebDriver driver;
	
	private By myAccount = By.xpath("//a [@title ='My Account']");
	private By register = By.xpath("//a[text()='Register']");
	private By login =By.xpath("//a[text()='Login']");
	
	//Create constructor
	public homePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement clickOnMyAccount() {
		return driver.findElement(myAccount);

	}
	public WebElement clickOnRegister() {
		return driver.findElement(register);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
}
