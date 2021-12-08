package test;

import com.thoughtworks.gauge.Step;
import org.apache.commons.logging.Log;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class BasePage extends BaseTest {



    @Step("<wait> saniye bekle")
    public void waitForsecond(int wait) throws InterruptedException {
        Thread.sleep(1000*wait);
        logger.info(wait + "saniye bekledi !!!!");

    }
    @Step("uygulama kontrolü")
    public void controlPage() {
        Assertions.assertEquals("ALIŞVERİŞE BAŞLA",  appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).getText());
        logger.info("Uygulama acildi");
    }
    @Step("Alisveris <button> tikla")
    public void clickShopButton(String button){
        appiumDriver.findElement(By.id(button)).click();
        logger.info("Alisveris butonuna tiklandi");
    }



}
