package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementStatus extends BaseDriver{

    public static void main(String[] args) {

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        MyFunc.Bekle(1);
        tuesday.click();
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());


        WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        saturday.click();
        System.out.println(saturday.isDisplayed());
    }

}
