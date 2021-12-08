package pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import test.BasePage;

import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class ProductPage extends BasePage {

    @Step("Scroll")
    public void scrollDown(){
        new TouchAction(appiumDriver).longPress(PointOption.point(528,1933))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(PointOption.point(505,30)).release().perform();
    }
    @Step("Scroll2")
    public void scrollDown2(){
        new TouchAction(appiumDriver).longPress(PointOption.point(528,1933))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(PointOption.point(505,30)).release().perform();
    }
    @Step("random urun")
    public void randomUrun() throws InterruptedException {
      List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id=\"com.ozdilek.ozdilekteyim:id/imageView\"]\n"));
      Random random = new Random();
      int randomInt = random.nextInt(elements.size());
      elements.get(randomInt).click();
        }
        @Step("urun detay kontrol")
    public void productDetail(){
            System.out.println(appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tvSizeDesc")).getText());
            Assertions.assertEquals("Beden:",  appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tvSizeDesc")).getText());
            logger.info("Urun detay  sayfasi acildi");
        }
        @Step("favoriler <button> tikla")
    public void clickFavori(String button){
        appiumDriver.findElement(By.id(button)).click();
        logger.info("Favori butonuna tiklandi");
            }
        }





