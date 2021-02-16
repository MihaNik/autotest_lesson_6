package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchSelenide {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchSelenideInGoogle(){
        open("https://www.google.ru/");
        $("input[name='q']").val("selenide").pressEnter();
        $("div.g a").shouldHave(attribute("href", "https://ru.selenide.org/"));
        System.out.println("test end");
    }
}
