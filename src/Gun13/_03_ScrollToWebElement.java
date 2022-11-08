package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ScrollToWebElement extends BaseDriver {

   @Test
    public void Test1(){
       //1.Yöntem
//       driver.get("https://triplebyte.com/");
//       MyFunc.Wait(2);
//
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//
//       WebElement element = driver.findElement(By.xpath("(//*[text()='Get a demo'])[5]"));
//
//       js.executeScript("arguments[0].scrollIntoView(true);", element);
//       js.executeScript("window.scrollBy(0,-500)");

       driver.get("https://triplebyte.com/");
       MyFunc.Bekle(2);

       JavascriptExecutor js = (JavascriptExecutor) driver;

       WebElement Element = driver.findElement(By.xpath("(//*[text()='Get a demo'])[5]"));

       //Scroll bir elemente kadar o pencere içinde gözükene kadar nasıl kayırıdırım.
       js.executeScript("arguments[0].scrollIntoView();", Element);

       MyFunc.Bekle(2);
      js.executeScript("arguments[0].click();", Element);// Elemente tıkla

       // Element.click(); // bu da kullanılabilir.
       // TODO: Bu sayfada bunu yapınca yüklenmediği için direkt click çalışmıyor çözüm bul


   }


}
