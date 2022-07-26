
package mobileworld;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class contact_us extends Generic {
 @Test
 public void ContactUs() {
 driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
 driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
 Set win=driver.getWindowHandles();
 Iterator it=win.iterator();
 String parentId=(String) it.next();
 String childId=(String) it.next();
 driver.switchTo().window(childId);
 driver.manage().window().maximize();
 driver.findElement(By.name("name")).sendKeys("shifa");
 driver.findElement(By.name("email")).sendKeys("shif@786gmail.com");
 driver.findElement(By.name("phone")).sendKeys("9538765678");
 driver.findElement(By.name("message")).sendKeys("hii shifff");
 driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}

