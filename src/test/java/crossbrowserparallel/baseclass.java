package crossbrowserparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseclass {
	WebDriver driver;
	@Parameters("BROWSER")
	@BeforeClass	
	public void classConfig(String browser)
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
		driver =new ChromeDriver(); 
		System.out.println("Chrome");
		}
		else if (browser.equalsIgnoreCase ("firefox"))
		{ driver= new ChromeDriver();

		System.out.println("Firefox");

		} else if (browser.equalsIgnoreCase ("edge")) 
		{ driver =new ChromeDriver();

		System.out.println("Edge");
		}
		else

		System.out.println("Invalid browser info");

		driver.manage().window().maximize();
	}
	@AfterClass
	public void deconfig() {
		driver.quit();
	}
}
