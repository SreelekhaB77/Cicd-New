package google.cicddemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleautomation {
	public static WebDriver driver;

@SuppressWarnings("deprecation")
@Test
public static void launch() throws InterruptedException
{

	System.out.println("hi");		
	
//    WebDriverManager.firefoxdriver().setup();
//    driver = new FirefoxDriver();
	
//    WebDriverManager.edgedriver().setup();
//    driver = new EdgeDriver();
//	WebDriverManager.chromiumdriver().setup();
//	driver = new ChromeDriver();
	String path =System.getProperty("user.dir") +"\\src\\test\\java\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.get("https://www.google.com/");
    System.out.println(driver.getTitle());
    System.out.println("hi");
}	
}
