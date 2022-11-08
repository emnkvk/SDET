package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectClass_Giris extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr");

        WebElement cookies = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        cookies.click();

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));
        Select dbMenu = new Select(webMenu);
        dbMenu.selectByVisibleText("Kitaplar");
        MyFunc.Bekle(1);

        WebElement srcButton = driver.findElement(By.id("nav-search-submit-button"));
        srcButton.click();


        WebElement element = driver.findElement(By.xpath("//h1[text()='Kitap']"));

        Assert.assertTrue(element.getText().contains("Kitap"));





    }

}
