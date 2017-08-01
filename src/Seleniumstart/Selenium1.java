package Seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test project");
//		Selenium1 Selenium1 =new Selenium1();
		
		
			
			WebDriver driver = new FirefoxDriver();
			
		    String Appurl ="http://www.amazon.in/";
			driver.get(Appurl);
				
		

		
			driver.quit();
	}

}
