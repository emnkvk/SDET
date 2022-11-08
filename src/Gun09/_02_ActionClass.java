package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _02_ActionClass extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");


        WebElement element = driver.findElement(By.xpath("//*[text()='Click Me']"));

        Actions actions = new Actions(driver);//Aksiyonlar sınıfı

        Action action = actions.moveToElement(element).click().build();//Elementin üzerine gelindi// .
                                                                //Elementin tıklama aksiyonu oluşturuldu.


        System.out.println("Action Prepared.");

        MyFunc.Bekle(1);
        action.perform();//Aksiyonu gerçekleştir.

        //actions.moveToElement(element).click().build().perform();// kısa olan yöntem
        System.out.println("Action is Done");


    }
}
