package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;


public class TC_004ValidateInvalidLoginData extends ProjectSpecificationMethods{

	
	@BeforeTest
	public void setup() {
		
		SheetName="InvalidLoginData";
		testName="ValidateLogin test";
		testAuthor="Joyson";
		testCategory="Smoketest";
		testDescription="Login test with Negative scenarios ";
		
	}
	
	@Test(dataProvider = "readData")
	
	public void ValidateInvalidLogin(String Un, String pass, String Testtype, String Expectedresult)
	{
		HomePage obj = new HomePage(driver);
		
		         obj.EnterLUn(Un)
		             .EnterLPass(pass)
		             .ClickLoginInvalid()
		              .validateLoginDetails(Testtype, Expectedresult)
		             .validateForgotSubmissionForm(Testtype, Expectedresult);
	}
	
}