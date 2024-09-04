package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptalert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert a =driver.switchTo().alert();
//        System.out.println(a.getText());
//        a.accept();
        
//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        Alert a =driver.switchTo().alert();
//        Thread.sleep(3000);
//        System.out.println(a.getText());
//        a.dismiss();
        
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert a =driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(a.getText());
        a.sendKeys("asdfgtre");
        Thread.sleep(3000);
        a.accept();
        
        String result =driver.findElement(By.id("result")).getText();
        System.out.println(result);
        driver.quit();
	}
}
