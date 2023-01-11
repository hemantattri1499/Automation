package cucumberIntegrationTests.stepDefinitions.windows;

import UITestFramework.CreateSession;
import cucumberIntegrationTests.screens.windows.WindowsLoginScreen;

public class WindowsLoginSteps {
    WindowsLoginScreen iwindowsLoginScreen;

    public WindowsLoginSteps(CreateSession createSession) {
    	iwindowsLoginScreen = new WindowsLoginScreen(createSession.driver);
    }
    
  /*  public class WindowsAddItem {
        WindowsLoginScreen iwindowsLoginScreen;

        public WindowsLoginSteps(CreateSession createSession) {
        	iwindowsLoginScreen = new WindowsLoginScreen(createSession.driver);
        } 
*/
}
