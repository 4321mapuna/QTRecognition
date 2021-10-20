package QTRecognition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.Properties;

import junit.framework.Assert;
@Test 
public class login extends base{
   public WebDriver dri;
   
   
   By user=By.xpath("//div[@class='container']//form//input[1]");
   By pass = By.xpath("//div[@class='container']//form//input[2]");
   By login=By.xpath("//div[@class='container']//form//button");
   
	public void verify() throws IOException, InterruptedException {
		dri=intial();
		dri.get("https://qtrecognition.testqtwiz.com/");
		
		//Colour testing
		String colour = dri.findElement(By.xpath("//div[@class='myHeading']")).getCssValue("background-color");
		String c = Color.fromString(colour).asHex(); 
		System.out.println(c);
		
		
		
		//valid user login
		
		dri.findElement(user).sendKeys("anupam.ajith@qualitestgroup.com");
		dri.findElement(pass).sendKeys("P@ssw0rd");
		dri.findElement(login).click();
		
		
		//(1.3)Title check 
		Assert.assertEquals(dri.getTitle(), "QTRecognition");
	
		
	
		
	   
	   
	   
	   
	}
	
	 @AfterClass
	public void exit() {
		dri.close();
	}
	

}
