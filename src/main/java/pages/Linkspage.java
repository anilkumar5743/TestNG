package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;

public class Linkspage extends CommonMethods {
	WebDriver driver;
public Linkspage(WebDriver driver) {
	
	this.driver= driver;
	
}
public void clickonmore() {
	driver.findElement(By.xpath("//li[@class='treeview'][2]")).click();	
	
		
	
}
public void clickonlink() {
	driver.findElement(By.xpath("//a[@href='/Home/Links']")).click();	
	
}
public void clickonhomepage() {
	driver.findElement(By.xpath("//i[@class='fa fa-dashboard']")).click();
}
public void clickonworkinglink() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Working Links']")).click();
	String mainWindow = driver.getWindowHandle();
	System.out.println("Main window handle: " + mainWindow);
	driver.findElement(By.xpath("//a[text()='Link 1']")).click();
	Thread.sleep(3000);
	for (String handle : driver.getWindowHandles()) {
	    if (!handle.equals(mainWindow)) {
	        System.out.println("New working window handle: " + handle);
	        driver.switchTo().window(handle);
	      
	        driver.close();
	    }
	}


	driver.switchTo().window(mainWindow);
}
public void clickonBrokenlinks() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Broken Links']")).click();
	String mainWindow = driver.getWindowHandle();
	System.out.println("Main window handle: " + mainWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Link 1' and @href='www.brokenlinkcheck.com/' and @style='color: red' and @target='_blank']")).click();
	Thread.sleep(3000);
	for (String handle : driver.getWindowHandles()) {
	    if (!handle.equals(mainWindow)) {
	        System.out.println("New Broken window handle: " + handle);
	        driver.switchTo().window(handle);
	      
	        driver.close();
	    }
	}


	driver.switchTo().window(mainWindow);
}
public void clickonimagelinks() throws InterruptedException {
driver.findElement(By.xpath("//a[text()='Image Links']")).click();
	String mainWindow = driver.getWindowHandle();
	System.out.println("Main window handle: " + mainWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@alt='Growic Link']")).click();
	Thread.sleep(3000);
	for (String handle : driver.getWindowHandles()) {
	    if (!handle.equals(mainWindow)) {
	        System.out.println("New image window handle: " + handle);
	        driver.switchTo().window(handle);
	      
	        driver.close();
	    }
	}


	driver.switchTo().window(mainWindow);
}
public void clickonstatuscode() throws InterruptedException {
driver.findElement(By.xpath("//a[text()='Status Codes']")).click();
	String mainWindow = driver.getWindowHandle();
	System.out.println("Main window handle: " + mainWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='500' and @href='/ErrorHandler/InternalServerError' and @style='color: orangered' and @target='_blank']")).click();
	Thread.sleep(3000);
	for (String handle : driver.getWindowHandles()) {
	    if (!handle.equals(mainWindow)) {
	        System.out.println("New status code window handle: " + handle);
	        driver.switchTo().window(handle);
	      
	        driver.close();
	    }
	}


	driver.switchTo().window(mainWindow);
}


}
