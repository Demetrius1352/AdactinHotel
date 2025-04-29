package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.Utility;

public class ProjectSpecificationMethods extends Utility{
    @BeforeSuite
	public void reportIniatialization() {
		
		// To create report in the given location
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\ADMIN\\eclipse-workspace\\adactinhotel\\src\\test\\resources\\report\\HotelBookingreporter.html");
		reporter.config().setReportName("HotelBooking report");
		
		// to capture the test data
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
	}
	
	@BeforeClass
	public void testDetails() {
		
		test = extent.createTest(testName,testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);

	}
	
	
	@BeforeMethod
	 public void LauchingAndLoadingURL() {
		
		 LaunchBrowser("chrome","https://adactinhotelapp.com/index.php");
	 }
	
	@AfterMethod
	public void closingBrowser()
	{
		closeBrowser();
	}
	
	@DataProvider
	public String[][] readData() throws Exception {
		
		String[][] data = readExcelData(SheetName);
		return data;
	}
	
	@AfterSuite
	public void closeReport() {
		
		extent.flush();
	}
	

}