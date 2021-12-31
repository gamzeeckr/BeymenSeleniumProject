import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator =new By.ByXPath("//button[@class='m-addBasketFavorite__basket btn']");
    By cartContainerLocator = new By.ByXPath("//a[@href='/cart']");
    By sizeLocator=new By.ByXPath("//span[@class='m-variation__item' or @class='m-variation__item -criticalStock']");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void selectSize() {

        getAllSize().get(new Random().nextInt(getAllSize().size())).click();
    }

    private List<WebElement> getAllSize(){

        return findAll(sizeLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }

    public void goToCart() {
        click(cartContainerLocator);
    }
}