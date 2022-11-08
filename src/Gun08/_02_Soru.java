package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1(){

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


        //
        //Görünmediğinin kontrol edileceği yer
        //1.Yöntem
        List<WebElement> secondEmail = driver.findElements(By.cssSelector("[id='reg_form_box']>[class='hidden_elem']"));
        Assert.assertTrue("2.Email su an gözüküyor mu?",(secondEmail.size()==1));

        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("emn@gmail.com");

        secondEmail = driver.findElements(By.cssSelector("[id='reg_form_box']>[class='hidden_elem']"));
        Assert.assertTrue("2.Email suan gözüküyor mu ?",(secondEmail.size()==0));



        MyFunc.Bekle(1);
//        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//        email.sendKeys("emn@gmail.com");
        //Göründüğünün kontrol edileceği yer




        MyFunc.Bekle(1);
        WebElement reEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        reEmail.sendKeys("emn@gmail.com");


        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("123456");



        MyFunc.Bekle(1);
        WebElement day = driver.findElement(By.cssSelector("select[id='day']"));
        Select dbMenu = new Select(day);
        dbMenu.selectByVisibleText("30");



        MyFunc.Bekle(1);
        WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
        Select monthdb = new Select(month);
        monthdb.selectByVisibleText("Şub");



        MyFunc.Bekle(1);
        WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
        Select yeardb = new Select(year);
        yeardb.selectByVisibleText("1993");

        MyFunc.Bekle(1);
//        WebElement gender = driver.findElement(By.xpath("//*[text()='Erkek']"));
//        gender.click();

        WebElement gender= driver.findElement(By.cssSelector("input[value='2'][name='sex']"));
                gender.click();


        //[id='reg_form_box']>[class='hidden_elem']  || direkt element class özelliği ile arandı
        //#fullname_field+div+div    || WebElementi buldu getattribute ile class kontrolü yapıldı


//        MyFunc.Bekle(1);
//        WebElement submitClick = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//        submitClick.click();





    }

}
