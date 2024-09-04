
	package popups;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AuthenticatePopups {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	       String text= driver.findElement(By.tagName("p")).getText();
	        System.out.println(text);
	        driver.quit();

		}
	}


