package HW16selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTablesPage {
    public void OpenPage() {
        open("https://demoqa.com/webtables");
    }

    public SelenideElement AddButton() {
        return $("#addNewRecordButton").scrollTo();
    }

    public SelenideElement FirstNameField() {
        return $("#firstName");
    }

    public SelenideElement LastNameField() {
        return $("#lastName");
    }

    public SelenideElement EmailField() {
        return $("#userEmail");
    }

    public SelenideElement AgeField() {
        return $("#age");
    }

    public SelenideElement SalaryField() {
        return $("#salary");
    }

    public SelenideElement DepartmentField() {
        return $("#department");
    }

    public SelenideElement SubmitButton() {
        return $("#submit");
    }

    public SelenideElement EditButton(String firstName) {
        return $(By.xpath("//div[contains(text(), '" + firstName + "')]//..//div[@class='action-buttons']//span[contains(@title, 'Edit')]"));
    }

    public SelenideElement SalaryCell(String firstName) {
        return $(By.xpath("//div[contains(text(), '" + firstName + "')]//following-sibling::div[4]"));
    }
}