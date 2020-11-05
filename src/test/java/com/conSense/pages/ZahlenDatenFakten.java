package com.conSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZahlenDatenFakten extends BasePage{

    @FindBy(xpath = "//div[text()='15']")
    public WebElement erfahrungInJahre;


}
