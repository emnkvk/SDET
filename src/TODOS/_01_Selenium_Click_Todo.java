package TODOS;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _01_Selenium_Click_Todo extends BaseDriver {

    public static void main(String[] args) throws AWTException {

        driver.get("https://triplebyte.com/");
        MyFunc.Bekle(2);
        Robot rbt = new Robot();
//        rbt.keyPress(KeyEvent.VK_CONTROL);
//        rbt.mouseWheel(500);
//        rbt.keyRelease(KeyEvent.VK_CONTROL);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("(//*[text()='Get a demo'])[5]"));
        WebElement Element2 = driver.findElement(By.cssSelector("div[class='section-pricing wf-section']"));
        //div[class='section-pricing wf-section']

        //Scroll bir elemente kadar o pencere içinde gözükene kadar nasıl kayırıdırım.
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("arguments[0].scrollIntoView();", Element2);
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='section-pricing wf-section']")));

        //rbt.keyPress(KeyEvent.VK_CONTROL);
        //rbt.mouseWheel(-55);
        //rbt.keyRelease(KeyEvent.VK_CONTROL);
        //rbt.mouseWheel(-1);
        MyFunc.Bekle(10);

        js.executeScript("arguments[0].click();", Element);// Elemente tıkla

        // Element.click(); // bu da kullanılabilir.
        // TODO: Bu sayfada bunu yapınca yüklenmediği için direkt click çalışmıyor çözüm bul


    }

}

