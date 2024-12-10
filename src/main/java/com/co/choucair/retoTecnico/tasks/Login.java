package com.co.choucair.retoTecnico.tasks;

import com.co.choucair.retoTecnico.models.UserCredentials;
import com.co.choucair.retoTecnico.ui.LoginUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;

public class Login implements Task {

    UserCredentials userCredentials;

    public Login(UserCredentials credentials) {
        this.userCredentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userCredentials.getUsername()).into(LoginUi.user),
                Enter.theValue(userCredentials.getPassword()).into(LoginUi.password),
                Click.on(LoginUi.btn_login)
        );
    }

    public static Login withCredentials(UserCredentials userCredentials) {
        return Instrumented.instanceOf(Login.class).withProperties(userCredentials);
    }
}