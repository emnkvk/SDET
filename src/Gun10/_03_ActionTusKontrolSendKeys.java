package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){



        driver.get("https://demoqa.com/auto-complete");
        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build();

        MyFunc.Bekle(2);
        aksiyon.perform();




    }
}
