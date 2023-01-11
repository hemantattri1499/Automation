package IntegrationTests.screens.iOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UITestFramework.GenericMethods;



/**
 * contains all the locators present on the login screen of iOS app.
 */
public class IOSLoginScreen extends GenericMethods {

	public IOSLoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	// Locators on the login screen of your iOS app should be placed here.
	
	
	//public By slideShareButtonLabel = By.xpath("//UIAStaticText[contains(@name, 'SlideShare')]");
	//public By slideShareButton = By.xpath("//UIAButton[3]");
	public By userName = By.xpath("//XCUIElementTypeApplication[@name=\"AutomationDemo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
	public By password = By.xpath("//XCUIElementTypeApplication[@name=\"AutomationDemo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
	public By signInButton = By.xpath("//UIAButton[contains(@name, 'Sign In')]");
	public By continueButton = By.xpath("//UIAButton[contains(@name, 'Continue')]");
////XCUIElementTypeApplication[@name="AutomationDemo"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]
}


