package com.TestAutomationDemo.testBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.TestAutomationDemo.helper.LoggerHelper;
import com.TestAutomationDemo.helper.WaitHelper;
import com.TestAutomationDemo.utils.library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public Logger log = LoggerHelper.getLogger(this.getClass());
	public WaitHelper waitHelper = new WaitHelper(driver);
	String browser = library.getProperty("browser");
}
