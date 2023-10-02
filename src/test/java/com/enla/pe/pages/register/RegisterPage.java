package com.enla.pe.pages.register;

import com.enla.pe.base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RegisterPage extends ScreenBase {

    @AndroidFindBy(id = "sp_seleccionar_turno")
    protected WebElementFacade turno;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    protected WebElementFacade turnoOption;

    @AndroidFindBy(id = "edt_dni")
    protected WebElementFacade txt_dni;
}

