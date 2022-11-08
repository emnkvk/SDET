package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert; //javanın kendi test kontrol ve organize sınıfı


public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

//        WebElement inputV = driver.findElement(By.ByCssSelector.cssSelector("[id='user-message']"));
//        inputV.sendKeys("merhaba Tester dünyası biz geliyoruz.");
//
//        driver.findElement(By.ByCssSelector.cssSelector("[onclick='showInput();']")).click();
//        WebElement displayV = driver.findElement(By.ByCssSelector.cssSelector("#display"));

        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys("merhaba Tester dünyası biz geliyoruz.");

        WebElement btn = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        btn.click();


        WebElement msg = driver.findElement(By.cssSelector("span[id='display']"));

//        if (msg.getText().contains("merhaba Tester dünyası biz geliyoruz."))
//            System.out.println("Test Passed");
//        else
//            System.out.println("Test Failed");

        Assert.assertTrue("İçerik bulunamadı",msg.getText().contains("merhaba Tester dünyası biz geliyoruz."));
        //assertTrue : içindeki değer true mu ? True ise hiç bir şey yapmaz, mesaj vermez
        // false ise beklenen olmamışsa hata mesajı verir
        //yani genel kural : hata var ise göster.

        driverWaitAndClose();

    }
}
