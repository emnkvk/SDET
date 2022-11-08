package Gun06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Senaryo extends BaseDriver {

    @Test
    public void Test1() throws InterruptedException {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Thread.sleep(2000);


        //driver.findElement(By.cssSelector("[id='section_1'] > fieldset >legend + label > span")).click();
        WebElement business = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();


        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("[id='section_1'] >:nth-child(5) >:nth-child(4)")).click();
        WebElement dropDownDiscover = driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();


        Thread.sleep(2000);
        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();;


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='section_1'] > fieldset > label > input[value = \"Every Day\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='section_1'] >fieldset >label >input[value = \"Good\"]")).click();


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[id='section_1'] >:nth-child(9)")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[id='section_1'] >:nth-child(9)>:nth-child(4)")).click();










        driverWaitAndClose();

    }

}
