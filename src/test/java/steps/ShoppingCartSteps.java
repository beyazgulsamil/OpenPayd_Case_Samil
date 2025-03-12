package steps;

import io.cucumber.java.en.Given;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {
    SearchPage searchPage = new SearchPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("Add products to context Store")
    public void addProductsToContextStore() {
        searchPage.addAddedProductsContextStore();
    }

    @Given("Verify products in basket")
    public void verifyProductsInBasket() {
        shoppingCartPage.verifyBasketItems();
    }
}
