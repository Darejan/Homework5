import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class Homework5Daji {
    @Test
    public void test3(){
        Selenide.open("https://ee.ge");
        Configuration.browserSize = "1920x1080";
        $(".btn-cart").click();
        sleep(1000);
        Assert.assertTrue($(byText("კალათა ცარიელია")).isDisplayed());
        $("#search_list").click();
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(".add_to_cart",0).click();
        $(".btn-cart").click();
        Assert.assertTrue($(byText("კალათა ცარიელია")).is(Condition.not(Condition.visible)));
        $(byText("წაშლა")).click();
        sleep(1000);
        Assert.assertTrue($(byText("კალათა ცარიელია")).is(Condition.visible));
        sleep(3000);
    }

    @Test
    public void test4(){
        Selenide.open("https://ee.ge");
        Configuration.browserSize = "1920x1080";
        $(".btn-cart").click();
        sleep(1000);
        Assert.assertTrue($(byText("კალათა ცარიელია")).isDisplayed());
        $(byText("შენახული ნივთები")).click();
        sleep(1000);
        Assert.assertTrue($(".h1_css").isDisplayed());
        sleep(1000);
        $("#search_list").click();
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(".add_to_cart",0).click();
        $(".btn-cart").click();
        sleep(1000);
        $(byText("შენახვა")).click();
        sleep(1000);
        $(byText("შენახული ნივთები")).click();
        sleep(1000);
        Assert.assertTrue($(".h1_css").is(Condition.not(Condition.exist)));
        sleep(1000);
        $(".btn-cart").click();
        Assert.assertTrue($(byText("კალათა ცარიელია")).is(Condition.not(Condition.visible)));
        sleep(1000);
        $(byText("შენახული ნივთები")).click();
        sleep(1000);
        $(".fa-times").click();
        sleep(1000);
        Assert.assertTrue($(".h1_css").isDisplayed());
        sleep(1000);
    }


}
