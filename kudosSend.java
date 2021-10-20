package QTRecognition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class kudosSend  extends base {
	public WebDriver dri;
	
	 
	   By user=By.xpath("//div[@class='container']//form//input[1]");
	   By pass = By.xpath("//div[@class='container']//form//input[2]");
	   By login=By.xpath("//div[@class='container']//form//button");
	   
	
	@Test
	public void kudosVerify() throws IOException, AWTException, InterruptedException {
		dri=intial();
		dri.get(prop.getProperty("url"));
		
		
		dri.findElement(user).sendKeys("anupam.ajith@qualitestgroup.com");
		dri.findElement(pass).sendKeys("P@ssw0rd");
		dri.findElement(login).click();
		
		kudosPage k = new kudosPage(dri);
		//Send kudos
		k.kudosv().click();
		//thread used
		Thread.sleep(1000);
		
		k.email().click();
		k.email().sendKeys("anupam.ajith@qualitestgroup.com");
		Robot r =new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ENTER);
	    r.delay(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		k.cardv().click();
		k.commentv().sendKeys("Good Work");
		k.sendv().click();
		r.delay(1000);
		
	if(	dri.findElement(By.xpath("//form[@name='shoutout_form']/div[2]/div/span/center")).getText().equalsIgnoreCase("Mailer Error: SMTP connect() failed."))
	{
		Assert.assertTrue(false);
	}
		
		r.delay(1000);
	}
	 @AfterTest 
	 public void exit() {
		 dri.close();
	 }
}
