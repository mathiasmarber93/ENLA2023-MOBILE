package com.enla.pe.definitions.report;

import com.enla.pe.steps.validation.ValidationStep;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ReportDef {

    @Steps(shared = true)
    ValidationStep validate;

    @Then("el aplicativo deberia mostrar el reporte de la asistencia por dni")
    public void appShouldShowListReport(){
        Assert.assertEquals("5", validate.listReportIsDisplayed());
    }

}
