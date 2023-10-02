package com.enla.pe.steps.validation;

import com.enla.pe.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;
import static com.enla.pe.utilities.ExplicitWait.Waits.waitElementToBeVisible;

public class ValidationStep extends ValidationPage {

    @Step("Validar visibilidad del modulo principal")
    public Boolean mainTitleIsDisplayed(){
        waitElementToBeVisible(getDriver(),title);
        return title.isDisplayed();
    }

    @Step("Validar visbilidad del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        waitElementToBeVisible(getDriver(), title_encuesta);
        return title_encuesta.isDisplayed();
    }

    @Step("Validar que el registro de dni es nuevo")
    public Boolean registerDniIsDisplayed(){
        waitElementToBeVisible(getDriver(), dni_registrado);
        return dni_registrado.isDisplayed();
    }

    @Step("Validar que el registro de dni es duplicado")
    public Boolean duplicatedDniIsDisplayed(){
        waitElementToBeVisible(getDriver(), dni_duplicado);
        return dni_duplicado.isDisplayed();
    }

    @Step("Validar que el reporte de asistencia se visualice")
    public String listReportIsDisplayed(){
        waitElementToBeVisible(getDriver(), dniListRegister);
        return dniListRegister.getText();
    }

}
