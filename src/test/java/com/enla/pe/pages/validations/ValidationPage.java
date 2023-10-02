package com.enla.pe.pages.validations;

import com.enla.pe.base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends ScreenBase {

    @AndroidFindBy(id = "com.gob.inei.AsistenciaENLA2B:id/txt_titulo")
    protected WebElementFacade title;

    @AndroidFindBy(id = "login_titulo_encuesta")
    protected WebElementFacade title_encuesta;

    @AndroidFindBy(id = "txt_registrado_dni")
    protected WebElementFacade dni_registrado;

    @AndroidFindBy(id = "txt_duplicado_dni")
    protected WebElementFacade dni_duplicado;

    @AndroidFindBy(id = "txt_total_postulantes_ingresados")
    protected WebElementFacade dniListRegister;

}
