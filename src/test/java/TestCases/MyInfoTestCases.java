package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjects;
import PageObjectModels.MyInfoPageObj;
import Resources.CommonMethods;
import Resources.baseClass;

public class MyInfoTestCases extends baseClass{
		
		@Test
		public void fillPersonalDetails() throws IOException, InterruptedException
		{
			Thread.sleep(2000);
			
			LoginPageObjects lpo = new LoginPageObjects(driver);
			lpo.enterUserName().sendKeys("Admin");
			lpo.enterPassword().sendKeys("admin123");
			lpo.clickOnLogin().click();
			
			MyInfoPageObj mpo = new MyInfoPageObj(driver);
			Thread.sleep(3000);
			mpo.ClickMyInfo().click();
			
			Thread.sleep(2000);
			mpo.FirstName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			mpo.FirstName().sendKeys("Ak123");
			
			Thread.sleep(1000);
			mpo.MiddleName().sendKeys("abcd");
			mpo.LastName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			mpo.LastName().sendKeys("G789");
			Thread.sleep(2000);
			mpo.EmpID().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			mpo.EmpID().sendKeys("12345");
			
			Thread.sleep(2000);
			mpo.ClickOnNationalityDropdown().click();
			
			Thread.sleep(2000);
			
			CommonMethods.handleDropdown(mpo.ChooseNationality(), "Indian");
			
			//CommonMethods.handleDropdown(mpo.SelectMarriageStatus, "Married");
			
			
			Thread.sleep(3000);
		}
}