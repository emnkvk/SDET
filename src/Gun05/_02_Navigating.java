package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");//web sayfası açma komutu
        //Sayfanın yüklenmesi için get tam yüklenmeyi bekle bunun için süre sınırı konuldu
        //navigate.to() yüklenmesini beklemez.
        MyFunc.Bekle(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));

        element.click();


        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum url'yi veriyor

        MyFunc.Bekle(3); //tarayıcı historysinden geri geldim
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum url'yi veriyor
        MyFunc.Bekle(3);
        driver.navigate().forward();//tarayıcı historysinden ileri gittim
        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum url'yi veriyor











        driverWaitAndClose();
    }

}
