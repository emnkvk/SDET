package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_Drag_and_Drop_By extends BaseDriver {



    @Test
    public void Test1(){

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu = driver.findElement(By.cssSelector("div[id='slider-range']>:nth-child(2)"));
        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDropBy(solSurgu,500,0).build();
        aksiyon.perform();





    }

}
