package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC6 extends Base{	
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
		
		
		driver.findElement(By.xpath(pr.getProperty("playspecificvideo"))).click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.cssSelector(pr.getProperty("commentsinput"))).click();
		driver.findElement(By.cssSelector(pr.getProperty("comments"))).sendKeys("Nice");

		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("commentbtn"))).click();

		driver.findElement(By.id(pr.getProperty("signoutIconid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("signout"))).click();
		Thread.sleep(5000);
	}
	
}
