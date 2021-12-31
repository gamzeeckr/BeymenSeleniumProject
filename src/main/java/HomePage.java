import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    SearchBox searchBox;
    By homePageLocator= By.id("o-fullSlider-342");
    By homePageAccountLocator=new By.ByCssSelector("svg.icon-account");
    By homePageFavoriteLocator=new By.ByCssSelector("svg.icon-favorite");
    By homePageCartLocator=new By.ByCssSelector("svg.icon-cart");
   // By acceptCookiesLocator=By.id("onetrust-accept-btn-handler");


    public HomePage(WebDriver driver) {

        super(driver);
        searchBox=new SearchBox(driver);
    }
    
    
    public boolean isOnHomePage() {
        return isDisplayed(homePageLocator);
    }

    public boolean isMyAccountOnHomePage() {
        return isDisplayed(homePageAccountLocator);
    }

    public boolean isMyFavoritesOnHomePage() {
        return isDisplayed(homePageFavoriteLocator);
    }

    public boolean isMyCartOnHomePage() {
        return isDisplayed(homePageCartLocator);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

   /* public void acceptCookies() {
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }*/


}
