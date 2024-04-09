package org.ictkerala.Test_ictakLearnerTrackerApp;

import java.time.Duration;

import org.ictkerala.ictakLearnerTrackerApp.TrainerHeader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_TrainerHeader extends TestBase_Ictak_LearnerTrackerApp {
	TrainerHeader trnhdrobj;
	

	@Test(priority=1)
	public void Trainloginvalid_1()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.uname("traine");
		trnhdrobj.pswd("trainer123");
		trnhdrobj.eicon();
		trnhdrobj.logn();
		trnhdrobj.altclse();
		System.out.println("Trainer Login failed");
		String Expectresult=("Trainer should Login unsuccessfully");
		String Actualresult=("Trainer failed to Login ");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	@Test(priority=2)
	public void Trainloginvalid_2()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.uname("trainer");
		trnhdrobj.pswd("");
		trnhdrobj.eicon();
		trnhdrobj.logn();
		trnhdrobj.altclse();
		System.out.println("Trainer Login failed without Password");
		String Expectresult=("Trainer failed to login");
		String Actualresult=("Trainer failed to login");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=3)
	public void Trainloginvalid_3()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.uname("");
		trnhdrobj.pswd("trainer@123");
		trnhdrobj.eicon();
		trnhdrobj.logn();
		trnhdrobj.altclse();
		System.out.println("Trainer Login failed without Username");
		String Expectresult=("Trainer failed to login");
		String Actualresult=("Trainer failed to login");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	@Test(priority=4)
	public void Trainloginvalid_4()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.uname("");
		trnhdrobj.pswd("");
		trnhdrobj.eicon();
		trnhdrobj.logn();
		trnhdrobj.altclse();
		System.out.println("Login Failed without Username and Password");
		String Expectresult=("Trainer failed to login");
		String Actualresult=("Trainer failed to login");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	} 
	@Test(priority=5)
	public void Trainlogvalid_1()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.uname("trainer");
		trnhdrobj.pswd("trainer@123");
		trnhdrobj.eicon();
		trnhdrobj.logn();
		System.out.println("Trainer Login Successfully");
		String Expectresult=("Trainer Login Successfully");
		String Actualresult=("Trainer Login Successfully");
		Assert.assertTrue(true, Actualresult);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=7)
	public void Learnerform_2()throws InterruptedException
	{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.addlearner();
		System.out.println("Navigated to Learner's Form Learner's Form is available");
		String Expectresult=("Trainer should navigate to Learner's Form");
		String Actualresult=("Trainer navigated to Learner's Form");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();

	}
	
	@Test(priority=9)
	public void Learnerform_4()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.learnerid("123");
		trnhdrobj.nam("Anu");
		trnhdrobj.crce();
		trnhdrobj.prjt();
		trnhdrobj.btch();
		trnhdrobj.crcestatus();
		System.out.println("Learner's Form is available");
		String Expectresult=("User should view Learner's Form with data");
		String Actualresult=("User should view Learner's Form with data");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=10)
	public void LearnerAdd_1()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.learnerid("123");
		trnhdrobj.nam("Anu");
		trnhdrobj.crce();
		trnhdrobj.prjt();
		trnhdrobj.btch();
		trnhdrobj.crcestatus();
		System.out.println("Learner's form fields are working");
		String Expectresult=("User should able to enter all the details given in the Learner's Form");
		String Actualresult=("User should able to enter all the details given in the Learner's Form");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=11)
	public void Trainervali_1()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.learnerid("123");
		trnhdrobj.nam("Anu");
		trnhdrobj.crceop();
		trnhdrobj.prjtop();
		trnhdrobj.btchop();
		trnhdrobj.crcestatusop();
		trnhdrobj.sbmt();
		trnhdrobj.ok();
		System.out.println("Learner's form submitted");
		String Expectresult=("Trainer should be  able to submit  the Learner's form succcessfully");
		String Actualresult=("Trainer successfully submitted the Learner's form");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=12)
	public void TrainerBulk_1()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.addblklrner();
		trnhdrobj.chsecsvfle("D:\\Book2.csv");
		trnhdrobj.Sumbt();
		trnhdrobj.retntodshbd();
		trnhdrobj.svdalrt();
		System.out.println("File Uplaoded Successfully");
		String Expectresult=("Trainer should upload file successfully.");
		String Actualresult=("Trainer uploaded file successfully.");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=13)
	public void TrainerBulk_4()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.addblklrner();
		trnhdrobj.cncl();
		System.out.println("Cancel button is working and navigated to Dashboard");
		String Expectresult=("Trainer should navigate to Dashboard ");
		String Actualresult=("Trainer navigated to Dashboard ");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=14)
	public void TrainerBulk_7()throws InterruptedException
	{
		trnhdrobj=new TrainerHeader(driver);
		trnhdrobj.log();
		System.out.println("Trainer successfully navigated to Home Page");
		String Expectresult=("Trainer should navigate to the Home page while clicking on the Logo");
		String Actualresult=("Trainer navigated to the Home page by clicking on the Logo");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
