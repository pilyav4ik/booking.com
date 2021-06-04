package com.booking.booking_test;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement searchField = $(byId("ss"));
    public SelenideElement searchButton = $(byXpath("//button[@type='submit']"));
    public SelenideElement header = $(byXpath("//h1[contains(text(),'Valencia: 1,203 properties found')]"));
    public SelenideElement input = $(byXpath("//input[@value='Valencia']"));
}
