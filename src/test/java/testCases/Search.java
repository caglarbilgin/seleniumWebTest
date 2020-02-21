package testCases;

import elements.Element;
import org.junit.Test;

public class Search extends Element {

    @Test
    public void clickAndSearchElement() throws InterruptedException {
        clickElement(Element.category);
        Thread.sleep(10000);
        sendKeyToElement(Element.search,"araba");
        Thread.sleep(10000);

    }
}
