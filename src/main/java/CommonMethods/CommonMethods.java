package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonMethods {
 public static WebDriver driver;

 public static WebDriver launchBrowser(String browsername)
 {

	if(browsername.equals("chrome"))
 		driver=new ChromeDriver();
 	else
 		driver=new EdgeDriver();
 	return driver;
 }
 public static void openURL(String url)
 {
 	driver.get(url);
 }
public static void login(String username , String password) {
 driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys(username);
 driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(password);
 driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();	
	
}
 public static void logout()
 {
	 WebElement element = driver.findElement(By.cssSelector("a.dropdown-toggle.p-22"));
		element.click();

 }
 public static void windowsmax() {
	 driver.manage().window().maximize();

	 
 }
 public static void windowsclearcookikes() {
	 driver.manage().deleteAllCookies();
	 
 }
 public static void CloseBrowser() {
	 driver.close();
 }


}
