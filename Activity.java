package QTRecognition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity extends base {
public WebDriver dri;
By user=By.xpath("//div[@class='container']//form//input[1]");
By pass = By.xpath("//div[@class='container']//form//input[2]");
By login=By.xpath("//div[@class='container']//form//button");	
	@Test
  public void activity() throws IOException, InterruptedException, AWTException {
		
		dri=intial();
		dri.get("https://qtrecognition.testqtwiz.com/");
		dri.findElement(user).sendKeys("anupam.ajith@qualitestgroup.com");
		dri.findElement(pass).sendKeys("P@ssw0rd");
		dri.findElement(login).click();
	activityPage a =new activityPage(dri);
	Assert.assertTrue(a.namev().isDisplayed());
	//User image checking
	Assert.assertTrue(a.picturev().isDisplayed());
	
	//application title 
	String str = a.title();
   Assert.assertEquals(str, "QTRecognition");
 
   
}
	 @AfterClass
public void exit() {
	dri.close();
}
}
