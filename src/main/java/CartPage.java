import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

  //  By productPriceLocator=new By.ByXPath("//span[@class='m-productPrice__salePrice']");
  //  By cartPriceLocator=new By.ByXPath("//li[@class='m-orderSummary__item -grandTotal']//span[@class='m-orderSummary__value']");
    By productCountIncreaseLocator=new By.ByXPath("//option[@value='2']");
   // By countProductOnCartLocator=new By.ByXPath("//select[@id='quantitySelect0']//option");
    By deleteButtonOnCartLocator=new By.ByXPath("//button[@id='removeCartItemBtn0']");
    By emptyCartLocator=new By.ByXPath("//div[@class='m-empty']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

  /*  public Boolean isEqualPrices() {
        return productPrice().equals(cartPrice());
       // return productPrice() == cartPrice() ;
    }*/

   /* private String productPrice(){
        String product_Price=find(productPriceLocator).getText();
        return  product_Price;
    }*/

  /*  private String cartPrice(){
        String cart_Price=find(cartPriceLocator).getText();
        return cart_Price;
    }*/

  /*  private int productPrice(){
String product_Price=find(productPriceLocator).getText();
return Integer.parseInt(product_Price);
    }

    private int cartPrice(){
        String cart_Price=find(cartPriceLocator).getText();
        return Integer.parseInt(cart_Price);
    }*/

    public void increase_quantity(){

        click(productCountIncreaseLocator);
    }

   /* private int getProductCount(){
        String product_Count=find(productCountIncreaseLocator).getText();
        return Integer.parseInt(product_Count);
    }*/

  /*  private String getProductCount(){
        String product_Count=find(productCountIncreaseLocator).getText();
        return  product_Count;
    }


   public boolean isIncreaseQuantity() {
      // return getProductCount()==2;
       return getProductCount().equals(" 2 adet ");
    }*/


  /* private List<WebElement> count_Product_On_Cart(){
        return findAll(countProductOnCartLocator);
    }*/

    public void emptyCart(){
click(deleteButtonOnCartLocator);
    }

   public boolean isEmptyCart() {
        return isDisplayed(emptyCartLocator);
    }
}
