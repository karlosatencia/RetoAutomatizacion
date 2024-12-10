package com.co.choucair.retoTecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static com.co.choucair.retoTecnico.ui.FormCandidateUi.STATUS;

public class ValidateStatus implements Question<Boolean> {
    private String statusFound;
    public ValidateStatus(String statusFound) {
        this.statusFound = statusFound;
    }
    public static ValidateStatus correct (String statusFound) {
        return new ValidateStatus(statusFound);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String status = Text.of(STATUS).answeredBy(actor);
        return statusFound.equals(status);
    }
}
