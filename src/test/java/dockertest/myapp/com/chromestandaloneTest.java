package dockertest.myapp.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromestandaloneTest {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, MalformedURLException {
		// TODO Auto-generated method stub
	
		ChromeOptions chromeOptions = new ChromeOptions();
	
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver =  new RemoteWebDriver(url, chromeOptions);

		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}

}
