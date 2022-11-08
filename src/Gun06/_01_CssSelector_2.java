package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

//        WebElement inputV = driver.findElement(By.ByCssSelector.cssSelector("[id='user-message']"));
//        inputV.sendKeys("merhaba Tester dünyası biz geliyoruz.");
//
//        driver.findElement(By.ByCssSelector.cssSelector("[onclick='showInput();']")).click();
//        WebElement displayV = driver.findElement(By.ByCssSelector.cssSelector("#display"));


        String myMessage ="merhaba Tester dünyası biz geliyoruz.";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(myMessage);

        WebElement btn = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        btn.click();


        WebElement msg = driver.findElement(By.cssSelector("span[id='display']"));

//        if (msg.getText().contains("merhaba Tester dünyası biz geliyoruz."))
//            System.out.println("Test Passed");
//        else
//            System.out.println("Test Failed");

        Assert.assertTrue("İçerik bulunamadı",msg.getText().contains(myMessage));
        //assertTrue : içindeki değer true mu ? True ise hiç bir şey yapmaz, mesaj vermez
        // false ise beklenen olmamışsa hata mesajı verir
        //yani genel kural : hata var ise göster.

        driverWaitAndClose();


    }
}
