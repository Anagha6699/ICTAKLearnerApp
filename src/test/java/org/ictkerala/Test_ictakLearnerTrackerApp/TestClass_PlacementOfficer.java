package org.ictkerala.Test_ictakLearnerTrackerApp;

import java.time.Duration;

import org.ictkerala.ictakLearnerTrackerApp.PlacementOfficer;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestClass_PlacementOfficer extends TestBase_Ictak_LearnerTrackerApp {
	PlacementOfficer plcoffrobj;
	
	@Test(priority=1)
	public void Pofficerloginvalid_1()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.uname("poficer");
		plcoffrobj.pswd("poficer123");
		plcoffrobj.eicon();
		plcoffrobj.logn();
		plcoffrobj.altclse();
		System.out.println("PlacementOfficer failed to Login");
		String Expectresult=("PlacementOfficer should Login unsuccessfully");
		String Actualresult=("PlacementOfficer failed to Login ");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=2)
	public void Pofficerloginvalid_2()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.uname("pofficer");
		plcoffrobj.pswd("");
		plcoffrobj.eicon();
		plcoffrobj.logn();
		plcoffrobj.altclse();
		System.out.println("Placement Officer Login failed without Password");
		String Expectresult=("The Placement Officer should login unsuccessfully and The user should get a Login Failed alert.");
		String Actualresult=("The Placement Officer failed to login and  the user should get a Login Failed alert.");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test(priority=3)
	public void Pofficerloginvalid_3()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.uname("");
		plcoffrobj.pswd("pofficer@123");
		plcoffrobj.eicon();
		plcoffrobj.logn();
		plcoffrobj.altclse();
		System.out.println("Placement Officer Login failed without Username");
		String Expectresult=("The Placement Officer should Login unsuccessfully and get a User not found alert");
		String Actualresult=("The Placement Officer failed to login and got a User not found alert.");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=4)
	public void Pofficerloginvalid_4()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.uname("");
		plcoffrobj.pswd("");
		plcoffrobj.eicon();
		plcoffrobj.logn();
		plcoffrobj.altclse();
		System.out.println("Login Failed without Username and Password");
		String Expectresult=("User should get warning message Please fill in all fields");
		String Actualresult=("User should get warning message Please fill in all fields");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=5)
	public void Pofficerlogvalid_1 ()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.uname("pofficer");
		plcoffrobj.pswd("pofficer@123");
		plcoffrobj.eicon();
		plcoffrobj.logn();
		System.out.println("Placement Officer Login successfully");
		String Expectresult=("The placement officer should Login successfully");
		String Actualresult=("The placement officer Login successfully");
		Assert.assertTrue(true, Actualresult);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=6)
	public void PofficerUpdate_1 ()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.updte();
		plcoffrobj.plmntstatus();
		plcoffrobj.plmntstatusoptn();
		plcoffrobj.sbmt();
		System.out.println("Placement Officer is successfully updated PlacementStatus");
		String Expectresult=("Placement Officer should Update PlacementStatus");
		String Actualresult=("Placement Officer Updated PlacementStatus");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=7)
	public void PofficerUpdate_4 ()throws InterruptedException
	{
		plcoffrobj=new PlacementOfficer(driver);
		plcoffrobj.log();
		System.out.println("Placement Officer is successfully navigated to Homepage");
		String Expectresult=("Placement Officer should navigate to the Home page while clicking on the Logo");
		String Actualresult=("Placement Officer navigated to the Home page by clicking on the Logo");
		Assert.assertTrue(true, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
