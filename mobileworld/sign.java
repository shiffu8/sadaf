package mobileworld;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class sign extends Generic{
	@Test
	public void Signup() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Shifa");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sadaf");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("shifasadaf8@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("shifa23");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("14-04-1999");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("7892896758");
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("I want to order the phone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}
}


