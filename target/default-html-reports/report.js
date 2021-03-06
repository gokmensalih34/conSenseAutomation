$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "Verifying Tabs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Verifying Tabs at HomePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user access HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.conSense.stepdefinitions.HomePageStepDefinitions.the_user_access_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title is \"ConSense GmbH – Die Software für Prozess- und Qualitätsmanagement: ConSense\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.conSense.stepdefinitions.HomePageStepDefinitions.the_page_title_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user see the following at \"HomePage\"",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.conSense.stepdefinitions.HomePageStepDefinitions.the_user_see_the_following_at(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/zahlen-daten-fakten.feature");
formatter.feature({
  "name": "Verifyig the foundation year",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@zah"
    }
  ]
});
formatter.scenario({
  "name": "The foundation year should see be same",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@zah"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user access HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.conSense.stepdefinitions.HomePageStepDefinitions.the_user_access_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigate to \"zahlen-daten-fakten\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.conSense.stepdefinitions.ZahlenDatenFaktenStepdefinitions.the_user_navigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the foundation years are same at \"HomePage\" and \"zahlen-daten-fakten Page\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.conSense.stepdefinitions.ZahlenDatenFaktenStepdefinitions.the_foundation_years_are_same_at_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Verifing the displayed experience years are same expected:\u003c1[7]\u003e but was:\u003c1[5]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat com.conSense.stepdefinitions.ZahlenDatenFaktenStepdefinitions.the_foundation_years_are_same_at_and(ZahlenDatenFaktenStepdefinitions.java:64)\n\tat ✽.the foundation years are same at \"HomePage\" and \"zahlen-daten-fakten Page\"(file:///Users/sgok/IdeaProjects/conSenseAutomation/src/test/resources/features/zahlen-daten-fakten.feature:6)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});