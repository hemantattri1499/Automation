package cucumberIntegrationTests.screens.windows;

import UITestFramework.GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login screen of iOS app.
 */
public class WindowsLoginScreen extends GenericMethods {

	public WindowsLoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	// Locators on the login screen of your iOS app should be placed here.
	
	
	/*public By slideShareButtonLabel = By.xpath("//UIAStaticText[contains(@name, 'SlideShare')]");
	public By slideShareButton = By.xpath("//UIAButton[3]");
	public By userName = By.xpath("//UIATextField[1]");
	public By password = By.xpath("//UIASecureTextField[1]");
	public By signInButton = By.xpath("//UIAButton[contains(@name, 'Sign in')]");
	public By continueButton = By.xpath("//UIAButton[contains(@name, 'Continue')]");*/
	//public By slideShareButtonLabel = By.xpath("//UIAStaticText[contains(@name, 'SlideShare')]");
		//public By slideShareButton = By.xpath("//UIAButton[3]");
		public By userName = By.name("Master Password");
		public By password = By.name("Master Password");
		public By signInButton = By.name("Unlock");
		public By search = By.name("Search");
		
	////XCUIElementTypeApplication[@name="AutomationDemo"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]


}


