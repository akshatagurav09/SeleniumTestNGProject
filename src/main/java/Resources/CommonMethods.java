package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;
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
}
