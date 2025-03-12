package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pickleib.web.PickleibPageObject;

public class LandingPage extends PickleibPageObject {

    @FindBy(css = "[aria-label=\"Search Amazon\"]")
    public WebElement searchBar;
    @FindBy(css = "[value=\"Go\"]")
    public WebElement searchButton;
    @FindBy (css = ".a-spacing-medium")
    public WebElement amazonIcon;
    @FindBy(css = "[data-card-metrics-id=\"cropped-image-link_desktop-gateway-atf_0\"]")
    public WebElement amazonBanner;

}
