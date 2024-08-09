package HW16selenide;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DemoqaTest {

    private ButtonsPage buttonsPage;
    private WebTablesPage webTablesPage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.timeout = 10000;
        buttonsPage = new ButtonsPage();
        webTablesPage = new WebTablesPage();
    }



    @Test(priority = 0)

    public void testClickButton() {
      buttonsPage.OpenPage();
        buttonsPage.ClickButton().click();
        Assert.assertEquals(buttonsPage.DynamicClickMessage().text(), "You have done a dynamic click");
    }

    @Test(priority = 1)

    public void testDoubleClickButton() {
  buttonsPage.OpenPage();
        buttonsPage.DoubleClickButton().doubleClick();
        Assert.assertEquals(buttonsPage.DoubleClickMessage().text(), "You have done a double click");
    }

    @Test(priority = 2)

    public void testAddAndEditRecord() {
        webTablesPage.OpenPage();

        webTablesPage.AddButton().click();
        webTablesPage.FirstNameField().setValue("Cansu");
        webTablesPage.LastNameField().setValue("Dereli");
        webTablesPage.AgeField().setValue("10");
        webTablesPage.EmailField().setValue("cansu@gmail.com");
        webTablesPage.SalaryField().setValue("10000");
        webTablesPage.DepartmentField().setValue("Test");
        webTablesPage.SubmitButton().click();

        webTablesPage.AddButton().scrollTo();
        webTablesPage.EditButton("Cansu").click();
        webTablesPage.SalaryField().clear();
        webTablesPage.SalaryField().setValue("20000");
        webTablesPage.SubmitButton().click();

        Assert.assertEquals(webTablesPage.SalaryCell("Cansu").getText(), "20000");

    }
}



