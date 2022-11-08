package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru_Cozum3 extends BaseDriver {
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

        WebElement reEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        Assert.assertFalse(reEmail.isDisplayed());


        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));


        reEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        Assert.assertTrue(reEmail.isDisplayed());


    }
}
