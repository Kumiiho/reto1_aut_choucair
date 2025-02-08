package com.co.choucair.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ChartDialogPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static ChartDialogPage on(){
        return Instrumented.instanceOf(ChartDialogPage.class).withProperties();
    }
}

