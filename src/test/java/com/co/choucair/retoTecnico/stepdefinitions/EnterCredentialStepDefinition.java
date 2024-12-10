package com.co.choucair.retoTecnico.stepdefinitions;

import com.co.choucair.retoTecnico.models.UserCredentials;
import com.co.choucair.retoTecnico.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.co.choucair.retoTecnico.utils.Constants.ACTOR;
import static com.co.choucair.retoTecnico.utils.Constants.URL;

public class EnterCredentialStepDefinition {

    @Given("which user enters the orange HRM website")
    public void whichUserEntersTheOrangeHRMWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @Given("enter your credentials")
    public void enterYourCredentials(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(UserCredentials.setData(dataTable).get(0))
        );
    }
}
