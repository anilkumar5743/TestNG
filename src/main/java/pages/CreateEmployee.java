package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.util.Assert;

import CommonMethods.CommonMethods;

public class CreateEmployee extends CommonMethods {
	WebDriver driver;
public CreateEmployee(WebDriver driver) {
	this.driver= driver;
	
}
public  void clickonemployee() {
	 driver.findElement(By.xpath("//*[@id='MenusDashboard']/li[2]/a")).click();	
	 	
}
public void clickoncreatenewemployee() {
	 driver.findElement(By.xpath("//*[@id='MenusDashboard']/li[2]/ul/li[1]/a")).click();
	 
}
public void enterfirstname(String firstname) {
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);

}
public void enterlastname(String lastname) {
	driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys(lastname);
	
}
public void enteremail(String mail) {
	driver.findElement(By.xpath("//*[@id='EmailId']")).sendKeys(mail);
	
}
public void enternumber(String number) {
	driver.findElement(By.xpath("//*[@id='MobileNo']")).sendKeys(number);
	
}
public void enterDOB(String DOB) {
	driver.findElement(By.xpath("//*[@id='DOB']")).sendKeys(DOB);
	
}
public void enteAddress(String Address) {
	driver.findElement(By.xpath("//*[@id='Address']")).sendKeys(Address);
	
}
public void Country(String name) {
	WebElement county =driver.findElement(By.xpath("//*[@id='CountryId']"));
	Select select = new Select(county);
	select.selectByVisibleText(name);
		
}
public void city(int  number) {
	WebElement city =driver.findElement(By.xpath("//*[@id='CityId']"));
	Select select = new Select(city);
	select.selectByIndex(number);
}
public void selectskill() {
	driver.findElement(By.xpath("//*[@id='chkSkill_1']")).click();

}
public void savedata() {
	driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[2]/button")).click();
	
}
public void clickonhomepage() {
	driver.findElement(By.xpath("//i[@class='fa fa-dashboard']")).click();
}
public void errormessageforwrongnumber() throws InterruptedException {
	Thread.sleep(3000);
	WebElement errorMessageElement = driver.findElement(By.xpath("//span[@for='MobileNo']"));


	String errorMessage = errorMessageElement.getText();
	System.out.println("Error Message for wrong data or empty field: " + errorMessage);

}
public void errormessageforfirstname() throws InterruptedException {
	Thread.sleep(3000);
	WebElement errorMessageElement = driver.findElement(By.xpath("//span[@for='FirstName']"));


	String errorMessage = errorMessageElement.getText();
	System.out.println("Error Message for wrong data or empty field: " + errorMessage);

}
public void errormessageforlastname() throws InterruptedException {
	Thread.sleep(3000);
	WebElement errorMessageElement = driver.findElement(By.xpath("//span[@for='LastName']"));


	String errorMessage = errorMessageElement.getText();
	System.out.println("Error Message for wrong data or empty field: " + errorMessage);

}
public void errormessageforemail() throws InterruptedException {
	Thread.sleep(3000);
	WebElement errorMessageElement = driver.findElement(By.xpath("//span[@for='EmailId']"));


	String errorMessage = errorMessageElement.getText();
	System.out.println("Error Message for wrong data or empty field: " + errorMessage);

}
public void madatoryerrormessage() throws InterruptedException {
	Thread.sleep(3000);
	WebElement errorMessageElement = driver.findElement(By.xpath("//div[@class='toast-title']"));

	String errorMessage = errorMessageElement.getText();
	System.out.println("Error Message: " + errorMessage);

}
}
