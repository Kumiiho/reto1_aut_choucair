package com.co.choucair.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.DashboardMenu.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenBasicSamples implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MENU),
                WaitUntil.the(MENU_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MENU_OPTION),
                Click.on(MENU_SUBOPTION),
                Click.on(MENU_FINAL_OPTION)
        );
    }

    public static OpenBasicSamples on() {
        return Instrumented.instanceOf(OpenBasicSamples.class).withProperties();
    }
}
