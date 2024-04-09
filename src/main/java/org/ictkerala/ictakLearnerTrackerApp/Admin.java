package org.ictkerala.ictakLearnerTrackerApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	WebDriver driver;
	
	@FindBy(xpath="//p[@class='fw-light fs-3']")
	private WebElement ICTLearnerHomepage;
	@FindBy(xpath="//input[@id='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='button']")
	private WebElement Eyeicon;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement Login;
	@FindBy(xpath="//button[@class='btn-close']")
	private WebElement Alertclose;
	
	public Admin(WebDriver driver)
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
		Eyeicon.click();;
	}
	public void logn()
	{
		Login.click();;
	}
	public void alrtcls()
	{
		Alertclose.click();
	}
	
}
