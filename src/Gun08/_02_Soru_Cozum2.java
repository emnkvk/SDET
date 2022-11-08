package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru_Cozum2 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();//girildikten sonra cookiler silindi.

        WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createAccount.click();


        MyFunc.Bekle(1);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Emn");

        MyFunc.Bekle(1);
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("kvk");

        //#fullname_field+div+div    || WebElementi buldu getattribute ile class kontrolü yapıldı
        //Görünmüyor


        WebElement hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
        //System.out.println("hiddenElement = " + hiddenElement.isEnabled());
        Assert.assertTrue("Email girmeden önce gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("emn@gmail.com");

        //Görünüyor
        hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
       // System.out.println("hiddenElement = " + hiddenElement.isEnabled()); //Element Status
        Assert.assertFalse("Email girdikten sonra gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        //driverWaitAndClose();


    }
}