package com.enla.pe.pages.login;

import com.enla.pe.base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends ScreenBase {

    @AndroidFindBy(id = "com.gob.inei.AsistenciaENLA2B:id/login_edtClave")
    protected WebElementFacade txt_password;

    @AndroidFindBy(id = "com.gob.inei.AsistenciaENLA2B:id/login_btnIngresar")
    protected WebElementFacade btn_login;

}
