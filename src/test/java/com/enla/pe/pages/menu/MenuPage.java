package com.enla.pe.pages.menu;

import com.enla.pe.base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPage extends ScreenBase {

    @AndroidFindBy(accessibility = "Open navigation drawer")
    protected WebElementFacade menuIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]")
    protected WebElementFacade reporteMenu;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]")
    protected WebElementFacade listReport;

}
