package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionDouble_Click extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(doubleClick).doubleClick().build();
        aksiyon.perform();


        driverWaitAndClose();

    }
}
