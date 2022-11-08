package HomeWorks._03_7Kasım2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

//2-
//        Senaryo
//        1- https://www.youtube.com/ adresine gidiniz
//        2- "Selenium" kelimesi ile video aratınız.
//        3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//        4- Son videonun title ını yazdırınız.


public class _02_Q2 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.youtube.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
        search.click();
        search.sendKeys("Selenium");
        MyFunc.Bekle(2);

        WebElement searchButton = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
        searchButton.click();
        MyFunc.Bekle(3);


        List<WebElement> pageScroll = driver.findElements(By.cssSelector("a[class='yt-simple-endpoint style-scope ytd-video-renderer']"));


            for (WebElement pageLast : pageScroll) {
                if (pageScroll.size()<80){
                System.out.println("pageLast.getText() = " + pageLast.getText());
                MyFunc.Bekle(1);
                js.executeScript("arguments[0].scrollIntoView();", pageLast);
//                MyFunc.Bekle(2);

                }
            }





    }
}
