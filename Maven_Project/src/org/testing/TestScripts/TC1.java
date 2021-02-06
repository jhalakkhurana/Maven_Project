package org.testing.TestScripts;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;

import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TC1 extends BaseClass {
//ChromeDriver driver ;

@Test(dataProvider ="dp1")
public void xyz(String username, String Password) throws InterruptedException, IOException
{
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(Password);
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@type ='submit']")).click();
    ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\ishandiwan\\Desktop\\Screenshot\\p001.1.png");
	LogsCapture.takeLogs("Login Sucessfully:DDT", "TC1");

	}

@DataProvider

public Object[][] dp1()
{
	
	Object[][] ob = new Object[3][2];
	ob[0][0]= "1200" ;
	ob[0][1]= "1200" ;
	ob[1][0]= "1200" ;
	ob[1][1]= "1200" ;
	ob[2][0]= "1200" ;
	ob[2][1]= "1200" ;

	return ob;
	
	
}
}

