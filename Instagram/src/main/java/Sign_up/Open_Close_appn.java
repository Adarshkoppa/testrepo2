package Sign_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Open_Close_appn implements Data{
	public WebDriver driver;
	@BeforeTest
	public void Open() {
		System.setProperty(Key1,value1);
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void close()
	{
		//driver.close();
	}

}
