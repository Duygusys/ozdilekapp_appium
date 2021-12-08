package pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import test.BasePage;

import java.util.List;
import java.util.Random;

public class RandomProduct extends BasePage {
    @Step("random panrolon secimi")
    public void selectRandom(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id=\"com.ozdilek.ozdilekteyim:id/imageView\"]\n"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
    }
    @Step("<button> beden secim")
    public void clickSize(String button){
        appiumDriver.findElement(By.xpath(button)).click();
        logger.info("36 beden secildi");
    }
    @Step("<button> sepete ekle tikla")
    public void clickBasket(String button){
        appiumDriver.findElement(By.id(button)).click();
        logger.info("Sepete ekle butonuna tiklandi");
    }
}
