package registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePackage.DriverSetup;

public class TC_001_RegistrationWithPositiveData extends DriverSetup{
	
	public static String baseurl = "https://monarchmart.com/";
	
	@Test
	public static void RegistrationWithPositiveData() throws InterruptedException
	{
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='xname']")).sendKeys("Md. Mijanur Rahman");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#phone-code")).sendKeys("01773337470");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("body.homepage:nth-child(2) div.aiz-main-wrapper.d-flex.flex-column:nth-child(1) section.gry-bg.py-4 div.profile div.container div.row div.col-xxl-4.col-xl-5.col-lg-6.col-md-8.mx-auto div.card div.px-4.py-3.py-lg-4 div:nth-child(1) form.form-default div.form-group:nth-child(7) > input.form-control")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("body.homepage:nth-child(2) div.aiz-main-wrapper.d-flex.flex-column:nth-child(1) section.gry-bg.py-4 div.profile div.container div.row div.col-xxl-4.col-xl-5.col-lg-6.col-md-8.mx-auto div.card div.px-4.py-3.py-lg-4 div:nth-child(1) form.form-default div.form-group:nth-child(8) > input.form-control")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[7]/label[1]/span[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		Thread.sleep(15000);
	}

}
