package pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.BasePage;

import java.sql.Driver;

public class LoginPage extends BasePage {

    @Step("login sayfa kontrol")
    public void loginControl(){
        System.out.println(appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etEposta")).getText());
        Assertions.assertEquals("E - posta Adresi",  appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etEposta")).getText());
        logger.info("Login sayfasi acildi");

    }
    @Step("kullanici adi input")
    public void userNameText(){
        MobileElement element =  appiumDriver.findElement(By.id("etEposta"));
        element.sendKeys("duygusys@icloud.com");

    }
    @Step("password input")
    public void passwordText(){
        MobileElement element =  appiumDriver.findElement(By.id("etPassword"));
        element.sendKeys("duygu123");
    }
    @Step("back <button>")
    public void clickBack(String button){
        appiumDriver.findElement(By.id(button)).click();
        logger.info("Geri butonuna tiklandi");
    }
    @Step("back2 <button>")
    public void clickBack2(String button){
        appiumDriver.findElement(By.id(button)).click();
        logger.info("Geri butonuna ikinci defa tiklandi");
    }
}
