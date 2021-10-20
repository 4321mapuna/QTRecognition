package QTRecognition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class activityPage {
    public WebDriver Driver;
	
	By name=By.xpath("//div[@class='jumbotron']/div[1]/div/h5");
	By picture = By.xpath("//div[@class='jumbotron']/div[1]/img");
	By recent = By.xpath("//div[@id='contact_list']/div[1]/div/h5/small/a");
	By search = By.xpath("//div[@class='jumbotron']/div[5]/div/h5/a");
	By searchfield = By.xpath("//input[@id='s_e_add']");
	By searchbutton = By.xpath("//div[@id='search_panel']/button");
	By kudosme = By.xpath("//div[@class='jumbotron']/div[3]/div/h5/a");
	By kudosto = By.xpath("//div[@class='jumbotron']/div[4]/div/h5/a");
	By act = By.xpath("//div[@class='jumbotron']/div[2]/div/h5/a");
	public activityPage(WebDriver dri) {
		Driver =dri;
	}

    
	public WebElement namev() {
		
		return Driver.findElement(name);
		
	}
	public WebElement picturev() {
		return Driver.findElement(picture);
	}
	
	public String title() {
		return Driver.getTitle();
	}
	public WebElement recentkudos() {
		return Driver.findElement(recent);
	}
	public WebElement searchv() {
		return Driver.findElement(search);
	}
	public WebElement searchf() {
		return Driver.findElement(searchfield);
	}
	public WebElement searchb() {
		return Driver.findElement(searchbutton);
	}
	public WebElement kudosm() {
		return Driver.findElement(kudosme);
	}
	public WebElement kodosto() {
		return Driver.findElement(kudosto);
	}
	public WebElement act() {
		return Driver.findElement(act);
	}
}
