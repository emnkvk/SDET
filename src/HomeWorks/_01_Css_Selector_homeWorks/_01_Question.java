package HomeWorks._01_Css_Selector_homeWorks;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Question extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demoqa.com/text-box");

        MyFunc.Bekle(2);
        WebElement fullName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        MyFunc.Bekle(2);
        WebElement email = driver.findElement(By.cssSelector("div[id='userEmail-wrapper']>:nth-child(2)>input"));
        email.sendKeys("Testing@gmail.com");

        MyFunc.Bekle(2);
        WebElement currentAddress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        currentAddress.sendKeys("Testing Current Address");

        MyFunc.Bekle(2);
        WebElement permanentAddress = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']>:nth-child(2)>textarea"));
        permanentAddress.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(2);
        WebElement submitButton = driver.findElement(By.cssSelector(".text-right.col-md-2.col-sm-12>button"));
        submitButton.click();


        MyFunc.Bekle(2);
        WebElement outPutName = driver.findElement(By.cssSelector("div[id='output']>div>p:nth-of-type(1)"));
        String nameout=outPutName.getText().replace("Name:","");

        MyFunc.Bekle(2);
        WebElement outPutemail = driver.findElement(By.cssSelector("div[id='output']>div>p:nth-of-type(2)"));
        String emailOutPut = outPutemail.getText().replace("Email:","");

//        System.out.println(fullName.getText());

        String myMessage = "Content is not matched";
        Assert.assertTrue(myMessage,nameout.contains("Automation"));

        Assert.assertTrue(myMessage,emailOutPut.contains("Testing"));






    }

}
