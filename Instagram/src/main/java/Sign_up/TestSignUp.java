package Sign_up;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSignUp extends Open_Close_appn{
	@Test
	public void test() 
	{
		//driver.findElement(By.xpath("(//h3[text()='Instagram' ])[1]")).click(); 
	driver.findElement(By.xpath("//span[text()='Sign up']")).click();
    driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys(emailId);
    driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys(fname);
    driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys(uname);
    driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(pswd);
    WebElement signUp = driver.findElement(By.xpath("//button[@type='submit']"));
    Actions act = new Actions(driver);
    act.click(signUp).perform();
    WebElement dob = driver.findElement(By.xpath("//select[@title='Month:']"));
    Select s = new Select(dob);
    s.selectByValue("8");
    WebElement date = driver.findElement(By.xpath("//select[@title='Day:']"));
    Select s1 = new Select(date);
    s1.selectByValue("25");
    WebElement year = driver.findElement(By.xpath("//select[@title='Year:']"));
    Select s2 = new Select(year);
    s2.selectByValue("1995");
    
    driver.findElement(By.xpath("//button[text()='Next']")).click();
    
  /*Selenium doesnot support otp,captcha,animations,
    so cant proceed further
   
    driver.findElement(By.xpath("//input[@aria-label='Confirmation Code']")).sendKeys("");
    driver.findElement(By.xpath("//div[text()='Next']")).click();*/
    
	}}