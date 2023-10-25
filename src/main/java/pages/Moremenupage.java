package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;

public class Moremenupage extends CommonMethods {
	WebDriver driver;
	public Moremenupage(WebDriver driver) {
		this.driver= driver;
		
	}
	public void clickonmore() {
	driver.findElement(By.xpath("//li[@class='treeview'][2]")).click();	
	
		
	}
	public void clickonmenu() {
		
		driver.findElement(By.xpath("//a[@href='/Home/Menu']")).click();
	}
	public void clickonsubmenu() {
		driver.findElement(By.xpath("//a[text()='Sub Menus']")).click();
	}
	public void clickontesting() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='b1']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[@id='label']"));

		
		String text = element.getText();
		System.out.println("selected course is : " + text);
		
	}
	public void clickonjava() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='b2']")).click();
		 Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[@id='label']"));

		
		String text = element.getText();
		System.out.println("selected course is : " + text);
		
	}
	public void clickondotnet() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='b3']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[@id='label']"));

		
		String text = element.getText();
		System.out.println("selected course is : " + text);
		
	}
	public void clickonDataBase() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='b3']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[@id='label']"));

		
		String text = element.getText();
		System.out.println("selected course is : " + text);
}
	public void clickonhomepage() {
		driver.findElement(By.xpath("//i[@class='fa fa-dashboard']")).click();
	}
		}
	

