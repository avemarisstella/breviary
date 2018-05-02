package com.breviary;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StepDefs extends AbstractDefs
{
    @When("^user chooses 20 kwietnia in calendar$")
    public void the_client_chooses_date() throws Throwable
    {
        executeGet("http://localhost:8080/prayer");
    }

    @When("^chooses Wezwanie\n$")
    public void the_client_chooses_wezwanie() throws Throwable
    {
        executeGet("http://localhost:8080/prayer");
    }


    @Then("^the user receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable
    {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : "+ latestResponse.getBody(), currentStatusCode.value(), is(statusCode) );
    }

    @And("^the user receives proper text$")
    public void the_client_receives_prayer_text() throws Throwable
    {
        String tekst = "xyz";
        assertThat(latestResponse.getBody(), is(tekst)) ;
    }
}
