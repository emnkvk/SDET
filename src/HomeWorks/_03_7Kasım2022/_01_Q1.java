package HomeWorks._03_7Kasım2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class _01_Q1 extends BaseDriver {

//    Senaryo
//1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//            2- random 100 e kadar 2 sayı üretiniz.
//            3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//4- Sonuçları Assert ile kontrol ediniz.
//5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.


    @Test
    public void Test1() throws AWTException {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        MyFunc.Bekle(2);
        Robot rbt = new Robot();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int sayi1 = (int) (Math.random()*100);
        int sayi2 = (int) (Math.random()*100);
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        WebElement Element1 = driver.findElement(By.id("calcForm"));

        js.executeScript("arguments[0].scrollIntoView();",Element1);

        WebElement firstInput = driver.findElement(By.id("number1Field"));
        WebElement secondInput = driver.findElement(By.id("number2Field"));
        String strsayi1 = String.valueOf(sayi1);
        String strsayi2 = String.valueOf(sayi2);
        firstInput.sendKeys(strsayi1);
        secondInput.sendKeys(strsayi2);

        WebElement calculateSubmit = driver.findElement(By.id("calculateButton"));

        WebElement menuCalc = driver.findElement(By.id("selectOperationDropdown"));
        Select dbMenu = new Select(menuCalc);

        for (int i=0; i<5;i++) {
            dbMenu.selectByValue("0");
            calculateSubmit.click();

            MyFunc.Bekle(2);
            dbMenu.selectByValue("1");
            calculateSubmit.click();

            MyFunc.Bekle(2);
            dbMenu.selectByValue("2");
            calculateSubmit.click();

            MyFunc.Bekle(2);
            dbMenu.selectByValue("3");
            calculateSubmit.click();

            MyFunc.Bekle(2);
            dbMenu.selectByValue("4");
            calculateSubmit.click();

            MyFunc.Bekle(3);
        }


    }

}
