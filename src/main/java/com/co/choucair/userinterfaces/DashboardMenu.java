package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardMenu {
    public static final Target BTN_MENU = Target.the("Boton menu")
            .located(By.xpath("//button[@class='s-sidebar-toggler']"));
    public static final Target MENU_OPTION = Target.the("Opcion Basic Samples")
            .located(By.xpath("//span[text()='Basic Samples']"));
    public static final Target MENU_SUBOPTION = Target.the("Submenu Dialogs")
            .located(By.xpath("//span[text()='Dialogs']"));
    public static final Target MENU_FINAL_OPTION = Target.the("Opcion Chart in a Dialog")
            .located(By.xpath("//span[text()='Chart in a Dialog']"));
    public static final Target TXT_FINAL_OPTION = Target.the("Texto titulo Chart in a Dialog")
            .located(By.xpath("//h1[text()='Chart in a Dialog']"));
}
