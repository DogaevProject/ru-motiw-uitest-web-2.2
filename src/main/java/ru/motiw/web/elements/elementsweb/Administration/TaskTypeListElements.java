package ru.motiw.web.elements.elementsweb.Administration;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Элементы грида - Типов объектов
 * Общая форма гридов (Администрирование / Справочники, Типы таблиц, Типы задач и пр..)
 */
public class TaskTypeListElements {

    @FindBy(xpath = "//input")
    private SelenideElement nameObject;

    @FindBy(xpath = "//div[count(a)=4]/a[2]//span[position()=2]")
    private SelenideElement confirmationButtonObjectDeletion;

    @FindBy(xpath = "//div[count(a)=4]/a[3]//span[position()=2]")
    private SelenideElement cancelButtonObjectDeletion;

    @FindBy(xpath = "(//a[contains(@id,'button')]//span[contains(@style,'image:url')])[1]")
    private SelenideElement addTypesObject;

    @FindBy(xpath = "(//a[contains(@id,'button')]//span[contains(@style,'image:url')])[2]")
    private SelenideElement editTypesObject;

    @FindBy(xpath = "(//a[contains(@id,'button')]//span[contains(@style,'image:url')])[3]")
    private SelenideElement removeTypesObject;

    @FindBy(xpath = "//*[contains (@class, 'message-box')]//a[1]")
    private SelenideElement OkAddObject;


    /**
     * ОК - Подтверждение добавления объекта
     */
    public SelenideElement getOkAddObject() {
        return OkAddObject;
    }

    /**
     * Поле ввода Названия объекта
     */
    public SelenideElement getNameObject() {
        return nameObject;
    }

    /**
     * Кнопка - Да, в диалоговом окне при удалении объекта
     */
    public SelenideElement getConfirmationButtonObjectDeletion() {
        return confirmationButtonObjectDeletion;
    }

    /**
     * Кнопка - Нет, в диалоговом окне при удалении объекта
     */
    public SelenideElement getCancelButtonObjectDeletion() {
        return cancelButtonObjectDeletion;
    }

    /**
     * Добавить объект (кнопка "Добавить" в гриде)
     */
    public SelenideElement getAddTypesObject() {
        return addTypesObject;
    }

    /**
     * Редактировать объект (кнопка "Редактировать" в гриде)
     */
    public SelenideElement getEditTypesObject() {
        return editTypesObject;
    }

    /**
     * Удалить объект (кнопка "Удалить" в гриде)
     */
    public SelenideElement getRemoveTypesObject() {
        return removeTypesObject;
    }
}

