package QTRecognition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class others extends base{
	public WebDriver dri;
	By user=By.xpath("//div[@class='container']//form//input[1]");
	 By pass = By.xpath("//div[@class='container']//form//input[2]");
	 By login=By.xpath("//div[@class='container']//form//button");
	
	@Test
	public void other() throws IOException, InterruptedException {
		dri=intial();
		dri.get("https://qtrecognition.testqtwiz.com/");
		dri.findElement(user).sendKeys("anupam.ajith@qualitestgroup.com");
		dri.findElement(pass).sendKeys("P@ssw0rd");
		activityPage a = new activityPage(dri);
		
		dri.findElement(login).click();  
		Thread.sleep(1000);
		String stt=dri.findElement(By.xpath("//h5[@id='todayCount']")).getText();
		
		
		// Kudos from me button checking
		a.kudosm().click();
		Thread.sleep(1000);
		Assert.assertTrue(dri.findElement(By.xpath("//h3[text()='Recent Activities']")).isDisplayed());
		//..........................................
		
		//Kudos to me checking
		a.kodosto().click();
		Thread.sleep(1000);
	    String st = a.namev().getText();
		String str =dri.findElement(By.xpath("//h5[@class='header-font-size'][1]/b[1]")).getText();
        Assert.assertFalse(str.contentEquals(st));
        String strKudos =dri.findElement(By.xpath("//h5[@class='header-font-size'][1]/small[1]")).getText();
		Assert.assertTrue(strKudos.equalsIgnoreCase("received an appreciation from"));
		//..........................................
		
		
		// Activity button checking
		a.act().click();
		Thread.sleep(1000);
		String sdd=dri.findElement(By.xpath("//h5[@id='todayCount']")).getText();
		Assert.assertTrue(stt.contentEquals(sdd));
		
		//..........................................
		
		//sample kudos send to check kudos count is updated.
		
        a.recentkudos().click();
		
		kudosPage ks = new kudosPage(dri);
		Thread.sleep(1000);
		ks.cardv().click();
		ks.commentv().sendKeys("Good");
		ks.sendv().click();
		a.act().click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		String sss=dri.findElement(By.xpath("//h5[@id='todayCount']")).getText();
		if(sss.equalsIgnoreCase(stt))
		{
			Assert.assertTrue(false);
		}
		//..........................................
		
		//Sending kudos to themself
		ks.kudosv().click();
		if(a.namev().getText().equalsIgnoreCase("Anupam K Aith"))
		{
			Assert.assertTrue(false);
		}
		//..........................................
	}
	
	@AfterTest
	public void exit() {
		dri.close();
	}
	
}
