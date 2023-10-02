package com.enla.pe.definitions.login;

import com.enla.pe.steps.login.LoginStep;
import com.enla.pe.steps.validation.ValidationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validation;

    @Given("el usuario ingresa contraseña valida")
    public void userLoginWithValidCredentials(){
        //login.typePassword("254291");
        login.typePassword("334853");
        login.pressLogin();
    }

    @Then("el aplicativo deberia mostrar la pantalla principal")
    public void appShowMainModule(){
        Assert.assertTrue(validation.mainTitleIsDisplayed());
    }

    @Given("el usuario ingresa contraseña invalida")
    public void userLoginWithInvalidCredentials(){
        login.typePassword("123456");
        login.pressLogin();
    }

    @Then("el aplicativo deberia mostrar un mensaje de error")
    public void appShowErrorMessage(){
        Assert.assertTrue(validation.errorMessageIsDisplayed());
    }

}
