package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    public void fieldsTest() {
        open("https://yandex.ru");
        $(".serp-header__main .input__box").setValue("Selenide").pressEnter();
        $("li.serp-item div a.link").shouldHave(text("Selenide"));
    }
}
