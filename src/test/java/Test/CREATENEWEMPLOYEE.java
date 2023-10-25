package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import CommonMethods.CommonMethods;
import org.openqa.selenium.WebDriver;
import pages.CreateEmployee;

public class CREATENEWEMPLOYEE {
	WebDriver driver;
    CreateEmployee createEmp;
    
    @BeforeMethod
    public void setup() {
    	
    	  WebDriver  driver = CommonMethods.launchBrowser("chrome");
      createEmp = new CreateEmployee(driver);
      createEmp.windowsmax();
     
      createEmp.openURL("https://magnus.jalatechnologies.com/");
     
     createEmp.login("training@jalaacademy.com", "jobprogram");
 
    }

    @Test
    public void testCreateEmployeewithallfileds() throws InterruptedException {
    	Thread.sleep(3000);
    	createEmp.clickonemployee();
   	 
   	 createEmp.clickoncreatenewemployee();
    
   	 createEmp.enterfirstname("anil");
   	 
   	 createEmp.enterlastname("kumar");
   
   	 createEmp.enteremail("anil@gmai.com");
   
   	 createEmp.enternumber("1234567890");
   	  
      
        createEmp.enterDOB("05/06/1997");
   
        createEmp.enteAddress("kurnool");
   
        createEmp.Country("India");
    
      createEmp.city(1);
 
      
        createEmp.selectskill();
       
        createEmp.savedata();
        createEmp.clickonhomepage();
    
       
    }
    
    @Test
    public void testCreateEmployeewithoutnameandnumber() throws InterruptedException {
    	Thread.sleep(3000);
    	createEmp.clickonemployee();
    
   	 createEmp.clickoncreatenewemployee();
     
   	createEmp.enternumber("123");
   	createEmp.savedata();
   	Thread.sleep(3000);
   	createEmp.errormessageforwrongnumber();
   	createEmp.clickonhomepage();
    }
    
    @AfterMethod
    public void tearDown() {
        CommonMethods.logout();
        CommonMethods.CloseBrowser();
    }
}


