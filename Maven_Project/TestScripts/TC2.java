package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;

import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class TC2 extends BaseClass {
//ChromeDriver driver ;
@Test(dataProvider ="dp1")
public void xyz(String username, String Password) throws InterruptedException, IOException
{
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(Password);
    Thread.sleep(9000);
	
    driver.findElement(By.xpath("//button[@type ='submit']")).click();
    ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\ishandiwan\\Desktop\\Screenshot\\p001.2.png");
	LogsCapture.takeLogs("Login Sucessfully using Excel", "TC2");

}

@DataProvider

public Object[][] dp1() throws BiffException, IOException
{
	
File f =  new File("C:\\Users\\ishandiwan\\Desktop\\DDT_InputFile.xls");
Workbook wk  = Workbook.getWorkbook(f);
Sheet ws = wk.getSheet(0);

int rows=ws.getRows();
int coloumms = ws.getColumns();
Object[][] ob = new Object [rows][coloumms];
for(int i = 0 ; i<rows; i++)
{
	
	for(int j = 0 ; j<coloumms ; j++)
	{
		
		Cell c = ws.getCell(j,i);
		
		ob[i][j]= c.getContents() ;
	}
}


return ob;



	
}
}

