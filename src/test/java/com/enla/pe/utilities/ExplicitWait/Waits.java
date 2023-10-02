package com.enla.pe.utilities.ExplicitWait;

import com.enla.pe.base.ScreenBase;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Waits extends ScreenBase {

    public static void waitElementToBeVisible(WebDriver driver, WebElementFacade element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementToBeClickable(WebDriver driver, WebElementFacade element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
