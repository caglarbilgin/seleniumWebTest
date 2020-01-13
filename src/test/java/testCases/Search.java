package testCases;

import elements.Elements;
import org.junit.Test;
import util.BaseUtil;

public class Search extends BaseUtil{


    @Test
    public void clickElement(){
        clickElement(Elements.category);
        sendKeyToElement(Elements.search,"araba");
    }

}
