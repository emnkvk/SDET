package HomeWorks._01_Css_Selector_homeWorks;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Question extends BaseDriver {

    @Test

    public void Test3(){


        driver.get("https://www.snapdeal.com/");

        WebElement cookies = driver.findElement(By.cssSelector("button[id='pushDenied']"));
        cookies.click();

        MyFunc.Bekle(2);
        WebElement writeonSearch = driver.findElement(By.cssSelector("div[class='overlap']+input"));
        writeonSearch.click();

        MyFunc.Bekle(2);
        WebElement writeTeddy = driver.findElement(By.cssSelector("div[class='overlap']+input"));
        writeTeddy.sendKeys("teddy bear");

        MyFunc.Bekle(2);
        WebElement clickToSearch = driver.findElement(By.cssSelector("div[class='col-xs-14 search-box-wrapper']>button"));
        clickToSearch.click();

        WebElement textControl = driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div>span"));
        System.out.println(textControl.getText());

        Assert.assertTrue("Search Message not Matched",textControl.getText().contains("We've got 242 results for teddy bear"));
    }
}
