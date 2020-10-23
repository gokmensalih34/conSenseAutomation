package com.conSense.stepdefinitions;

import com.conSense.pages.HomePage;
import com.conSense.utilities.BrowserUtils;
import com.conSense.utilities.ConfigurationReader;
import com.conSense.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageStepDefinitions {

    @Given("the user access HomePage")
    public void the_user_access_HomePage() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("the page title is {string}")
    public void the_page_title_is(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Verify Page Title", expectedTitle,actualTitle);
    }

    @Then("the user see the following at {string}")
    public void the_user_see_the_following_at(String tab, List<String> expectedTabs) {

        if (tab.equalsIgnoreCase("homepage")) {
            List<String> actualTabs = BrowserUtils.getElementsText(new HomePage().mainNavBar);
            System.out.println(actualTabs);
            Assert.assertEquals(expectedTabs, actualTabs);
        }
    }

}
