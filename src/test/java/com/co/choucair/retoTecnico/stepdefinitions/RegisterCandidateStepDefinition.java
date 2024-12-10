package com.co.choucair.retoTecnico.stepdefinitions;

import com.co.choucair.retoTecnico.models.Person;
import com.co.choucair.retoTecnico.tasks.RegisterCandidate;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegisterCandidateStepDefinition {
    @When("enter the information of the person to be hired")
    public void enterTheInformationOfThePersonToBeHired(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterCandidate.withPerson(Person.setData(dataTable).get(0))
        );
    }
}
