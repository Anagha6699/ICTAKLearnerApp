package org.ictkerala.Test_ictakLearnerTrackerApp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class TestBase_Ictak_LearnerTrackerApp {
	
	WebDriver driver;
	String expadmn="Admin";
	String exptrnerhdr="TrainerHeader";
	String expplmtoff="PlacementOfficer";
	
	@BeforeClass
	public void testmain()
	{
		driver=new ChromeDriver();
		driver.get("https://learnertracker.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

}
