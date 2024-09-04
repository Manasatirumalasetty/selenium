package demoqspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
        driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("asdfghjkjhg");
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("asdfghjkjhg");
		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
