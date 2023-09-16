package PageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoPageObj {
	public WebDriver driver;
	public MyInfoPageObj(WebDriver driver) {
		this.driver=driver;
	} 
		
	private By MyInfo = By.xpath("//span[normalize-space()='My Info']");
	private By Fname = By.xpath("//input[@name='firstName']");
	private By Mname = By.xpath("//input[@name='middleName']");
	private By Lname = By.xpath("//input[@name='lastName']");
	private By nationalityDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By nationalityOptions = By.xpath("//div[@class='oxd-select-option']");
	private By EmployeeID = By.xpath("(//div[@data-v-957b4417='']/input)[5]");
	
	public WebElement ClickMyInfo()
	{
		return driver.findElement(MyInfo);
	}
	public WebElement FirstName()
	{
		return driver.findElement(Fname);
	}
	public WebElement MiddleName() {
		return driver.findElement(Mname);
	}
	public WebElement LastName() {
		return driver.findElement(Lname);
	}
	public WebElement EmpID()
	{
		return driver.findElement(EmployeeID);
	}
	public WebElement ClickOnNationalityDropdown()
	{
		return driver.findElement(nationalityDropdown);
	}
	public List<WebElement> ChooseNationality(){
		return driver.findElements(nationalityOptions);
	}
	
	
	}	

