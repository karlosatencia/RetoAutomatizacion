package com.co.choucair.retoTecnico.interactions;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownListKeyboard implements Interaction {
    private final Target dropdownTarget;
    private final String optionText;

    public DropdownListKeyboard(Target dropdownTarget, String optionText) {
        this.dropdownTarget = dropdownTarget;
        this.optionText = optionText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement dropdown = dropdownTarget.resolveFor(actor);
        dropdown.click();

        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        for (int i = 0; i < 2; i++) { // Ajusta este número según el número de opciones que puedan estar en el dropdown
            String visibleText = dropdown.getText();
            if (visibleText.equals(optionText)) {
                actions.sendKeys("\n").perform(); // Presiona Enter si encuentra la opción
                return;
            }
            actions.sendKeys("\uE015").perform(); // Presiona ArrowDown para avanzar
        }
        actions.sendKeys("\n").perform();

    }
    public static DropdownListKeyboard withOptionText(Target dropdownTarget, String optionText) {
        return Instrumented.instanceOf(DropdownListKeyboard.class).withProperties(dropdownTarget, optionText);
    }
}
