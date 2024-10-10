package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base{
	
	@Test
	public void Login() throws InterruptedException {
		LoginPage lp=new LoginPage(driver,pr);
		lp.signIn("dummypajape@gmail.com", "Dummytest@123");
		HomePage hp=new HomePage(driver,pr);
		hp.history();
		lp.signout();
	}
	
}
