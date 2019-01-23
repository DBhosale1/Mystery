package com.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities d=DesiredCapabilities.firefox();
		
		d.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, d);
		
		driver.get("https://www.google.com/");
		
		
		System.out.println("Blog is: gaurav ");
		
		System.out.println("Blog ttile is: "+driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.close();
		
	}

}
