package pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import test.BasePage;

public class CategoryPage extends BasePage {

    @Step("kadin <button> tikla")
    public void categoryPage(String kadinButton){
        appiumDriver.findElement(By.xpath(kadinButton)).click();
        logger.info("Kategori butonuna tiklandi");

    }
    @Step("pantolon <button> tikla")
    public void clickPant(String pantButton){
        appiumDriver.findElement(By.xpath(pantButton)).click();
        logger.info("Pantolon tiklandi");
    }
}
