package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart3 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement prompt = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        prompt.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().sendKeys("Emin");

        MyFunc.Bekle(2);
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement TextControl = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("Adınız bulunamadı",TextControl.getText().contains("Emin"));




    }
}
