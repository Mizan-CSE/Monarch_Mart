package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePackage.DriverSetup;

public class TC_001_LoginWithPositiveData extends DriverSetup{
	
	public static String baseurl = "https://monarchmart.com";
	
	@Test
	public static void loginWithPositiveData() throws InterruptedException
	{
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("01773337470");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[2]/button[1]")).click();
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(5000);
	
		System.out.println("Login By: "+driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/a[1]")).getText());
	}

}
