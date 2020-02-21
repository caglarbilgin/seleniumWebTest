package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendKeyElement {


    @FindBy(id = "searchData")
    public static WebElement search1;

    public static String search = "#searchData";
}
