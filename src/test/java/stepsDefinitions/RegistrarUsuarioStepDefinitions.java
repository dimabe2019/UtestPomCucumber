package stepsDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.UtestSteps;

public class RegistrarUsuarioStepDefinitions {

    @Steps
    UtestSteps utestSteps = new UtestSteps();

    @Given("^que me encuentro en la pagina de Utest con la url (.*)$")
    public void queMeEncuentroEnLaPaginaDeUtestConLaUrlHttpsWwwUtestCom(String url) {
        SeleniumWebDriver.ChromeWebDriver(url);

    }


    @When("^realizo el registro en la pagina$")
    public void realizoElRegistroEnLaPagina() throws InterruptedException {
        Thread.sleep(2000);
        utestSteps.procesoRegistro();
    }

    @Then("^podre ver el contenido de la pagina$")
    public void podreVerElContenidoDeLaPagina() {
        utestSteps.validarRegistro();
        //SeleniumWebDriver.driver.quit();
    }
}
