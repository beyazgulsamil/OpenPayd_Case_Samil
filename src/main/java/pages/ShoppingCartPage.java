package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pickleib.web.PickleibPageObject;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage extends PickleibPageObject {

    SearchPage searchPage = new SearchPage();

    @FindBy(css = "[role=\"listitem\"]")
    public List<WebElement> basketItems;

    public List<String> B;

    public void verifyBasketItems() {
        log.info("There are "+basketItems.size()+" products in this list");
        List<String> basketProducts = new ArrayList<>();
        for (WebElement element : basketItems) {
            basketProducts.add(element.getAttribute("data-asin"));
        }
        B = basketProducts;
        log.info(B.toString());
        log.info(SearchPage.A.toString());

        for (String element : SearchPage.A) {
            if (B.contains(element)) {
                log.success("Match ASIN" + element);
            } else {
                log.warning("Not match ASIN" + element);
            }
        }
    }

}
