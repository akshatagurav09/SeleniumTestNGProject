package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
		
		public WebDriver driver;
		private By userName = By.xpath("//input[@name='username']");
		private By password = By.xpath("//input[@name='password']");
		private By click = By.xpath("//button[@type='submit']");
		private By FailedActualText=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
		//private By SuccessActualText = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
		
		
		public LoginPageObjects(WebDriver driver2) {
			this.driver =driver2;
		}

		public WebElement enterUserName()
		{
				return driver.findElement(userName);
				
		}
		public WebElement enterPassword()
		{
				return driver.findElement(password);
		}
		public WebElement clickOnLogin()
		{
				return driver.findElement(click);
		}
		/*
		public WebElement validLogin()
		{
			return driver.findElement(SuccessActualText);
		}  */
		public WebElement InvalidLogin() {
			return driver.findElement(FailedActualText);
		}
		
}
