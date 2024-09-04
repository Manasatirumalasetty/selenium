package javascriptexecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginBTN = driver.findElement(By.xpath("//button[.='Log in']"));
		js.executeScript("arguments[0].removeAttribute('disabled' , 'disabled')", loginBTN);
		Thread.sleep(2000);
		loginBTN.click();
		Thread.sleep(3000);
		String errormsg = driver.findElement(By.className("_ab2z")).getText();
		System.out.println(errormsg);
		driver.quit();
		

	}

}
