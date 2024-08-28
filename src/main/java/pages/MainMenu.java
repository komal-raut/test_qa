package pages;

import errors.InvalidMenuItemException;
import keywords.Keyword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitFor;

public class MainMenu {

    @FindBy(css = "div.desktop-navLink a[href='/shop/women']")
    public WebElement WomenMenuItem;

    @FindBy(css= "div[class='desktop-categoryContainer'][data-group='women']")
    public WebElement WomenMenuFlyOut;

    @FindBy(css = "div.desktop-navLink a[href='/shop/men']")
    public WebElement mensMenuItem;

    @FindBy(css = "div[class='desktop-categoryContainer'][data-group='men']")
    public WebElement mensMenuFlyOut;

    @FindBy(css= "a[href='/women-ethnic-wear']")
    public WebElement menuItemEthnicWear;

    @FindBy(css= "a[href='/tops']")
    public WebElement menuItemTops;

    @FindBy(css= "a[href='/dresses?f=Gender%3Amen%20women%2Cwomen']")
    public WebElement menuItemDresses;

    @FindBy(css= "a[href='/women-heels']")
    public WebElement menuItemHeels;

    public MainMenu() {
        PageFactory.initElements(Keyword.getDriver(), this);
    }

    /**
     * This method helps to hover on menu options.
     *
     * @param menu String
     */
    public void hoverOn(String menu) {
        Keyword keyword = new Keyword();
        switch(menu.toLowerCase()){
            case "kids":
                 keyword.hoverOn(WomenMenuItem);
                 WaitFor.waitForElementToPresent(WomenMenuFlyOut);
                 break;
            case "men":
                keyword.hoverOn(mensMenuItem);
                WaitFor.waitForElementToPresent(mensMenuFlyOut);
                break;
            default:
                 throw new InvalidMenuItemException(menu);
        }
    }

    public void clickOnMenuItem(String menuItem) {
        Keyword keyword = new Keyword();
        switch(menuItem.toLowerCase()){
            case "shorts":
            	menuItemEthnicWear.click();
                break;
            case "jeans":
            	menuItemTops.click();
                break;
            case "jackets":
            	menuItemDresses.click();
                break;
            case "t-shirts":
            	menuItemHeels.click();
                break;
            default:
                throw new InvalidMenuItemException(menuItem);
        }
    }
}
