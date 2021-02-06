package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Assertion.Asseration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.Assertion;

public class BaseClass {
	public ChromeDriver driver ;
	public Properties pr ;
	@BeforeMethod
	public void abc () throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "../FB_FrameWork/chromedriver.exe") ;
		driver = new ChromeDriver() ;
	driver.get("https://www.patshala.com/login.php");
Assert.assertEquals(driver.getCurrentUrl(), "https://www.patshala.com/login.php");
	
	Asseration.assert1("https://www.patshala.com/login.php", driver.getCurrentUrl());
driver.manage().window().maximize();
File f = new File("../FB_FrameWork/src/Object.properties");
 FileReader fr  = new FileReader (f);
 pr = new Properties();
 pr.load(fr);
}
@AfterMethod
public void xyx()
{
driver.close();
}
}