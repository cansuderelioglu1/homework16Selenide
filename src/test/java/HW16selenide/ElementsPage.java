package HW16selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ElementsPage {

    public void OpenPage() {
        open("https://demoqa.com/elements");
        getWebDriver().manage().window().maximize();


    }

    public SelenideElement Buttons(){
        return  $(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[5]")).scrollTo();
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



