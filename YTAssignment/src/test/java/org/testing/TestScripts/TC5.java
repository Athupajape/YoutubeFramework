package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 extends Base{
	
	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("signin"))).click();
		
		driver.findElement(By.xpath(pr.getProperty("loginemail"))).sendKeys("dummypajape@gmail.com");
		driver.findElement(By.xpath(pr.getProperty("loginemailbtn"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("loginpwd"))).sendKeys("Dummytest@123");
		driver.findElement(By.xpath(pr.getProperty("loginpwdbtn"))).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(pr.getProperty("videoplay"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(pr.getProperty("subscribe"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(pr.getProperty("signoutIconid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("signout"))).click();
		Thread.sleep(5000);
	}

}
