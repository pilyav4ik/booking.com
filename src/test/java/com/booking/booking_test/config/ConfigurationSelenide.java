package com.booking.booking_test.config;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class ConfigurationSelenide {

    @BeforeAll
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://booking.com/";
        open("https://booking.com/");
    }
}
