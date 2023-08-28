import com.codeborne.selenide.AuthenticationType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @BeforeAll
    static void openResource() {
        open("https://dev.feature.lunaro.ru/",
                AuthenticationType.BASIC, "cubelabuser","cube123!");
    }

    @Test
    void buttLick() {

        $(By.className("header__inner")).$("button").shouldBe(visible).click();
        $(By.className("modal")).shouldBe(visible);
        $(By.id("1")).val("9218927035");
        $x("//span[contains(text(),'Получить код в СМС')]").shouldBe(visible).click();
        $x("//input[@class='code-fragment'][1]").val("1");
        $x("//input[@class='code-fragment'][2]").val("2");
        $x("//input[@class='code-fragment'][3]").val("3");
        $x("//input[@class='code-fragment'][4]").val("4");



//        $(By.className("code-fragment__container")).$$/(By.className("code-fragment")).val("1234").shouldBe(visible);
//        for(int i = 0; i < 5; i++) {
//            $$(By.className("code-fragment")).iterator().forEachRemaining();
//            $(By.className("code-fragment")).val("1");
//        }
        /*$(By.className("code-fragment__container")).$(By.className("code-fragment")).val("2").shouldBe(visible);
        $(By.className("code-fragment__container")).$(By.className("code-fragment")).val("3").shouldBe(visible);
        $(By.className("code-fragment__container")).$(By.className("code-fragment")).val("4").shouldBe(visible);
        */
//        $$(By.className("code-fragment")).;
    }


}
