package org.testing.utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void selectbyvalue(WebElement el)
 
 {
Select s = new Select (el);
s.selectByValue("");
  }
public static void selectbyindex(WebElement el, int index)
{
	Select s = new Select (el);
	s.selectByIndex(index);
	  }  

public static void selectbyvsibleText(WebElement el, String VisibleText)
{

Select s = new Select (el);
s.selectByVisibleText(VisibleText);	

}
}

