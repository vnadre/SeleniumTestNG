package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommanMethods {

	public static void handleAsseration(String actualResult , String expectedResult) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		sa.assertAll();
	}
	
	public static void handlExplictWait(WebDriver driver, int time, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(locator));

	}
	
	
}
