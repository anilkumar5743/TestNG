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
import pages.Moremenupage;
import pages.popmenupage;

public class POPUPtest {
	WebDriver driver;
    popmenupage popup;
    
    @BeforeMethod
    public void setup() {
    	
    	  WebDriver  driver = CommonMethods.launchBrowser("chrome");
    	  popup = new popmenupage(driver);
    	  popup.windowsmax();
     
    	  popup.openURL("https://magnus.jalatechnologies.com/");
     
    	  popup.login("training@jalaacademy.com", "jobprogram");
    
 
    }
    @Test
    public void popupopetaions() throws InterruptedException {
    	Thread.sleep(3000);
    	popup.clickonmore();
    	Thread.sleep(3000);
    	popup.clickonpopup();
     	Thread.sleep(3000);
     	popup.alertbox();
     	Thread.sleep(3000);
     	popup.confirmbox();
     	Thread.sleep(3000);
     	popup.textmbox();
     	 Thread.sleep(3000);
     	popup.clickonhomepage();
}
    @AfterMethod
    public void tearDown() {
      CommonMethods.logout();
        CommonMethods.CloseBrowser();
    }
    
}