package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 extends Base{
	
	@Test
	public void Login() throws InterruptedException {
		LoginPage lp=new LoginPage(driver,pr);
		lp.signIn("dummypajape@gmail.com", "Dummytest@123");
		VideoPage vp=new VideoPage(driver,pr);
		vp.videoPlay();
		vp.watchLater();
		lp.signout();
	}
}
