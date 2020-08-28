package testCases;

import elements.Element;
import org.junit.Test;

public class Search extends Element {

    @Test
    public void clickAndSearchElement() throws InterruptedException {
        Element element = new Element();

        clickElement(element.category);
        Thread.sleep(10000);

        sendKeyToElementDeneme(element.search,"araba");
        Thread.sleep(10000);
    }
}
