import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Added_Product_ToCart extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void control_homePage_account_favorites_cart() throws InterruptedException {
        homePage=new HomePage(driver);
        //homePage.acceptCookies();
        Assertions.assertTrue(homePage.isOnHomePage(),"Not on home page!");
        Assertions.assertTrue(homePage.isMyAccountOnHomePage(),"Not my account on home page!");
        Assertions.assertTrue(homePage.isMyFavoritesOnHomePage(),"Not my favorites on home page!");
        Assertions.assertTrue(homePage.isMyCartOnHomePage(),"Not my cart on home page!");
        Thread.sleep(3000);
    }

    @Test
    @Order(2)
    public void search_a_product() throws InterruptedException {

        productsPage=new ProductsPage(driver);
        homePage.searchBox().search("pantolon");
       // Assertions.assertTrue(productsPage.isOnProductPage(),"Not on product page!");
        Thread.sleep(3000);

    }

    @Test
    @Order(3)
    public void scroll_Down() throws InterruptedException {
        productsPage.scrollDown();
        Thread.sleep(3000);
    }

    @Test
    @Order(4)
    public void show_More() throws InterruptedException{
        productsPage.showMore();
        Thread.sleep(3000);
    }

    @Test
    @Order(5)
    public void select_a_product() throws InterruptedException {
        productDetailPage=new ProductDetailPage(driver);

        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");
        Thread.sleep(3000);
    }

    @Test
    @Order(6)
    public void add_product_to_cart() throws InterruptedException {
        productDetailPage.selectSize();
        productDetailPage.addToCart();
        Thread.sleep(3000);
    }

    @Test
    @Order(7)
   public void go_to_cart() throws InterruptedException {
        cartPage=new CartPage(driver);
       productDetailPage.goToCart();
        Assertions.assertEquals(cartPage.productPrice(),cartPage.cartPrice());
        Thread.sleep(3000);

    }

    @Test
    @Order(8)
    public void product_count() throws InterruptedException {
        cartPage.increase_quantity();
        Assertions.assertTrue(cartPage.isIncreaseQuantity(),"Count of product is not two in the cart");
        Thread.sleep(3000);
    }

    @Test
    @Order(9)
    public void empty_cart(){
        cartPage.emptyCart();
        Assertions.assertTrue(cartPage.isEmptyCart(),"Cart is not empty");
    }
}
