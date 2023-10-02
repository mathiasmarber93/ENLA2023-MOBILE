package com.enla.pe.definitions.menu;

import com.enla.pe.steps.menu.MenuStep;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MenuDef {

    @Steps(shared = true)
    MenuStep menu;

    @When("navega al modulo de reportes")
    public void userNavigateMenu(){
        menu.navigateMenu();
    }

}
