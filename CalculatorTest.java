package Appium;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			openCalculator();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}

	}
	public static void openCalculator() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "HUAWEI Y3 2018");
		cap.setCapability("udid","EFQ9K18914916761");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","8.1.0");
		
		cap.setCapability("appPackage","za.co.autogenapp.test");
		cap.setCapability("appActivity","za.co.autogenapp.test.Activities.OnboardingActivity");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver=new RemoteWebDriver(url,cap);
		System.out.println("Application started");
	}

}
