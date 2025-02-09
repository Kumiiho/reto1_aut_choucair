package com.co.choucair.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.ChartDialogPage.BTN_Launch;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChartDialogSite implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_Launch, isVisible()).forNoMoreThan(10).seconds(), Click.on(BTN_Launch)
        );
    }

    public static ChartDialogSite on() {
        return Instrumented.instanceOf(ChartDialogSite.class).withProperties();
    }
}

