package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Senaryo extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.saucedemo.com/");


        MyFunc.Bekle(1);
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");



        MyFunc.Bekle(1);
        WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");


        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

       // driver.get("https://www.saucedemo.com/inventory.html");
        MyFunc.Bekle(1);
        WebElement productClick = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        productClick.click();

        MyFunc.Bekle(1);
        WebElement addToCard = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCard.click();

//        MyFunc.Bekle(2);
//        WebElement removeToCart = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
//        removeToCart.click();

        MyFunc.Bekle(1);
        WebElement backToproduct = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToproduct.click();

        MyFunc.Bekle(1);
        WebElement clckToTshirt = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        clckToTshirt.click();


        MyFunc.Bekle(1);
        WebElement addToTshirt = driver.findElement(By.xpath("//*[text()='Add to cart']"));
        addToTshirt.click();

        MyFunc.Bekle(1);
        WebElement shopingCart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        shopingCart.click();

        MyFunc.Bekle(1);
        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();

        //driver.get("https://www.saucedemo.com/checkout-step-one.html");

        MyFunc.Bekle(1);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Emin");

        MyFunc.Bekle(1);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Kavak");

        MyFunc.Bekle(1);
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("123456");

        MyFunc.Bekle(1);
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();


        double total = 0;
        List<WebElement> inventoryPriceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement priceList : inventoryPriceList) {
//            System.out.println(priceList.getText());
            total += Double.parseDouble(priceList.getText().replace("$",""));

        }



//
//        MyFunc.Bekle(2);
//        WebElement inventoryItem = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
//       double productPrice1 = Double.parseDouble(inventoryItem.getText().replace("$",""));
//
//        MyFunc.Bekle(2);
//        WebElement inventoryItem2 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
//        double productPrice2 = Double.parseDouble(inventoryItem2.getText().replace("$",""));




        MyFunc.Bekle(1);
        WebElement subTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
       // System.out.println(subTotal.getText().replace("Item total: $",""));

        double subTotalResult=Double.parseDouble(subTotal.getText().replace("Item total: $",""));
//        double totalSub = productPrice1+productPrice2;
//        System.out.println(totalSub);

//        if (totalSub==subTotalResult)
//        {
//            System.out.println("Fiyatlar eşit.");
//        }
//        else {
//            System.out.println("Test Geçmedi");
//        }
        Assert.assertTrue("Fiyatlar eşit değil",total==subTotalResult);




        //driverWaitAndClose();



    }


}
