package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElementLog extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://www.hepsiburada.com/");


        List<WebElement> linkler = driver.findElements(By.tagName("a"));//tag ine göre bulma
        //bu bana sayfadaki tüm linkleri verir
        
        for (WebElement e : linkler){
            if (e.getText().equals("")) {   //Text olmayan linkleri bulmak
                System.out.println("linkTest.getAttribute(href) = " + e.getAttribute("href"));
                System.out.println("linkTest.getAttribute(\"title\") = " + e.getAttribute("title"));
                System.out.println("e.getAttribute(\"rel\") = " + e.getAttribute("rel"));
            }


        }

        driverWaitAndClose();

    }
}
