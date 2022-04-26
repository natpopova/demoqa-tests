package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTest {

    @BeforeAll
    static void beforall() {
        Configuration.baseUrl= "https://demoqa.com";
    }

    @Test
    void successFillInForm() {
        open("/text-box");
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue("Nat");
        $("#userEmail").setValue("nat@company.com");
        $("#currentAddress").setValue("address 1");
        $("#permanentAddress").setValue("address 2");
        $("#submit").click();
        $("#output").shouldHave(text("Nat"), text("nat@company.com"), text("address 1"), text("address 2"));
        $("output #currentaddress").shouldHave(text("address 1"));
     }
}
