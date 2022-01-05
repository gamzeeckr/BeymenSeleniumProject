import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By productPriceLocator=new By.ByXPath("//span[@class='m-productPrice__salePrice']");
   By cartPriceLocator=new By.ByXPath("//li[@class='m-orderSummary__item -grandTotal']//span[@class='m-orderSummary__value']");
    By productCountIncreaseLocator=new By.ByXPath("//option[@value='2']");
    By deleteButtonOnCartLocator=new By.ByXPath("//button[@id='removeCartItemBtn0']");
    By emptyCartLocator=new By.ByXPath("//div[@class='m-empty']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String productPrice(){
        String product_Price=find(productPriceLocator).getText();
        return product_Price;
    }

    public String cartPrice(){
        String cart_Price=find(cartPriceLocator).getText();
        return cart_Price;
    }


    public void increase_quantity(){

        click(productCountIncreaseLocator);
    }

   private int getProductCount(){
        String product_Count=find(productCountIncreaseLocator).getText().trim();
       String[] arr= product_Count.split(" ");
       int count=Integer.parseInt(arr[0]);
        return count;
    }

   public boolean isIncreaseQuantity() {

       return getProductCount()==2;
    }


    public void emptyCart(){
click(deleteButtonOnCartLocator);
    }

   public boolean isEmptyCart() {
        return isDisplayed(emptyCartLocator);
    }
}
