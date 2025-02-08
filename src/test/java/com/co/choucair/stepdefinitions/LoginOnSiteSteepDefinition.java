package com.co.choucair.stepdefinitions;

import com.co.choucair.models.LoginLombokData;
import com.co.choucair.questions.ValidateTheTitle;
import com.co.choucair.task.LoginOnSite;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import static com.co.choucair.userinterfaces.LoginPage.*;
import static com.co.choucair.utils.Constants.ACTOR;
import static com.co.choucair.utils.Constants.URL;
import static org.hamcrest.Matchers.containsString;

public class LoginOnSiteSteepDefinition {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void close(){
        SerenityWebdriverManager.inThisTestThread().clearCurrentActiveDriver();
        SerenityWebdriverManager.inThisTestThread().closeCurrentDriver();
    }

    @Given("El usuario accede al WebSite")
    public void seAccedeAlWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @When("Ingresar credenciales de inicio de sesion")
    public void seIngresanLasCredenciales(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            LoginOnSite.on(LoginLombokData.setData(dataTable).get(0))
        );

    }
    @Then("^Accede al (.*) pantalla inicial$")
    public void seVeElDashboardPantallaInicial(String title) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTheTitle.on(TXT_TITTLE), containsString(title))
        );
    }
}
