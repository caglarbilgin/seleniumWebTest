package elements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickElement {

    public static String category = "#contentMain > div > nav > ul > li:nth-child(1) > a";

    @FindBy(css = "#contentMain > div > nav > ul > li:nth-child(1) > a")
    public static WebElement category1;


}
