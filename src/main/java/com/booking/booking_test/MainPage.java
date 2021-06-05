package com.booking.booking_test;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement searchField = $(byId("ss"));
    public SelenideElement searchButton = $(byXpath("//button[@type='submit']"));
    public SelenideElement linkValencia = $(byXpath("//a[contains(text(),'Valencia Community')]"));
    public SelenideElement input = $(byXpath("//input[@value='Valencia']"));
}
