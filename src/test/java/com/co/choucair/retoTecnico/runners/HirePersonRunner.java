package com.co.choucair.retoTecnico.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//Especifica que esta clase será ejecutada con la integración de Serenity y Cucumber.
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //Define la ruta donde se encuentran los archivos .feature
        features = "src/test/resources/features/hirePerson.feature",
        tags = "@NewRegister",
        glue = "com.co.choucair.retoTecnico.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class HirePersonRunner {
}
