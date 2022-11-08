package HomeWorks._01_Css_Selector_homeWorks;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Question extends BaseDriver {

    @Test

    public void Test5(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(2);
        WebElement fakeAlerts = driver.findElement(By.cssSelector("[class='page-body']>ul>:nth-child(5)>ul>:nth-child(2)>a"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement showAlertBox = driver.findElement(By.cssSelector("input[onclick='show_alert()']"));
        showAlertBox.click();

        MyFunc.Bekle(2);
        WebElement okAlert = driver.findElement(By.cssSelector("[class='dialog-actions']>:first-child"));
        okAlert.click();

        driverWaitAndClose();


    }

}
