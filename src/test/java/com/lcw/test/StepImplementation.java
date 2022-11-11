package com.lcw.test;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

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

    @Step("WebDriverWait 5 saniye bekle ve Logoya tıkla")
    public void waitWithCondition(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/a[1]/*[1]")));
        // click on the compose button as soon as the "compose" button is visible
        driver.findElement(By.xpath("//header/div[2]/div[1]/a[1]/*[1]")).click();
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

    @Step("Id li <element> elemente tıkla")
    public void clickElemenByName(String element) {
        driver.findElement(By.id(element)).click();
    }
    @Step("Name li <element> elemente bul ve <Key> degerini yaz")
    public void sendKeyByName(String element, String Key){
        driver.findElement(By.name(element)).sendKeys(Key);
    }
    @Step("Xpath li <element> elemente tıkla")
    public void clickElemenByXpath(String element) {
        driver.findElement(By.xpath(element)).click();
    }

}
