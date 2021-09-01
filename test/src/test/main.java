package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {

	public static void main (String[] args) {
		
		System.out.print("application starting ........");
		
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.get( "http://www.uddoktarkhoje.com/");
		
		 driver.getPageSource( );
		driver.close();
	}
}
