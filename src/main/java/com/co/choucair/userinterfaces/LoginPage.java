package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USER = Target.the("txt")
            .located(org.openqa.selenium.By.id("LoginPanel0_Username"));
    public static final Target TXT_PASS = Target.the("txt")
            .located(org.openqa.selenium.By.xpath("//input[@id='LoginPanel0_Password']"));
    public static final Target BTN_LOGIN = Target.the("txt")
            .located(org.openqa.selenium.By.xpath("//button[@id='LoginPanel0_LoginButton']"));
    public static final Target TXT_TITTLE = Target.the("txt")
            .located(By.xpath("//h1"));
}
