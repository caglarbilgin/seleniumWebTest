package testCases;

import elements.Element;
import org.junit.Test;

public class Search extends Element {

    @Test
    public void clickAndSearchElement() throws InterruptedException {

        Element element = new Element();

        clickElement(element.deneme);
        Thread.sleep(5000);
        clickElement(element.category);


    }

    @Test
    public void clickAndSearchElement1() throws InterruptedException {

        Element element = new Element();

        clickElement(element.deneme);
        Thread.sleep(5000);
        clickElement(element.category);



    }
    @Test
    public void clickAndSearchElement2() throws InterruptedException {

        Element element = new Element();

        clickElement(element.deneme);
        Thread.sleep(5000);
        clickElement(element.category);
        Thread.sleep(5000);
        clickElement(element.category);


    }

}
