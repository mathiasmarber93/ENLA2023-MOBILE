package com.enla.pe.steps.login;

import com.enla.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

import static com.enla.pe.utilities.ExplicitWait.Waits.waitElementToBeVisible;

public class LoginStep extends LoginPage {
    @Step("Ingresar contraseña")
    public void typePassword(String password){
        waitElementToBeVisible(getDriver(), txt_password);
        //txt_password.click();
        txt_password.sendKeys(password);
        pressEnter();

    }

    @Step("Presionar ingresar")
    public void pressLogin(){
        btn_login.click();

    }
}
