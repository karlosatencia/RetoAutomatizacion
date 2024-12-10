package com.co.choucair.retoTecnico.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuUi {
    public static Target btn_recruitment = Target.the("")
            .located(By.xpath("//span[contains(@class, 'oxd-text') and text()='Recruitment']"));
}
