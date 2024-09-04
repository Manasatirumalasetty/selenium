package frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(3000);
	WebElement signin=driver.findElement(By.className("accountUserName"));
	Actions actions=new Actions(driver);
	actions.moveToElement(signin).perform();
	
	driver.findElement(By.xpath("//a[text()='login']")).click();
	//driver.findElement(By.linkText("https://www.snapdeal.com/login")).click();
	driver.switchTo().frame("loginIframe");
	driver.findElement(By.id("userName")).sendKeys("123467890");
	driver.findElement(By.id("close-pop")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.name("keyword")).sendKeys("toys");
	driver.findElement(By.className("searchformButton")).click();
	
	driver.quit();
	}
}
