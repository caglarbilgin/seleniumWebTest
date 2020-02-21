package testCases;

import elements.ClickElement;
import elements.SendKeyElement;
import org.junit.Test;
import util.BaseUtil;

public class Search extends BaseUtil{



    @Test
    public void clickAndSearchElement(){
        clickElement(ClickElement.category);
        sendKeyToElement(SendKeyElement.search,"araba");

        //---------------------------------------------------------
        clickToElement(ClickElement.category1);
        sendKeyElement(SendKeyElement.search1,"araba");
    }

}
