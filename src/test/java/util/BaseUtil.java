package util;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseUtil  extends BaseTest{


    public void clickElement(String key){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(key))).click();

    }
    public void sendKeyToElement(String key, String sendKey){

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(key))).sendKeys(sendKey);
    }

    public  void clickToElement(WebElement element){
        element.click();
    }

    public void sendKeyElement(WebElement element, String value){
        element.sendKeys(value);
    }


}
