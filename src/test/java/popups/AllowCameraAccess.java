package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllowCameraAccess {
	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://webcamtests.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("webcam-launcher")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
