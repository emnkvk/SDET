package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart2 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);

        driver.switchTo().alert().dismiss();
        WebElement dismissTextControl = driver.findElement(By.id("confirm-demo"));
        Assert.assertTrue("Cancel Yazısı bulunamadı",dismissTextControl.getText().contains("You pressed Cancel!"));
        //Assert ile 'You pressed Cancel!' yazısını kontrol ettik


    }


}
