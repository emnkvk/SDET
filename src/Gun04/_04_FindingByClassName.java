package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
      
           WebElement submitButton = driver.findElement(By.className("jf-form-buttons"));//class adı ile element alındı.
           System.out.println("className.getText() = " + submitButton.getText());
           //submitButton.click();

           WebElement footerButton = driver.findElement(By.className("formFooter-button"));
           footerButton.click(); //tıklama işlemi yapıyor..


        //Eğer birden fazla locator varsa findElement ne yapar
        //cevap : ilk elementi bulur.
            WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

        //Bu locator'a ait bütün elemanları alma..

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println("labels.size() = " + labels.size());

        for (WebElement label : labels) {
            System.out.println("label.getText() = " + label.getText());
            
        }
        //findElement ile aranan elaman bulunumazsa No Such Element hatası verir
        //findElements ile bulunamazsa size 0 verilir.

        
        
        
        
        
        
        MyFunc.Bekle(8);
        driver.quit();

    }
}
