package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement linkTest = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("linkTest = " + linkTest.getText());
        System.out.println("linkTest.getAttribute(href) = " + linkTest.getAttribute("href"));
        System.out.println("linkTest.getAttribute(\"title\") = " + linkTest.getAttribute("title"));
        System.out.println("linkTest.getAttribute(\"rel\") = " + linkTest.getAttribute("rel"));


        
        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));//Link görünen textin bir kısmı ile bulma
        //sade a tagleri için özel Locator bulma yöntemi
        System.out.println("link2.getText() = " + link2.getText());



        MyFunc.Bekle(5);
        driver.quit();
    }
}
