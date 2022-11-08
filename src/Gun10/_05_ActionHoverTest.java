package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _05_ActionHoverTest extends BaseDriver {

//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.
    @Test
    public void Test1(){

        driver.get("https://www.etsy.com/");


        //Eğer cookie kontrol etmek amaçlı.
//        List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
//        if (cookiesAccept.size()>0)
//            cookiesAccept.get(0).click();


        WebElement jewellery = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement neckless = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibNeckless = driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(jewellery).build();
        aksiyon.perform();

        MyFunc.Bekle(2);
        aksiyon = aksiyonlar.moveToElement(neckless).build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        aksiyon = aksiyonlar.moveToElement(bibNeckless).build();
        aksiyon.perform();

        MyFunc.Bekle(2);
        bibNeckless.click();

        MyFunc.Bekle(2);
        Assert.assertTrue("Url de bib kolye var mı ?",driver.getCurrentUrl().contains("bib"));//Tıklanan url içerisinde bib geçiyor mu kontrol ediyoruz.

    }
}
