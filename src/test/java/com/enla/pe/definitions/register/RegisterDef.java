package com.enla.pe.definitions.register;

import com.enla.pe.steps.register.RegisterStep;
import com.enla.pe.steps.validation.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RegisterDef {

    @Steps(shared = true)
    RegisterStep register;

    @Steps(shared = true)
    ValidationStep validate;

    @When("selecciona el turno")
    public void userSelectTurno(){
        register.selectSchedule();
    }

    @And("ingresa la asistencia por dni")
    public void userRegisterAsistencia(){
        register.typeDni("00408147");
        register.typeDni("00799895");
        register.typeDni("01343741");
        register.typeDni("03697803");
        register.typeDni("04067482");
    }

    @Then("el aplicativo deberia mostrar la informacion del supervisor a capacitar")
    public void appShouldShowSupervisorInfo(){
        Assert.assertTrue(validate.registerDniIsDisplayed());
    }

    @And("ingresa la asistencia por dni ya registrado")
    public void userRegisterDuplicatedDni(){
        register.typeDni("00799895");
        register.typeDni("00799895");
    }

    @Then("el aplicativo deberia mostrar un mensaje de dni duplicado")
    public void appShouldShowDuplicatedDniMessage(){
        Assert.assertTrue(validate.duplicatedDniIsDisplayed());
    }

}
