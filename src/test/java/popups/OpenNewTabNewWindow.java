package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabNewWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     
	      
	      driver.switchTo().newWindow(WindowType.TAB);
	      driver.get("https://x.com/");
	      
	      driver.switchTo().newWindow(WindowType.WINDOW);
	      driver.get("https://in.bookmyshow.com/");
	      
	      Thread.sleep(2000);
	      	driver.quit();
	}

}