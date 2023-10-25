package pages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommonMethods.CommonMethods;

public class popmenupage extends CommonMethods {
	WebDriver driver;
	public popmenupage(WebDriver driver) {
		this.driver= driver;
		
	}
	public void clickonmore() {
	driver.findElement(By.xpath("//li[@class='treeview'][2]")).click();	
	
		
	} 
	public void clickonpopup() {
	driver.findElement(By.xpath("//a[@href='/Home/Popup']")).click();	
	
		
	} 
	public void alertbox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='alertBox']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
			
	}
	public void confirmbox() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
			
	}
	public void textmbox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='confirmBox']")).click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
			
	}
	public void clickonhomepage() {
		driver.findElement(By.xpath("//i[@class='fa fa-dashboard']")).click();
	}


}
