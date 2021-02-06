package org.testing.Assertion;
public class Asseration {

	public static void assert1(String Expected , String actual)
	{
		if(Expected.equals(actual))
		{
			
			System.out.println("Asseration passed");
		}
		
		else
		{
			System.out.println("Asseration Failed");
		}
		
	}
}
