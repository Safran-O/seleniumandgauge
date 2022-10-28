package com.lcw.test;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class StepImplementation extends BaseTest {

    @Step("<Key> Saniye Bekle")
    public void waitElement(int Key) throws InterruptedException{
        //Gauge.captureScreenshot();
        //Gauge.writeMessage("Saniye Bekleniyor");
        Thread.sleep(Key*2500);
    }

    @Step("5 Saniye Bekle")
    public void waitElement() throws InterruptedException{
        Thread.sleep(5000);
    }

    @Step("Arama kısmına alanına tıkla")
    public void click(){
        driver.findElement(By.id("search-form__input-field__search-input")).click();
    }

    @Step("Search butonuna tıkla")
    public void clickTwo(){
        driver.findElement(By.cssSelector(".search-form__input-field__btn-search.false")).click();
    }
    @Step("Arama alanına tişört değerini yolla")
    public void sendKeys(){
        driver.findElement(By.id("search-form__input-field__search-input")).sendKeys("tişört");
        driver.findElement(By.id("search-form__input-field__search-input")).sendKeys(Keys.ENTER);
    }

}
