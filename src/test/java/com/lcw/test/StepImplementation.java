package com.lcw.test;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;

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

    public void click(){

    }
}
