import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {

  //  By productPageLocator= By.id("productListSort");
    By moreContentButtonLocator=new By.ByXPath("//button[@class='o-productMoreContent__btn btn']");
    By productLocator=new By.ByXPath("//div[@class='col-sm-4 col-md-4 col-lg-4 o-productList__itemWrapper']");
    By scrollLocator=new By.ByXPath("//div[@class='o-footer__top--content row no-gutters']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    /*public boolean isOnProductPage() {
        return isDisplayed(productPageLocator);
    }*/

   public void scrollDown(){
       JavascriptExecutor jsx = (JavascriptExecutor)driver;
       jsx.executeScript("window.scrollBy(0,1000)", "");
       // jsx.executeScript("window.scrollTo(0,document.body.scrollHeight)");

      // jsx.executeScript("arguments[0].scrollIntoView();",scrollLocator);





    }

    public void showMore(){
        click(moreContentButtonLocator);
    }

    public void selectProduct() {
        getAllProduct().get(new Random().nextInt(getAllProduct().size())).click();
    }

    private List<WebElement> getAllProduct(){
        return findAll(productLocator);
    }
}
