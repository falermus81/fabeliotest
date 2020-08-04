package org.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    private ChromeDriver chromeDriver;

    public BasePage click(By by) {
        this.chromeDriver.findElement(by).click();
        return this;
    }

    public BasePage clear(By by) {
        this.chromeDriver.findElement(by).clear();
        return this;
    }

    public BasePage sendKeys(By by, String text) {
        this.chromeDriver.findElement(by).sendKeys(text);
        return this;
    }

    public boolean isEnabled(By by) {
        return this.chromeDriver.findElement(by).isEnabled();
    }

    public BasePage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}
