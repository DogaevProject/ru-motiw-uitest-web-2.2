package ru.motiw.web.elements.elementsweb.DocflowAdministration.DocumentRegistrationCards;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Форма редактирования РКД - МАРШРУТНЫЕ СХЕМЫ
 */
public class FormDocRegisterCardsEditConnectedRoutesElements {


    @FindBy(xpath = "//div[contains(@id,'checkbox')]//input[not(ancestor::fieldset)]/..")
    private SelenideElement useAllPossibleRoutes;

    @FindBy(xpath = "(//div[contains(@id,'tabbar')]/following-sibling::*)[1]//a[3]//span")
    private SelenideElement connectedRoutesTab;


    /**
     * Вкладка - Маршруты согласования
     */
    public SelenideElement getConnectedRoutesTab() {
        return connectedRoutesTab;
    }

    /**
     * Использовать все возможные маршруты
     */
    public SelenideElement getUseAllPossibleRoutes() {
        return useAllPossibleRoutes;
    }

}
