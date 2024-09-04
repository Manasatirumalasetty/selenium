package autosuggestions;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class movetoelement {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
			WebElement MouseActions=driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
			Actions actions =new Actions(driver);
			actions.scrollToElement(MouseActions).perform();
			MouseActions.click();
			
			driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
//			WebElement pwdTF =
					driver.findElement(By.xpath("//input[@class='p-2 w-80 border-2 border-stone-500 rounded-md mt-2 mb-4']")).click();
//			Actions actions1 =new Actions(driver);
//			actions1.moveToElement(pwdTF).click().perform();
			Thread.sleep(2000);
			driver.quit();
			
		}

	}


