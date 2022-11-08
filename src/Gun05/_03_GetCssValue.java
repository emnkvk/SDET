package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");


        WebElement inputValueEnter = driver.findElement(By.id("inputValEnter"));

        //class'ın karşılığı olan css değerlerini almak için getCssValue kullanılır.
        System.out.println("inputValueEnter.getAttribute(\"class\") = " + inputValueEnter.getAttribute("class"));
        System.out.println("inputValueEnter.getCssValue(\"color\") = " + inputValueEnter.getCssValue("color"));
        System.out.println("inputValueEnter.getCssValue(\"font-size\") = " + inputValueEnter.getCssValue("font-size"));
        System.out.println("inputValueEnter.getCssValue(\"textOverFlow\") = " + inputValueEnter.getCssValue("text-overflow"));

        driverWaitAndClose();
    }


}
