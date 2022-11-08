package HomeWorks._01_Css_Selector_homeWorks;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Question extends BaseDriver {

    @Test
    public void Test2(){

        driver.get("https://demo.applitools.com/");

        MyFunc.Bekle(2);
        WebElement userName = driver.findElement(By.cssSelector("[class='form-group']>input[type='text']"));
        userName.sendKeys("ttechno@gmail.com");


        MyFunc.Bekle(2);
        WebElement passWord = driver.findElement(By.cssSelector("div[class='form-group']>input[type='password']"));
        passWord.sendKeys("techno123.");

        MyFunc.Bekle(2);
        WebElement signButton = driver.findElement(By.cssSelector("div[class='buttons-w']>a"));
        signButton.click();

        MyFunc.Bekle(2);
        WebElement header = driver.findElement(By.cssSelector("div[class='element-wrapper compact pt-4']>:nth-child(2)"));
        //header.getText();

        Assert.assertTrue("Doğrulanamadı",header.getText().contains("Your nearest branch closes in: 30m 5s"));



    }
}
