package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConfirm {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		a.sendKeys("ABCDEF");
		a.accept();
		
		String result=driver.findElement(By.id("result")).getText();
		System.out.println(result);
		driver.quit();



	}


	}