package pages;

import context.ContextStore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pickleib.web.PickleibPageObject;
import pickleib.web.interactions.WebInteractions;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends PickleibPageObject {

    WebInteractions webInteractions;

    @FindBy(css = ".puisg-row:first-of-type:not(:has(.a-text-price)) [aria-label=\"Add to cart\"]")
    public List<WebElement> notDiscountAddtoCartButtons;

    @FindBy(id = "nav-cart")
    public WebElement cartButton;

    @FindBy(css = ".puisg-row:first-of-type:not(:has(.a-text-price)):has([aria-label=\"Add to cart\"]) [name=\"items[0.base][asin]\"]")
    public List<WebElement> CartElements;

    public static List<String> A;

    public void addAddedProductsContextStore() {
        log.info("There are "+CartElements.size()+" products in this list");
        List<String> addedProducts = new ArrayList<>();
        for (WebElement element : CartElements) {
            addedProducts.add(element.getAttribute("value"));
        }
        A = addedProducts;
        log.info(A.toString());
    }

    public void verifyCardProducts(){
        System.out.println("There are "+CartElements.size()+" products in this list");
        ContextStore.put("cartProducts", CartElements);
    }
}
