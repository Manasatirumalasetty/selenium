package demoqspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttons {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[@class=\"poppins text-[14px]\"])[2]")).click();
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		WebElement buttons = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(buttons.getText());
		Actions actions = new Actions(driver);
		actions.click(buttons).build().perform();
		Thread.sleep(2000);
		System.out.println("default");

		
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		WebElement r = driver.findElement(By.xpath("//button[text()='Right Click']"));
		Actions actions1 = new Actions(driver);
		actions1.contextClick(r).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		WebElement buttons1 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(buttons1.getText());
		Thread.sleep(2000);
		System.out.println("rightclick");

				
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement r1 = driver.findElement(By.xpath("//button[@id='btn20']"));
		Actions actions2 = new Actions(driver);
		actions2.doubleClick(r1).perform();
		WebElement buttons2 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(buttons2.getText());
		Thread.sleep(2000);
		System.out.println("double click");
		
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		driver.findElement(By.xpath("//input[@value=\"Yes\"]")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		WebElement buttons3 = driver.findElement(By.xpath("//span[text()='You Selected \"Yes\"']"));
		System.out.println(buttons3.getText());
		System.out.println("submitclick");

		Thread.sleep(2000);
		driver.quit();
	}
}
