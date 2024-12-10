package com.co.choucair.retoTecnico.stepdefinitions;

import com.co.choucair.retoTecnico.models.Person;
import com.co.choucair.retoTecnico.questions.ValidateStatus;
import com.co.choucair.retoTecnico.tasks.RegisterCandidate;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterCandidateStepDefinition {
    @When("enter the information of the person to be hired")
    public void enterTheInformationOfThePersonToBeHired(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                RegisterCandidate.withPerson(Person.setData(dataTable).get(0))
        );
    }
    @Then("^the system validates the candidate (.*)$")
    public void theSystemValidatesTheCandidateData(String status) {
        theActorInTheSpotlight().should(seeThat(ValidateStatus.correct(status)));
    }
}
