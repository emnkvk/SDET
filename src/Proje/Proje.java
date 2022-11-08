package Proje;

import Utility.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import javax.swing.plaf.ProgressBarUI;
import java.awt.*;
import java.util.stream.Stream;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Proje extends BaseDriver  {




    @Test

    public void Test1_HesapOlusturma(){
        driver.get("https://www.akakce.com/");

        WebElement siteImg = driver.findElement(By.linkText("Akakce.com"));

        MyFunc.Bekle(2);
        Assert.assertTrue("Site Açılmadı",siteImg.getText().contains("Akakce.com"));

        WebElement hesapAc = driver.findElement(By.linkText("Hesap Aç"));
        hesapAc.click();

        MyFunc.Bekle(1);
        WebElement ad = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        ad.sendKeys("Metin");


        MyFunc.Bekle(1);
        WebElement soyad = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        soyad.sendKeys("Metin");

        MyFunc.Bekle(1);
        WebElement fEmail = driver.findElement(By.xpath("(//input[@type='email'])[3]"));
        fEmail.sendKeys("abc.emin@gmail.com");

        MyFunc.Bekle(1);
        WebElement rEmail = driver.findElement(By.id("rnufe2"));
        rEmail.sendKeys("abc.emin@gmail.com");

        MyFunc.Bekle(1);
        WebElement passWord = driver.findElement(By.xpath("//label[text()='Ad *']//following::input[5]"));
        passWord.sendKeys("@Ab123456");


        MyFunc.Bekle(1);
        WebElement repassWord = driver.findElement(By.xpath("//label[text()='Ad *']//following::input[6]"));
        repassWord.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement cinsiyet = driver.findElement(By.xpath("//label[text()='Ad *']//following::input[8]"));
        cinsiyet.click();

        MyFunc.Bekle(1);
        WebElement menu = driver.findElement(By.xpath("//span/select[@id='locpr']"));
        Select ilMenu = new Select(menu);
        ilMenu.selectByValue("35");


        MyFunc.Bekle(1);
        WebElement menu2 = driver.findElement(By.xpath("//span/select[@id='locds']"));
       Select ilceMenu = new Select(menu2);
       ilceMenu.selectByValue("476");

       MyFunc.Bekle(1);
       WebElement menu3 = driver.findElement(By.xpath("//select[@id='bd']"));
       Select dGun = new Select(menu3);
       dGun.selectByValue("30");


       MyFunc.Bekle(1);
       WebElement menu4 = driver.findElement(By.id("bm"));
       Select ay = new Select(menu4);
       ay.selectByValue("7");


       MyFunc.Bekle(1);
       WebElement menu5 = driver.findElement(By.id("by"));
       Select year = new Select(menu5);
       year.selectByValue("1993");


       MyFunc.Bekle(1);
       WebElement chck1 = driver.findElement(By.id("rnufpca"));
       chck1.click();

       MyFunc.Bekle(1);
       WebElement chck2 = driver.findElement(By.id("rnufnee"));
       chck2.click();

       MyFunc.Bekle(1);
       WebElement submit = driver.findElement(By.id("rfb"));
       submit.click();


    }

    @Test
    public void Test2_Siparis_ve_Mesaj_Kontrol(){
        girisYap();
        WebElement confirmLogin = driver.findElement(By.linkText("Metin"));
        Assert.assertTrue("Giriş Başarısız",confirmLogin.getText().contains("Metin"));

        MyFunc.Bekle(1);
        WebElement account = driver.findElement(By.linkText("Metin"));
        account.click();

        MyFunc.Bekle(1);
        WebElement siparislerim = driver.findElement(By.xpath("//li[@class='order first']/a[1]"));
        siparislerim.click();


        MyFunc.Bekle(1);
        WebElement kayitliSiparis = driver.findElement(By.cssSelector("div[class='no-record']"));
        Assert.assertTrue("Sipariş Hata",kayitliSiparis.getText().contains("Kayıtlı siparişiniz bulunmuyor."));

        MyFunc.Bekle(1);
        account = driver.findElement(By.linkText("Metin"));
        account.click();

        MyFunc.Bekle(1);
        WebElement mesaj = driver.findElement(By.xpath("//li[@class='order first']/a[2]"));
        mesaj.click();

        MyFunc.Bekle(1);
        WebElement mesajKontrol = driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue("Mesaj Hata",mesajKontrol.getText().contains("bulunamadı"));

        MyFunc.Bekle(1);
      WebElement anaSayfa = driver.findElement(By.xpath("//*[text()='Akakce.com']"));
      anaSayfa.click();


    }
    @Test
    public void Test3_HesapSil(){

        girisYap();

        MyFunc.Bekle(1);
        WebElement account = driver.findElement(By.linkText("Metin"));
        account.click();

        MyFunc.Bekle(1);
        WebElement hesabSil = driver.findElement(By.xpath("//li[@class='user']/a[4]"));
        hesabSil.click();

        MyFunc.Bekle(1);
        WebElement hesabiSilSifre = driver.findElement(By.xpath("//span[@class='tool']/preceding-sibling::span/child::input"));
        hesabiSilSifre.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement button = driver.findElement(By.cssSelector("input[value='Hesabımı sil'][id='u']"));
        button.click();


    }


    public void girisYap(){

        driver.navigate().to("https://www.akakce.com/");


        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();

        MyFunc.Bekle(1);
        WebElement loginEmail = driver.findElement(By.id("life"));
        loginEmail.sendKeys("abc.emin@gmail.com");

        MyFunc.Bekle(1);
        WebElement loginPass = driver.findElement(By.id("lifp"));
        loginPass.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.id("lfb"));
        login.click();


        MyFunc.Bekle(1);
    }


//    public static void printMsgWithProgressBar(String message, int length, long timeInterval) {
//        char incomplete = '░'; // U+2591 Unicode Character
//        char complete = '█'; // U+2588 Unicode Character
//        StringBuilder builder = new StringBuilder();
//        Stream.generate(() -> incomplete).limit(length).forEach(builder::append);
//        System.out.println(message);
//        for (int i = 0; i < length; i++) {
//            builder.replace(i, i + 1, String.valueOf(complete));
//            String progressBar = "\r" + builder;
//            System.out.print(progressBar);
//            try {
//                Thread.sleep(timeInterval);
//            } catch (InterruptedException ignored) {
//
//            }
//        }
//
//    }


}
