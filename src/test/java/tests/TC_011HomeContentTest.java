package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;


public class TC_011HomeContentTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setup() {
		
		testName="HomeContent test";
		testAuthor="Joyson";
		testCategory="Smoketest";
		testDescription="Home Content test with positive scenarios";
		
	}
	
	@Test
	public void HomeContentTest() throws IOException
	{
		HomePage obj=new HomePage(driver);
		          obj.LogoScreenshot()
		             .CheckQueryEmail()
		             .checkEmailClickable();
	}
	
	

}