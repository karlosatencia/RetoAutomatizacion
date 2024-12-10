package com.co.choucair.retoTecnico.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormCandidateUi {
    public static Target btn_add = Target.the("")
            .located(By.xpath("//button[text()=' Add ']"));
    public static final Target firstName = Target.the("")
            .located(By.name("firstName"));
    public static final Target middletName = Target.the("")
            .located(By.name("middleName"));
    public static final Target lastName = Target.the("")
            .located(By.name("lastName"));
    public static Target vacancy = Target.the("")
            .located(By.xpath("//div[@class='oxd-select-text--after']"));
    public static Target optionVacancy = Target.the("")
            .located(By.xpath("//div[@class='oxd-select-text-input' and text()='Payroll Administrator']"));
    public static Target email = Target.the("")
            .located(By.xpath("//input[@placeholder='Type here']"));
    public static Target contact = Target.the("")
            .located(By.xpath("(//input[@placeholder='Type here'])[2]"));
    public static Target keywords = Target.the("")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
    public static Target notes = Target.the("")
            .located(By.xpath("//textarea[@placeholder='Type here']"));
    public static Target chc_consent = Target.the("Consent checkbox")
            .located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public static Target btn_save = Target.the("")
            .located(By.xpath("//button[normalize-space()='Save']"));
    public static Target btn_shortlist = Target.the("")
            .located(By.xpath("//button[normalize-space()='Shortlist']"));
    public static Target btn_save2 = Target.the("")
            .located(By.xpath("//button[normalize-space()='Save']"));
    public static Target btn_scheduleInterview = Target.the("")
            .located(By.xpath("//button[normalize-space()='Schedule Interview']"));
    public static Target interviewTitle = Target.the("")
            .located(By.xpath("(//div[input[contains(@class, 'oxd-input--active')]]/input)[6]"));
    public static Target interviewer = Target.the("")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input"));
    public static Target date = Target.the("")
            .located(By.xpath("(//div[input[contains(@class, 'oxd-input--active')]]/input)[7]"));
    public static Target btn_save3 = Target.the("")
            .located(By.xpath("//button[normalize-space()='Save']"));
    public static Target btn_markInterviewPassed = Target.the("")
            .located(By.xpath("//button[normalize-space()='Mark Interview Passed']"));
    public static Target btn_save4 = Target.the("")
            .located(By.xpath("//button[normalize-space()='Save']"));
    public static Target btn_offerJob = Target.the("")
            .located(By.xpath("//button[normalize-space()='Offer Job']"));
    public static Target btn_save5 = Target.the("")
            .located(By.xpath("//button[normalize-space()='Save']"));
    public static Target btn_hire = Target.the("")
            .located(By.xpath("//button[normalize-space()='Hire']"));
    public static Target btn_save6 = Target.the("")
            .located(By.xpath("//button[normalize-space()='Save']"));

}
