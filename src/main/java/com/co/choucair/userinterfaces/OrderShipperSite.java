package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderShipperSite {
    public static final Target TXT_CHART = Target.the("Titulo Orders by Shipper")
            .located(By.xpath("//h5[text()='Orders by Shipper']"));
    public static final Target IMG_CHART = Target.the("Imagen de la grafica")
            .located(By.xpath("//canvas[@id='Serenity_Demo_BasicSamples_ChartInDialog0_Chart']"));
}
