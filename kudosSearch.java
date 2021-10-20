package QTRecognition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class kudosSearch extends base {
	public WebDriver dri;
	
	private static Logger log= LogManager.getLogger(kudosSearch.class.getName());
	
	 By user=By.xpath("//div[@class='container']//form//input[1]");
	 By pass = By.xpath("//div[@class='container']//form//input[2]");
	 By login=By.xpath("//div[@class='container']//form//button");
	 
	 @Test
	 public void search() throws IOException, InterruptedException, AWTException {
		 
		 
		 
		 dri=intial();
		 log.info("intialising");
		 log.debug("heeeloooo");
		 log.error("hey");
			dri.get("https://qtrecognition.testqtwiz.com/");
			
			dri.findElement(user).sendKeys("anupam.ajith@qualitestgroup.com");
			dri.findElement(pass).sendKeys("P@ssw0rd");
			dri.findElement(login).click();  
		    Thread.sleep(1000);
			activityPage a =new  activityPage(dri);
			a.searchv().click();
			Thread.sleep(1000);
			a.searchf().sendKeys("prasad bembde");
			Robot r =new Robot();
			r.delay(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.delay(1000);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.delay(1000);
			r.keyPress(KeyEvent.VK_ENTER);
		    r.delay(1000);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(1000);
			a.searchb().click();
	 }
	 
	 @AfterClass
	 public void exit() {
		 dri.close();
	 }
}
