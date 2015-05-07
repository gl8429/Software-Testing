package pset6;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestSuite {
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

	@Test public void t1() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t2() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, -1, 0) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t3() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t4() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, -1, 1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t5() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t6() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t7() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t8() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, 0, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t9() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t10() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, 0, 0) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t11() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t12() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, 0, 1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t13() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t14() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t15() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t16() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, 1, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t17() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t18() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, 1, 0) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t19() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t20() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-1, 1, 1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t21() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t22() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t23() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t24() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t25() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t26() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t27() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t28() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t29() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t30() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t31() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t32() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -1, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t33() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t34() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -1, 0) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t35() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t36() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -1, 1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t37() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t38() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t39() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t40() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t41() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t42() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t43() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t44() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, 1) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t45() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t46() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t47() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t48() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 1, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t49() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t50() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 1, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t51() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t52() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 1, 1) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t53() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t54() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t55() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t56() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t57() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t58() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t59() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t60() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t61() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t62() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t63() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t64() {
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
		assertEquals("min(1, -1, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t65() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t66() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, -1, 0) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t67() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t68() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, -1, 1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t69() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t70() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t71() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t72() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, 0, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t73() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t74() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t75() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t76() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, 0, 1) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t77() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t78() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t79() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t80() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, 1, -1) = -1", output);
		wd.navigate().refresh();
	}

	@Test public void t81() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t82() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, 1, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test public void t83() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t84() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(1, 1, 1) = 1", output);
		wd.navigate().refresh();
	}

	@Test public void t85() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t86() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t87() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t88() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t89() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t90() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t91() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t92() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t93() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t94() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t95() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("1");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t96() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t97() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t98() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t99() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t100() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t101() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t102() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t103() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t104() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t105() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t106() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t107() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t108() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t109() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t110() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t111() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t112() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t113() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t114() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t115() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t116() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t117() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t118() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t119() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("1");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t120() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t121() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t122() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t123() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t124() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t125() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("1");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test public void t126() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test public void t127() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("y"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("z"));
		we.sendKeys("Four");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@AfterClass public static void close()
	{
		wd.quit();
	}
}
