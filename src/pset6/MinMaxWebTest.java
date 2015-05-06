package pset6;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinMaxWebTest {
	private static WebDriver wd;
	private WebElement we;
	private WebElement result;
	private String output;
	
	@BeforeClass public static void setup()
	{
		wd = new FirefoxDriver(); 
		wd.get("file:///Users/Lucifer/Documents/Development/workspace/software_testing/src/pset6/minandmax.html");	
	}
	
    @Test public void t0() {
        // execute the test <x = 0, y = 0, z = 0, submitButton = click> and check the output message is correct
        // edit the next line to enter the location of "min.html" on your file system
    	we = wd.findElement(By.id("min"));
    	we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, -1, -1) = -1", output);
		wd.navigate().refresh();
    }
	@Test public void t1(){
        // edit the next line to enter the location of "min.html" on your file system
		we = wd.findElement(By.id("max"));
    	we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(1, -1, -1) = 1", output);
		wd.navigate().refresh();
	}  
	
	//wd.quit(); // close the browser window
	@AfterClass public static void close()
	{
		wd.quit();
	}
}
