package com.enla.pe.steps.register;

import com.enla.pe.pages.register.RegisterPage;
import net.thucydides.core.annotations.Step;

import static com.enla.pe.utilities.ExplicitWait.Waits.waitElementToBeVisible;

public class RegisterStep extends RegisterPage {

    @Step("Seleccionar turno")
    public void selectSchedule(){
        turno.click();
        turnoOption.click();
    }

    @Step("Ingresar el DNI")
    public void typeDni(String dni){
        waitElementToBeVisible(getDriver(), txt_dni);
        txt_dni.sendKeys(dni);
    }

}
