package com.co.choucair.retoTecnico.tasks;
import com.co.choucair.retoTecnico.interactions.DropdownListKeyboard;
import com.co.choucair.retoTecnico.models.Person;
import com.co.choucair.retoTecnico.models.UserCredentials;
import com.co.choucair.retoTecnico.ui.FormCandidateUi;
import com.co.choucair.retoTecnico.ui.LoginUi;
import com.co.choucair.retoTecnico.ui.MenuUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.co.choucair.retoTecnico.ui.FormCandidateUi.*;

public class RegisterCandidate implements Task{
    Person person;

    public RegisterCandidate(Person dataPerson) {
        this.person = dataPerson;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actor.attemptsTo(
                Click.on(MenuUi.btn_recruitment),
                Click.on(FormCandidateUi.btn_add),
                Enter.theValue(person.getFirstname()).into(FormCandidateUi.firstName),
                Enter.theValue(person.getMiddlename()).into(FormCandidateUi.middletName),
                Enter.theValue(person.getLastname()).into(FormCandidateUi.lastName),


                DropdownListKeyboard.withOptionText(vacancy, "Payroll Administrator"),

                Enter.theValue(person.getEmail()).into(FormCandidateUi.email),
                Enter.theValue(person.getContactnumber()).into(FormCandidateUi.contact),
                Enter.theValue(person.getKeywords()).into(FormCandidateUi.keywords),
                Enter.theValue(person.getNotes()).into(FormCandidateUi.notes),
                Click.on(FormCandidateUi.chc_consent),
                Click.on(FormCandidateUi.btn_save),
                WaitUntil.the(FormCandidateUi.btn_shortlist, WebElementStateMatchers.isVisible())
                      .forNoMoreThan(15).seconds(),
                Click.on(FormCandidateUi.btn_shortlist),
                WaitUntil.the(FormCandidateUi.btn_save2, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(15).seconds(),
                Click.on(FormCandidateUi.btn_save2),
                Click.on(btn_scheduleInterview),
                Enter.theValue("Juliana").into(interviewTitle),
                JavaScriptClick.on(interviewer),
                Enter.theValue("a").into(interviewer)
        );

        try {
            Thread.sleep(5000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys("\uE015").perform();
        actions.sendKeys("\n").perform();
        actor.attemptsTo(
                Enter.theValue("2024-15-12").into(date),
                Click.on(btn_save3),
                WaitUntil.the(btn_markInterviewPassed, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(15).seconds(),
                Click.on(btn_markInterviewPassed),
                Click.on(btn_save4),
                Click.on(btn_offerJob),
                Click.on(btn_save5),
                Click.on(btn_hire),
                Click.on(btn_save6)
        );
        try {
            Thread.sleep(5000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static RegisterCandidate withPerson(Person person) {
        return Instrumented.instanceOf(RegisterCandidate.class).withProperties(person);
    }
}
