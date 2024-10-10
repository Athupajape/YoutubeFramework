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
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC6 extends Base{	
	@Test
	public void Login() throws InterruptedException {
		LoginPage lp=new LoginPage(driver,pr);
		lp.signIn("dummypajape@gmail.com", "Dummytest@123");
		VideoPage vp=new VideoPage(driver,pr);
		vp.videoPlay();
		vp.Comments();
		lp.signout();
	}
	
}
