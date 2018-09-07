package com.seleniumdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FailedTestcasesScreenshot {
	
	static WebDriver driver;
	static ChromeOptions Options;
	
	public  void  screenshot() 
	{
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			  FileUtils.copyFile(file, new File(".\\Screeshotsss\\"+"CRM4"+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
