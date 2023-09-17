package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.LoginPageObjects;
import Resources.CommonMethods;
import Resources.Constants1;
import Resources.baseClass;

public class LoginTestCases extends baseClass {
	
	//Added one new line for git demo purpose
	public SoftAssert sa;
	
	@Test(priority=0)
	public void verifyValidLogin() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterUserName().sendKeys("Constants1.ValiduserName");
		
		lpo.enterPassword().sendKeys(Constants1.validPassword);
		lpo.clickOnLogin().click();
		Thread.sleep(2000);
		
		CommonMethods.handleAssertion(driver.getCurrentUrl(), Constants1.ExpectedURL);
		
		}
	
	@Test(priority=1)
	public void verifyInValidLogin() throws IOException, InterruptedException
	{
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterUserName().sendKeys(Constants1.InvalidUser);
		
		
		lpo.enterPassword().sendKeys(Constants1.Invalidpassword);
		lpo.clickOnLogin().click();
		Thread.sleep(2000);
		
		CommonMethods.handleAssertion(lpo.InvalidLogin().getText(),Constants1.InvalidLoginExpectedtext);
		
		}
}
