package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateTheImage implements Question<Boolean> {
    protected Target element;

    public ValidateTheImage(Target element) {
        this.element = element;
    }

    @Override
    public Boolean answeredBy (Actor actor){
        return element.resolveFor(actor).isVisible();
    }
    public  static Question<Boolean> on(Target element){
        return new ValidateTheImage(element);
    }
}
