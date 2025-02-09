package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChartDialogPage {
    public static final Target BTN_Launch = Target.the("Boton Launch Dialog")
            .located(By.xpath("//button[text()='Launch Dialog']"));
}
