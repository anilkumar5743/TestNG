package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.CommonMethods;
import pages.Linkspage;
import pages.popmenupage;

public class Linkstest {
	WebDriver driver;
    Linkspage link;
    
    @BeforeMethod
    public void setup() {
    	
    	  WebDriver  driver = CommonMethods.launchBrowser("chrome");
    	  link = new Linkspage(driver);
    	  link.windowsmax();
     
    	  link.openURL("https://magnus.jalatechnologies.com/");
     
    	  link.login("training@jalaacademy.com", "jobprogram");
    
 
    }
    @Test
    public void Links() throws InterruptedException {
    	Thread.sleep(3000);
    	link.clickonmore();
    	Thread.sleep(3000);
    	link.clickonlink();
    	Thread.sleep(3000);
    	link.clickonworkinglink();
    	Thread.sleep(3000);
    	link.clickonBrokenlinks();
    	Thread.sleep(3000);
    	link.clickonimagelinks();
     	Thread.sleep(3000);
     	link.clickonstatuscode();
     Thread.sleep(3000);
     link.clickonhomepage();
    	
    	
}
    @AfterMethod
    public void tearDown() {
        CommonMethods.logout();
        CommonMethods.CloseBrowser();
    }
}