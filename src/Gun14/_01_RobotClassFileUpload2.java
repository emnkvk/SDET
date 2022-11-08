package Gun14;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _01_RobotClassFileUpload2 extends BaseDriver {


    @Test
    public void Test1(){

        driver.get("http://demo.guru99.com/test/upload/");

        WebElement inputFile = driver.findElement(By.name("uploadfile_0"));
        inputFile.sendKeys("C:\\Users\\Emin\\Desktop\\Yeni Metin Belgesi.txt");

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submitbutton']"));
        submitButton.click();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textRes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(textRes.getText().contains("has been successfully uploaded."));

        driverWaitAndClose();
    }
}
