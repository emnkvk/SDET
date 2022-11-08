package Gun13;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotClassEntry extends BaseDriver {

    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

        MyFunc.Bekle(1);


        Robot rbt = new Robot();
        /* Accept All için*/
//        for(int i=0;i<6;i++) {
//            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
//            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
//            MyFunc.Bekle(1);
//        }
//        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down
//        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

        for(int i=0;i<21;i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
       // MyFunc.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

//        for(int i=0;i<4;i++) {
//            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
//            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
//        MyFunc.Bekle(1); //Windows kapata ulaştık
//        }
//
//        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down
//        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up


        //Bilgisayarımızdaki dosyanın (dosya yolu)path 'ini dosya adının olduğu yere yapıştırmamız gerekiyor
        //bunun için önce dosyanın yolunu(path)ini hafızaya kopyalayıp
        //sonra ctrl + v ile açılan windows popup ın
        //dosya adı bölümüne yapıştırmamız gerekiyor.

        StringSelection stringSelection = new StringSelection("C:\\Users\\Emin\\Desktop\\Yeni Metin Belgesi.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);  // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);


        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submitbutton']"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textRes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(textRes.getText().contains("has been successfully uploaded."));


        driverWaitAndClose();

    }

}
