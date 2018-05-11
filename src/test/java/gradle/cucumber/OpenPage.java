package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gradle.cucumber.pages.DisplayPrayer;

public class OpenPage {

    DisplayPrayer mainPage = new DisplayPrayer();

    @Given("^I naviagte to the page with prayer$")
    public void iNavigateToTheMainPage() throws Throwable {
        mainPage.open();
    }

    @Then("^Text of prayer appears in the browser$")
    public void iShouldSeeTheMailPage() throws Throwable {
       // mainPage.checkOpenMailPage();
    }
}
