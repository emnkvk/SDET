package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_Action_RightClick extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement contextClick = driver.findElement(By.id("rightClickBtn"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(contextClick).contextClick().build();
        aksiyon.perform();

        //aksiyonlar.moveToElement(contextClick).contextClick().build().perform();

        //new Actions(driver).contextClick(contextClick).build().perform();
    }
}
