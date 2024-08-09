package HW16selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.SelenideElement;

public class ButtonsPage {

    public void OpenPage() {
        open("https://demoqa.com/buttons");
        getWebDriver().manage().window().maximize();

    }

    public SelenideElement ClickButton(){
        return  $(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).scrollTo();
    }

    public SelenideElement DoubleClickButton(){
        return $("#doubleClickBtn").scrollTo();
    }

    public SelenideElement DynamicClickMessage() {
        return $("#dynamicClickMessage").scrollTo();
    }

    public SelenideElement DoubleClickMessage(){
        return $("#doubleClickMessage").scrollTo();

    }
}



