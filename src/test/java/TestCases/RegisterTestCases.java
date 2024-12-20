package TestCases;

import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.homePageObjects;
import pageObjectModel.registerPageObject;
import resources.BaseClass;
import resources.CommanMethods;
import resources.Constants;

public class RegisterTestCases extends BaseClass {
	@Test

	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {
		
		homePageObjects hpo = new homePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnRegister().click();

		registerPageObject rpo = new registerPageObject(driver);
		rpo.enterFirstName().sendKeys(Constants.firstName);
		rpo.enterLastName().sendKeys(Constants.lastName);
		rpo.enterEmail().sendKeys(emailAddress);
		// System.out.println("Registration email address::
		// "+RegisterTestCases.emailAddress);
		rpo.enterTelephone().sendKeys(Constants.telephone);
		rpo.enterPassword().sendKeys(Constants.password);
		rpo.enterConfirmPassword().sendKeys(Constants.confirmPassword);
		rpo.checkPrivacyPolicy().click();
		rpo.clickContinue().click();
		String expectedResult = "Your Account Has Been Created!";
		String actualResult = rpo.registrationSuccessfully().getText();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		}

	@Test
	public void verifyRegisterationWithValidBlankData() throws IOException {
		
		initalizeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		homePageObjects hpo = new homePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnRegister().click();

		registerPageObject rpo = new registerPageObject(driver);
		rpo.clickContinue().click();
		
		String firstnameExpected = Constants.firstNameRegistrationErrorMessage;
		String firstnameActual = rpo.diaplayFirstnameErrorMessage().getText();
		CommanMethods.handleAsseration(firstnameActual, firstnameExpected);
		
		String lastnameExpected = Constants.lastNameRegistrationErrorMessage;
		String lastnameActual =rpo.diaplayLastnameErrorMessage().getText();
		CommanMethods.handleAsseration(lastnameActual, lastnameExpected);
		
		String emailExpected= Constants.emailRegistrationErrorMessage;
		String emailActual = rpo.diaplayEmailErrorMessage().getText();
		CommanMethods.handleAsseration(emailActual, emailExpected);
		
		String telephoneExpected = Constants.telephoneRegistrationErrorMessage;
		String telephoneActual = rpo.diaplayTelephoneErrorMessage().getText();
		CommanMethods.handleAsseration(telephoneActual, telephoneExpected);
		
		String passwordExpected = Constants.passwordRegistrationErrorMessage;
		String passwordActual = rpo.diaplayPasswordErrorMessage().getText();
		CommanMethods.handleAsseration(passwordActual, passwordExpected);
		
		String warningMessageExpected = Constants.checkBoxRegistrationErrorMessage;
		String warningMessageActual = rpo.diaplayWarningErrorMessage().getText();
		CommanMethods.handleAsseration(warningMessageActual, warningMessageExpected);


	}

}
