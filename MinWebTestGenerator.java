package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestSuite {
	@Test public void t0() {
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///Users/Lucifer/Documents/Development/workspace/software_testing/src/pset6/min.html");
		WebElement we = wd.findElement(By.id("x"));
		WebElement result = wd.findElement(By.id("result"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, -1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 0, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-1, 1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 1) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 1) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, 1) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 1, 1) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, 0) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, -1, 1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, 1) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 0, 1) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, -1) = -1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, 0) = 0", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, 1) = 1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(1, 1, 1) = 1", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		driver.navigate().refresh();

		wb.quit();
	}
}
