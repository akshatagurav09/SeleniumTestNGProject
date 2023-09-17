package Resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleAssertion(String Actual, String Expected) {
		
		SoftAssert sa = new SoftAssert();
		String ExpectedText = Expected;
		String ActualText = Actual;
		sa.assertEquals(ActualText, ExpectedText);

		sa.assertAll();
	}
	
	public static void handleDropdown(List<WebElement> a, String text)
	{
		
		List<WebElement> obj = a;
		
		for (WebElement w:obj)
		{
			if(w.getText().equalsIgnoreCase(text))
			{
				w.click();
				break;
			}
		}
	}
	
	public static void expWait(WebDriver driver, WebElement xpath, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
	}
	
}
