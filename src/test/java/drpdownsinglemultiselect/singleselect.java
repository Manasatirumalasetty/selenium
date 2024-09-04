package drpdownsinglemultiselect;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselect {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement alldropdown =driver.findElement(By.id("searchDropdownBox"));
	    Select select =new Select(alldropdown);
	    select.selectByIndex(11);
	    Thread.sleep(2000);
	    select.selectByValue("search-alias=jewelry");
	    Thread.sleep(2000);
	    select.selectByVisibleText("Movies & TV Shows");
	    
	    List<WebElement> options =select.getOptions();
	    for(WebElement e: options)
		{
			System.out.println(e.getText());
		}
	    if(select.isMultiple())
	    {
	    	System.out.println("multiple select");
	    }
	    else
	    {
	    	System.out.println("single select");
	    }
	    	driver.quit();

	}
}
