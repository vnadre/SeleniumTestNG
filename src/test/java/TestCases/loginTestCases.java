package TestCases;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.homePageObjects;
import pageObjectModel.loginPageObjects;
import pageObjectModel.registerPageObject;
import resources.BaseClass;
import resources.CommanMethods;
import resources.Constants;

public class loginTestCases extends BaseClass{
	@Test
	public void verifyLoginWithValidData () throws IOException, InterruptedException{
		
		homePageObjects hpo = new homePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnLogin().click();
		
		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterEmail().sendKeys(emailAddress);
		lpo.enterPassword().sendKeys(Constants.password);
		lpo.clickLogin().click();
		
		SoftAssert sa = new SoftAssert();
		String ExpectedLoginResult = "Account";
		String ActualLoginResult = lpo.loginInSuccessfully().getText();
		CommanMethods.handleAsseration(ActualLoginResult, ExpectedLoginResult);
		
		
	}

}
