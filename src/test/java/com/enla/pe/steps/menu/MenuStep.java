package com.enla.pe.steps.menu;

import com.enla.pe.pages.menu.MenuPage;
import net.thucydides.core.annotations.Step;

import static com.enla.pe.utilities.ExplicitWait.Waits.waitElementToBeVisible;

public class MenuStep extends MenuPage {

    @Step("Navegar por el menu")
    public void navigateMenu(){
        waitElementToBeVisible(getDriver(), menuIcon);
        menuIcon.click();
        waitElementToBeVisible(getDriver(), reporteMenu);
        reporteMenu.click();
        waitElementToBeVisible(getDriver(), listReport);
        listReport.click();
    }

}
