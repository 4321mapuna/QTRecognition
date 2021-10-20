package QTRecognition;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@SuppressWarnings("unused")
public class base {
	public WebDriver Driver;
	public Properties prop;
	
	@SuppressWarnings("deprecation")
	@Test
	public WebDriver intial() throws IOException {
		 prop =new Properties();
		FileInputStream fin = new FileInputStream("C:\\Users\\AJITHKUMAR\\eclipse-workspace\\QtTesting\\src\\main\\java\\resource\\data.properties");
		prop.load(fin);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		Driver=  new ChromeDriver();
		
		//Driver.manage().timeouts().implicitlyWait(5 );
		return Driver; 
		 
		
		
	}

}
