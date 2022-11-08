package HomeWorks._01_Css_Selector_homeWorks;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Question extends BaseDriver {

    @Test

    public void Test4(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(2);
        WebElement findCalculate = driver.findElement(By.cssSelector("[href='/calculate.php']"));
        findCalculate.click();

        MyFunc.Bekle(2);
        WebElement firstInput = driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(1)"));
        firstInput.sendKeys("3");

        MyFunc.Bekle(2);
        WebElement secondInput = driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(3)"));
        secondInput.sendKeys("2");

        MyFunc.Bekle(2);
        WebElement clickToCalculate = driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(4)"));
        clickToCalculate.click();

        WebElement getResult = driver.findElement(By.cssSelector("body>span"));
        System.out.println("getResult = " + getResult.getText());

        driverWaitAndClose();


    }
}
