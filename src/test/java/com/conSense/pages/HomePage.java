package com.conSense.pages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy (xpath = "(//ul[@class='nav navbar-nav smartmenus con_header-top-navigation sm'])[1]/li")
    public List<WebElement> mainNavBar;



    @FindBy(id = "cookies-modal-accept-btn")
    public WebElement acceptAllCookies;

    @FindBy(id = "cookies-modal-saveAndClose-btn")
    public WebElement acceptCookies;

    @FindBy(xpath = "(//a[@tabindex='102'])[1]")
    public WebElement conSenseTab;

    @FindBy (xpath = "//a[.='Zahlen, Daten, Fakten']")
    public WebElement zahlenDatenFakten;

    @FindBy(xpath = "//div[text()='17']")
    public WebElement jahreErfahrung;
}
