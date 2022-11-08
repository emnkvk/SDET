package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_Actions_Drag_nd_Drop extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvec = driver.findElement(By.id("box101"));

        //1.Yöntem
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();


        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement korea = driver.findElement(By.id("box105"));

        aksiyon = aksiyonlar.clickAndHold(seoul).build();
        aksiyon.perform();

        aksiyon = aksiyonlar.moveToElement(korea).release().build();
        aksiyon.perform();




    }
}
