package org.ictkerala.ictakLearnerTrackerApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TrainerHeader {
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
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/a[1]/button")
	private WebElement Addlearner;
	@FindBy(xpath="//input[@type='text' and @id='learnerid']")
	private WebElement LearnerId;
	@FindBy(xpath="//input[@id='name']")
	private WebElement Name;
	@FindBy(xpath="//select[@name='course']")
	private WebElement Course;
	@FindBy(xpath="//option[@value='ST']")
	private WebElement CourseOption;
	@FindBy(xpath="//select[@name='project']")
	private WebElement Project;
	@FindBy(xpath="//option[@value='ICTAK']")
	private WebElement ProjectOption;
	@FindBy(xpath="//select[@name='batch']")
	private WebElement Batch;
	@FindBy(xpath="//option[@value='Aug_22']")
	private WebElement BatchOption;
	@FindBy(xpath="//select[@name='cstatus']")
	private WebElement CourseStatus;
	@FindBy(xpath="//option[@value='Qualified']")
	private WebElement CourseStatusOption;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Submit;
	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement OKbox;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	private WebElement BacktoDashboard;

	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/a[2]/button")
	private WebElement AddBulkLearners;
	@FindBy(xpath="//input[@type='file']")
	private WebElement Choosecsvfile;
	@FindBy(xpath="//button[@class='ui grey mini button']")
	private WebElement Submit1;
	@FindBy(xpath="//button[@type=\"button\" and @class='swal2-confirm swal2-styled']")
	private WebElement ReturntoDashboard;
	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled' and @style='display: inline-block;']")
	private WebElement Savedalertbox;
	@FindBy(xpath="//button[@class='ui mini button']")
	private WebElement Cancel;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[1]/table/tbody/tr[1]/td[8]/button")
	private WebElement Edit;
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[1]/table/tbody/tr[1]/td[9]/button")
	private WebElement Delete;
	@FindBy(xpath="//a[@class='mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1']")
	private WebElement Logo;
	
	
	public TrainerHeader(WebDriver driver)
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
	public void relogn()
	{
		Login.click();
	}
	public void addlearner()
	{
		Addlearner.click();
	}
	public void learnerid(String ID)
	{
		LearnerId.sendKeys(ID);
	}
	public void nam(String name)
	{
		Name.sendKeys(name);
	}
	public void crce()
	{
		Course.click();
	}
	public void crceop()
	{
		CourseOption.click();
	}
	public void prjt()
	{
		Project.click();
	}
	public void prjtop()
	{
		ProjectOption.click();
	}
	public void btch()
	{
		Batch.click();
	}
	public void btchop()
	{
		BatchOption.click();
	}
	public void crcestatus()
	{
		CourseStatus.click();
	}
	public void crcestatusop()
	{
		CourseStatusOption.click();
	}
	public void sbmt()
	{
		Submit.click();
	}
	public void ok()
	{
		OKbox.click();
	}
	
	public void bktodash()
	{
		BacktoDashboard.click();
	}
	
	public void addblklrner()
	{
		AddBulkLearners.click();
	}
	public void chsecsvfle(String path)
	{
		Choosecsvfile.sendKeys(path);
	}	
	public void Sumbt()
	{
		Submit1.click();	
	}
	public void retntodshbd()
	{
		ReturntoDashboard.click();
	}
	public void svdalrt()
	{
		Savedalertbox.click();
	}
	public void cncl()
	{
		Cancel.click();
	}
	
	public void edt()
	{
		Edit.click();
	}
	public void dlt()
	{
		Delete.click();
	}
	public void log()
	{
		Logo.click();
	}
}
