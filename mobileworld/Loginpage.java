package mobileworld;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginpage extends Generic {
	
@Test(dataProvider="get")


public void log(String name,String pass) throws InterruptedException {
//	
	driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='remember-me']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(2000);
}

 @DataProvider(name="get")
 
 public Object[][] getData() 
 {
	 Object[][] data=new Object[2][2];
	 data[0][0]="shi2025@gmail.com";
	 data[0][1]="shifa23";
	 data[1][0]="shifa@ugamil.com";
	 data[1][1]="shif14";
	 
	 
	 return data;
 }


	
	
	
	


}
