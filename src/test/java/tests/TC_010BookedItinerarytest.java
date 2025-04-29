package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.BookedItineraryPage;
import pages.HomePage;



public class TC_010BookedItinerarytest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() {
		
		SheetName="validLoginData";
		testName="BookedItinerary test";
		testAuthor="Joyson";
		testCategory="Smoketest";
		testDescription="Register test with Negative scenarios";
		
	}
	
	@Test(dataProvider = "readData")
    
	public void BookedItineraryTest(String UN, String Pass) throws IOException, InterruptedException
	{
		HomePage obj=new HomePage(driver);
		
		          obj.EnterLUn(UN)
		              .EnterLPass(Pass)
		              .ClickLogin()
		              .ClickBookedItinerary()
		              .VerifyBookedtext()
		              .SelectAllOrderID()
		              .ClickFirstOrderID()
		              .ClickSecOrderID()
		              .CancelSelectAll();
		          
		  BookedItineraryPage obj1=new   BookedItineraryPage(driver);
		              obj1.SearchOrderId()
		              .ClickGo()
		              .SelectedOrderDisplay()
		              .ClickShowAll()
		              .searchHotelBookedItin()
		              .ClickBookedItinerary()
		              .ClickLogoutBookedItiner()
		              .ClickHereLoginAftrLogout();
	}
}