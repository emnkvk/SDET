package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSwitch extends BaseDriver {


    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId = driver.getWindowHandle();//Bulunduğum sayfanın windowun Idsinin aldım
        System.out.println("anaSayfaWindowId = " + anaSayfaWindowId);

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement link: linkler)
            if (!link.getAttribute("href").contains("mailto"))
                link.click();

        // driver.getWindowHandle() -> aktif olan tab (window) un id sinin verir
        Set<String> windowIdler=driver.getWindowHandles(); // açık olan tüm sayfaların win id leri

        for(String id : windowIdler)
        {
            driver.switchTo().window(id); // diğer tab a (windowa) geçiş yaptık
            System.out.println(id+ " -Title ="+driver.getTitle()+" - URL: "+driver.getCurrentUrl());
        }

        // TODO:
        //burada önce ana sayfaya geçelim.
        driver.switchTo().window(anaSayfaWindowId);



        //sonra ana sayfa harci diğerlerini kapatalım.

        for(String id : windowIdler)
        {
            if (id.equals(anaSayfaWindowId)){
                continue;//sadece bu adımı pas geçti,kendinden sonra gelenleri çalıştırmadı.
            }

            driver.switchTo().window(id); // diğer tab a (windowa) geçiş yaptık
            driver.close();//Sadece Bulunduğum windowu kapatır.
            //System.out.println(id+ " -Title ="+driver.getTitle()+" - URL: "+driver.getCurrentUrl());
        }



        MyFunc.Bekle(5);
        driverWaitAndClose();



    }
}
