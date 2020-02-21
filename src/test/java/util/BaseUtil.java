package util;

import base.BaseTest;
import org.openqa.selenium.By;
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



}
