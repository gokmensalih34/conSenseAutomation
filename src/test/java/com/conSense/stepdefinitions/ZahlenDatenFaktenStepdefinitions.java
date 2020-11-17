package com.conSense.stepdefinitions;

import com.conSense.pages.BasePage;
import com.conSense.pages.HomePage;
import com.conSense.pages.ZahlenDatenFakten;
import com.conSense.utilities.BrowserUtils;
import com.conSense.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class ZahlenDatenFaktenStepdefinitions {

    static String erfahrungAtHomePage;

    @When("the user navigate to {string}")
    public void the_user_navigate_to(String conSenseTab) {

        new HomePage().acceptAllCookies.click();

        BrowserUtils.waitFor(1);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        for (int i = 0; i < 5; i++) {
            BrowserUtils.waitFor(1);
            jse.executeScript("window.scrollBy(0, 250);");

        }

        BrowserUtils.waitFor(3);

        erfahrungAtHomePage = new HomePage().jahreErfahrung.getText();

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(new HomePage().conSenseTab).perform();

        System.out.println("zahlenDatenFaktenisDisplayed() = " + new HomePage().zahlenDatenFakten.isDisplayed());

        //use executeScript
        jse.executeScript("arguments[0].click();",new HomePage().zahlenDatenFakten);

        BrowserUtils.waitFor(3);

    }

    @Then("the foundation years are same at {string} and {string}")
    public void the_foundation_years_are_same_at_and(String homePage, String zahlenDatenFaktenPage) {
        homePage = erfahrungAtHomePage;

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        for (int i=0; i<2; i++) {
            BrowserUtils.waitFor(1);
            jse.executeScript("window.scrollBy(0,250);");
        }

        zahlenDatenFaktenPage = new ZahlenDatenFakten().erfahrungInJahre.getText();

        BrowserUtils.waitFor(2);

        Assert.assertEquals("Verifing the displayed experience years are same", homePage,zahlenDatenFaktenPage);

    }


}
