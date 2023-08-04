package Voosh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class vooshAssinment {

	public static void main(String[] args) throws InterruptedException {
		
		//Create object for chrome Object
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "Browser/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver(options);
		
//		System.setProperty("webdriver.gecko.driver", "Browser/geckodriver.exe/");
//		FirefoxDriver driver = new FirefoxDriver();
//		
		String app_url = "https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid=82669889959648&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=155418&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_1951522";
		driver.get(app_url);
		
		driver.manage().window().maximize();
		
		//Create the action
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		actions.moveToElement(target).perform();
		
		//Click on Sign
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		//Web element
		String Email_name = "//input[@name='email']";
		String email = "gummadavallymanideep2@gmail.com";
		WebElement Email_textbox = driver.findElement(By.xpath(Email_name));
		Email_textbox.clear();
		Email_textbox.sendKeys(email);
		
		String createbutton_id1 = "continue";
		WebElement ele1 = driver.findElement(By.id(createbutton_id1));
		ele1.click();
		
		
		String Password_name = "ap_password";
		String Password = "Manideep24@";
		WebElement Password_textbox = driver.findElement(By.id(Password_name));
		Password_textbox.clear();
		Password_textbox.sendKeys(Password);
		
		String createbutton_id = "auth-signin-button-announce";
		WebElement ele2 = driver.findElement(By.id(createbutton_id));
		ele2.click();
		
		//wait command
		Thread.sleep(10000);
		
//		driver.findElement(By.class("a-section a-spacing-small _deals-shoveler-v2_style_imageContainer__2Wm4A")).click();
		
	}

}