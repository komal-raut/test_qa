package Test_cs;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import keywords.Keyword;
import pages.MainMenu;


public class Practice_test {

	private Keyword manager;

    @Before
    public void setUp() {
        manager = new Keyword();
        manager.openBrowser("Chrome");
    }
	
	@Test
	private void searchProduct() {
		// TODO Auto-generated method stub
		RemoteWebDriver currentDriver = Keyword.getDriver();
		MainMenu home_page = new MainMenu();
		home_page.hoverOn("kids");	
	}
}
