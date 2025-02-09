package com.co.choucair.stepdefinitions;

import com.co.choucair.models.LoginLombokData;
import com.co.choucair.questions.*;
import com.co.choucair.task.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import static com.co.choucair.userinterfaces.DashboardMenu.*;
import static com.co.choucair.userinterfaces.LoginPage.*;
import static com.co.choucair.userinterfaces.OrderShipperSite.*;
import static com.co.choucair.utils.Constants.*;
import static org.hamcrest.Matchers.*;


public class AccessChartDialogSteepDefinition {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void close() {
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

    @When("^Accede al (.*) pantalla inicial$")
    public void seVeElDashboardPantallaInicial(String title) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTheTitle.on(TXT_TITTLE), containsString(title))
        );
    }

    @When("^Accede al apartado (.*)$")
    public void accedeAlApartadoChartInADialog(String opcionFinal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenBasicSamples.on()
        );
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTheTitle.on(TXT_FINAL_OPTION), containsString(opcionFinal))
        );
    }

    @When("Da clic al boton Launch Dialog")
    public void daClicAlBotonLaunchDialog() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ChartDialogSite.on()
        );
    }

    @Then("^Abre (.*) y su contenido$")
    public void abreLaunchDialogYSuContenido(String titleGraphic) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTheTitle.on(TXT_CHART),containsString(titleGraphic)),
                GivenWhenThen.seeThat(ValidateTheImage.on(IMG_CHART), is(true)));
    }
}
