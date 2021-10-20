package QTRecognition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kudosPage {
	public WebDriver Driver;
	
	By kudos = By.xpath("//div[@class='navbar-nav']/following-sibling::div[1]/a");
	By email = By.xpath("//input[@id='email_address']");
	By card = By.xpath("//div[@id='trophy_list']/div[1]/div/div");
	By comment = By.xpath("//textarea[@id='comment']");
	By send= By.xpath("//div[@class='modal-footer']/button[2]");
	
	public kudosPage(WebDriver dri) {
		Driver=dri;
	}

	public WebElement kudosv() {
		return Driver.findElement(kudos);
	}
	
	public WebElement  email() {
		return Driver.findElement(email);
	}
	
	public WebElement cardv() {
		return Driver.findElement(card);
	}
	public WebElement commentv() {
		return Driver.findElement(comment);
	}
	
	public WebElement sendv() {
		return Driver.findElement(send);
	}
	
}
