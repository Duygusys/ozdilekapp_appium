package pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.BasePage;

public class ShoppingPage extends BasePage {

    @Step("Alisveris sayfasi kontrol")
    public void controllPage() {
        System.out.println(appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/edtSearch")).getText());
        Assertions.assertEquals("Ara",  appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/edtSearch")).getText());
        logger.info("Alisveris butonuna tiklandi");
    }
    @Step("<button> butonuna tikla")
    public void clickCategory(String categoryButton){
        appiumDriver.findElement(By.id(categoryButton)).click();
        logger.info("Kategori butonuna tiklandi");
    }
}
