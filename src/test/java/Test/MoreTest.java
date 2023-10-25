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


public class MoreTest {
	WebDriver driver;
    Moremenupage moremenu;
    
    @BeforeMethod
    public void setup() {
    	
    	  WebDriver  driver = CommonMethods.launchBrowser("chrome");
    	  moremenu = new Moremenupage(driver);
    	  moremenu.windowsmax();
     
    	  moremenu.openURL("https://magnus.jalatechnologies.com/");
     
    	  moremenu.login("training@jalaacademy.com", "jobprogram");
    
 
    }
    @Test
    public void moremenuopetaions() throws InterruptedException {
    	Thread.sleep(3000);
    	moremenu.clickonmore();
    	Thread.sleep(3000);
    	moremenu.clickonmenu();
    	Thread.sleep(3000);
    	moremenu.clickontesting();
    	Thread.sleep(3000);
    	moremenu.clickonjava();
    	Thread.sleep(3000);
    	moremenu.clickondotnet();
    	Thread.sleep(3000);
    	moremenu.clickonDataBase();
    	Thread.sleep(3000);
    	moremenu.clickonsubmenu();
    	 Thread.sleep(3000);
    	 moremenu.clickonhomepage();
    	
    
    }
    @AfterMethod
    public void tearDown() {
      CommonMethods.logout();
        CommonMethods.CloseBrowser();
    }
}
