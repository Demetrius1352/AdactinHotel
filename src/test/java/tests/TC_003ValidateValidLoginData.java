package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003ValidateValidLoginData extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup() {
		
		SheetName="validLoginData";
		testName="ValidateLogin test";
		testAuthor="Joyson";
		testCategory="Smoketest";
		testDescription="Login test with Positive scenarios ";
		
	}
	
	@Test(dataProvider = "readData")
	
	public void ValidateLogin(String Un, String pass)
	{
		HomePage obj = new HomePage(driver);
		          obj.EnterLUn(Un)
		             .EnterLPass(pass)
		             .ClickLogin()
		             .verifyLogin();
}
}