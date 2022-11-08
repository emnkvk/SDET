package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_ScreenRecorder extends BaseDriver {

    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        MyFunc.Bekle(2);
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin12");
        WebElement btnLogin=driver.findElement(By.cssSelector("button[type='submit']"));
        btnLogin.click();

        List<WebElement> alertMessage=driver.findElements(By.cssSelector("div[role='alert']"));
//        if ((driver.findElement(By.cssSelector("div[role='alert']"))).isDisplayed()) ==> BUnu kullanırsak hata verir
        if (alertMessage.size()>0){

            System.out.println("Login olamadı. Hata mesajı gözüktü");
            TakesScreenshot ts=(TakesScreenshot) driver;//1.Aşama ekran görüntüsü alma değişkenini tanımladım
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);
            // hafizadakiHali -> dosya olarak(jpg,png,bmp) kaydedeceğiz.
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri/LoginKontrol.png"));

        }

        MyFunc.Bekle(3);
        driverWaitAndClose();
    }
}
