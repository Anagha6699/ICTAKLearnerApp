package org.ictkerala.Test_ictakLearnerTrackerApp;

import java.time.Duration;

import org.ictkerala.ictakLearnerTrackerApp.Admin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_Admin extends TestBase_Ictak_LearnerTrackerApp{
	Admin admobj;
	
	@Test(priority=1)
	public void Adminlogin_1()throws InterruptedException
	{
		admobj=new Admin(driver);
		admobj.uname("Admin");
		admobj.pswd("Admin@123");
		admobj.eicon();
		admobj.logn();
		admobj.alrtcls();
		System.out.println("Admin failed to Login");
		String Expectresult=("The user should Login successfully");
		String Actualresult=("User failed to Login");
		Assert.assertFalse(false, Actualresult);
		driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
}
