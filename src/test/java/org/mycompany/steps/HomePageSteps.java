package org.mycompany.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.mycompany.pages.HomePage;
import org.mycompany.pages.PagePool;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps {
    @Given("User opened Fabelio website")
    public void userOpenedFabelioWebsite() {
        System.setProperty("webdriver.chrome.driver", "/Users/falerymustika/WebDriver/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        String urlFabelio = "https://qa.fabelio.com";

        chromeDriver.get(urlFabelio);
        PagePool.homePage = new HomePage(chromeDriver);
    }

    @When("User in Home Page screen searches {string}")
    public void userInHomePageScreenSearchesSomething(String something) {
        PagePool.homePage.click(PagePool.homePage.buttonSearch);
        PagePool.homePage.sendKeys(PagePool.homePage.inputSearch, something);
    }
}
