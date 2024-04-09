package org.ictkerala.ictakLearnerTrackerApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlacementOfficer {
	WebDriver driver;
	
	@FindBy(xpath="//p[@class='fw-light fs-3']")
	private WebElement ICTLearnerHomepage;
	@FindBy(xpath="//input[@name='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//button[@class='btn btn-outline-secondary']")
	private WebElement Eyeicon;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement Login;
	@FindBy(xpath="//button[@class='btn-close']")
	private WebElement alertclose;
	@FindBy(xpath="//div[@class='table-responsive']//following::button[1]")
	private WebElement Update_btn;
	@FindBy(xpath="//select[@name='pstatus']")
	private WebElement PlacementStatus;
	@FindBy(xpath="//option[@value='Placed']")
	private WebElement PlacementStatusOption;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Submit;
	@FindBy(xpath="//a[@class='mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1']")
	private WebElement Logo;
	
	public PlacementOfficer(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void uname(String uname)
	{
		Username.sendKeys(uname);
	}
	public void pswd(String passwrd)
	{
		Password.sendKeys(passwrd);
	}
	public void eicon()
	{
		Eyeicon.click();
	}
	public void logn()
	{
		Login.click();
	}
	public void altclse()
	{
		alertclose.click();
	}
	public void updte()
	{
		Update_btn.click();
	}
	public void plmntstatus()
	{
		PlacementStatus.click();
	}
	public void plmntstatusoptn()
	{
		PlacementStatusOption.click();
	}
	public void sbmt()
	{
		Submit.click();
	}
	public void log()
	{
		Logo.click();
	}
	
	
}
