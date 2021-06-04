package com.booking.booking_test;

import com.booking.booking_test.config.ConfigurationSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

public class MainPageTest {
    private final MainPage mainPage = new MainPage();
    private final ConfigurationSelenide configurationSelenide = new ConfigurationSelenide();

    @BeforeEach
    public void setSettings(){
        configurationSelenide.setUp();
    }

    @Test
    public void search() {

        mainPage.searchField.sendKeys("Valencia");
        mainPage.searchButton.click();
        mainPage.header.shouldHave(visible);
        mainPage.input.shouldHave(visible);
    }


    public ConfigurationSelenide getConfiguration() {
        return configurationSelenide;
    }
}
