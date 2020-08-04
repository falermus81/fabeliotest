package org.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {
    public final By buttonSearch = By.xpath("//*[contains(@class, \"MuiButtonBase-root MuiIconButton-root\")]");
    public final By inputSearch = By.xpath("//*[contains(@class, \"MuiInputBase-input\")]");

    public HomePage(ChromeDriver chromeDriver) {
        super(chromeDriver);
    }
}
