import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Varifyannotions {
	@Test
	public void Testcase0()
	{
		System.out.println("test case0...");
	}
	@BeforeMethod
	public void Testcaase1()
	{
		System.out.println("BeforeMethod...");
	}
	@AfterMethod
	public void Testcaase2()
	{
		System.out.println("AfterMethod...");
	}
	@BeforeClass
	public void Testcaase3()
	{
		System.out.println("BeforeClass...");
	}
	@AfterClass
	public void Testcaase4()
	{
		System.out.println("Afterclass...");
	}
	@BeforeTest
	public void Testcaase5()
	{
		System.out.println("Beforetest...");
	}
	@AfterTest
	public void Testcaase6()
	{
		System.out.println("Aftertest...");
	}
	@BeforeSuite
	public void Testcaase7()
	{
		System.out.println("BeforeSuite...");
	}
	@AfterSuite
	public void Testcaase8()
	{
		System.out.println("AfterSuite...");
	}
}
