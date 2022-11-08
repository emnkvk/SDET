package Gun13;



// sayfanın sonuna gitmek için : window.scrollBy(0,document.body.scrollHeight)
                                    //window.scrollTo(0,document.body.scrollHeight)
//Elemente kadar kaydırmak içim : js.executeScript("arguments[0].scrollIntoView();", Element);


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scrollintro extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://triplebyte.com/");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;//Polymorphism kılık değişti dönüştürüldü.
        js.executeScript("window.scrollBy(0,3500);");
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-3500);");

        //scrollTo : verilen  piksel kadar gider
        //scrollBy : verilen kadar daha ileri gider




    }
}
