package com.appium.test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class AppiumHetTest {
	
	private static AppiumDriver driver =null;
	
	@BeforeMethod
	public void setUp() throws Exception {
		File app = new File("C:\\Program Files\\Experitest\\SeeTest\\bin\\ipas","eribank.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "ZY2232GXWX");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("app-package", "com.experitest.ExperiBank");
		capabilities.setCapability("app-activity", ".LoginActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		//driver = new AndroidDriver(url, capabilities);
		
		driver = new AppiumDriver(url, capabilities) {
			
			@Override
			public MobileElement scrollToExact(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public MobileElement scrollTo(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			/*@Override
			public DeviceRotation rotation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void rotate(DeviceRotation arg0) {
				// TODO Auto-generated method stub
				
			}*/
		};
	}
	
	@Test
	public void test01(){
		driver.findElement(By.id("usernameTextField")).click();
		driver.findElement(By.id("usernameTextField")).sendKeys("Sumanta Roy");
		
	}

}
