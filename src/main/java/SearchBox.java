import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator=new By.ByXPath("//input[@class='default-input o-header__search--input']");
   // By submitButtonLocator = new By.ByXPath("//button[@class='o-header__search--btn bmi-search']");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text + Keys.ENTER );
       // click(submitButtonLocator);
    }
}
