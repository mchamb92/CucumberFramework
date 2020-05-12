package stepDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import enums.Browsers;
import enums.OS;
import testBase.TestBase;

public class ServiceHooks {

	 public static TestBase testBase;


	@Before
	public void initializeTest() {
		testBase = new TestBase();
		testBase.selectBrowser(Browsers.CHROME.name());
		
	}

	@After
	public void endTest(Scenario scenario) {
		
		TestBase.driver.quit();
	}

}
