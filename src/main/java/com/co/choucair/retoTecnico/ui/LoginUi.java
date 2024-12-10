package com.co.choucair.retoTecnico.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUi {
    public static final Target user = Target.the("")
            .located(By.name("username"));
    public static final Target password = Target.the("")
            .located(By.name("password"));
    public static final Target btn_login = Target.the("")
            .located(By.xpath("//button[contains(@class, 'orangehrm-login-button')]"));
}
