package H_FridayProjects;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FridayProject extends BaseDriver {

//
//    @Test
//    public void Test1(){
//        driver.get("https://demowebshop.tricentis.com/");
//        Actions aksiyonlar = new Actions(driver);
//
//
//
//        WebElement registerLink = driver.findElement(By.linkText("Register"));
//       // registerLink.click();
//        Action aksiyon = aksiyonlar.moveToElement(registerLink).click().build();
//        aksiyon.perform();
//
//        WebElement gender = driver.findElement(By.id("gender-male"));
//       // gender.click();
//        aksiyon = aksiyonlar.moveToElement(gender).click().build();
//        aksiyon.perform();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
//        WebElement firstName = driver.findElement(By.id("FirstName"));
//        //firstName.sendKeys("Group");
//        aksiyon = aksiyonlar.moveToElement(firstName).click().sendKeys("Group").build();
//        aksiyon.perform();
//
//        WebElement lastName = driver.findElement(By.id("LastName"));
//       // lastName.sendKeys("8");
//        aksiyon = aksiyonlar.moveToElement(lastName).click().sendKeys("8").build();
//        aksiyon.perform();
//
//        WebElement email = driver.findElement(By.id("Email"));
//        //email.sendKeys("grupsekiz@gmail.com");
//        aksiyon = aksiyonlar.moveToElement(email).click().sendKeys("grupsekizxxxx@gmail.com").build();
//        aksiyon.perform();
//
//
//        WebElement passWord = driver.findElement(By.id("Password"));
//       // passWord.sendKeys("123123");
//        aksiyon = aksiyonlar.moveToElement(passWord).click().sendKeys("123123").build();
//        aksiyon.perform();
//
//
//        WebElement repassWord = driver.findElement(By.id("ConfirmPassword"));
//    //    repassWord.sendKeys("123123");
//        aksiyon = aksiyonlar.moveToElement(repassWord).click().sendKeys("123123").build();
//        aksiyon.perform();
//
//        WebElement registerButton = driver.findElement(By.id("register-button"));
//        aksiyon = aksiyonlar.moveToElement(registerButton).click().build();
//        aksiyon.perform();
//       // registerButton.click();
//
//        WebElement resultText = driver.findElement(By.cssSelector("div[class='result']"));
//        Assert.assertTrue(resultText.getText().contains("completed"));
//
//
//    }

    @Test
    public void Test2(){

        driver.get("https://demowebshop.tricentis.com/");
//        Actions aksiyonlar = new Actions(driver);
//


        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
//        Action aksiyon = aksiyonlar.moveToElement(registerLink).click().build();
//        aksiyon.perform();

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();
//        aksiyon = aksiyonlar.moveToElement(gender).click().build();
//        aksiyon.perform();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Group");
//        aksiyon = aksiyonlar.moveToElement(firstName).sendKeys("Group").build();
//        aksiyon.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("8");
//        aksiyon = aksiyonlar.moveToElement(lastName).sendKeys("8").build();
//        aksiyon.perform();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("grupsekizxxxx@gmail.com");
//        aksiyon = aksiyonlar.moveToElement(email).sendKeys("grupsekiz@gmail.com").build();
//        aksiyon.perform();


        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("123123");



        WebElement repassWord = driver.findElement(By.id("ConfirmPassword"));
        repassWord.sendKeys("123123");
;

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

        WebElement messageText = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
        Assert.assertTrue(messageText.getText().contains("The specified email already exists"));


    }

    @Test
    public void Test3(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("grupsekizxxx@gmail.com");
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("123123");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginButton.click();

    }

    @Test
    public void Test4(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("grupksekizxxxx@gmail.com");
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("12312");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginButton.click();
        WebElement labelText = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
        Assert.assertTrue(labelText.getText().contains("unsuccessful"));
    }

    @Test
    public void Test5(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("grupsekizxxx@gmail.com");

        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("123123");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginButton.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement productLaptop = driver.findElement(By.linkText("14.1-inch Laptop"));
        productLaptop.click();
        //js.executeScript("arguments[0].scrollIntoView();", productLaptop);

        WebElement addToCard = driver.findElement(By.id("add-to-cart-button-31"));
        addToCard.click();

        WebElement shoppingCard = driver.findElement(By.xpath("(//*[text()='Shopping cart'])[1]"));
        shoppingCard.click();

        WebElement productLabel = driver.findElement(By.linkText("14.1-inch Laptop"));
        Assert.assertTrue("Sepetinizdeki ürün eklediğiniz ürün ile aynı değil",productLabel.isDisplayed());

        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox'][value='2816056']"));
        checkBox.click();

        WebElement aggreeCheckBOx = driver.findElement(By.cssSelector("input[id='termsofservice']"));
        aggreeCheckBOx.click();

        WebElement checkOutButton = driver.findElement(By.id("checkout"));
        checkOutButton.click();


        WebElement countryMenu = driver.findElement(By.cssSelector("select[id='BillingNewAddress_CountryId']"));
        Select dbMenu = new Select(countryMenu);
        dbMenu.selectByValue("77");

//        WebElement newAdress = driver.findElement(By.cssSelector("select[id='billing-address-select']"));
//        Select newAddressMenu = new Select(newAdress);
//        newAddressMenu.selectByVisibleText("New Address");

        WebElement city = driver.findElement(By.cssSelector("input[id='BillingNewAddress_City']"));
        city.sendKeys("Manisa");

        WebElement address1 = driver.findElement(By.cssSelector("input[id='BillingNewAddress_Address1']"));
        address1.sendKeys("sadasdasd");

        WebElement address2 = driver.findElement(By.cssSelector("input[id='BillingNewAddress_Address2']"));
        address2.sendKeys("sadasdaasdaw1312sd");


        WebElement zipCode = driver.findElement(By.cssSelector("input[id='BillingNewAddress_ZipPostalCode']"));
        zipCode.sendKeys("W12B");

        WebElement tel = driver.findElement(By.cssSelector("input[id='BillingNewAddress_PhoneNumber']"));
        tel.sendKeys("123456789");

        WebElement faxNumber = driver.findElement(By.cssSelector("input[id='BillingNewAddress_FaxNumber']"));
        faxNumber.sendKeys("123444");

        WebElement cnt = driver.findElement(By.cssSelector("input[onclick='Billing.save()']"));
        cnt.click();

//        MyFunc.Bekle(2);
//        WebElement cnt2 = driver.findElement(By.cssSelector("input[onclick='Billing.save()']"));
//        cnt2.click();

        WebElement inStorePickup = driver.findElement(By.cssSelector("input[id='PickUpInStore']"));
        inStorePickup.click();

        WebElement cnt2 = driver.findElement(By.cssSelector("input[onclick='Shipping.save()']"));
        cnt2.click();

        WebElement cnt3 = driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()']"));
        cnt3.click();

        WebElement infoSave= driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        infoSave.click();

        WebElement confirmOrder= driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        confirmOrder.click();

        WebElement buySuccess= driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        Assert.assertTrue(buySuccess.getText().contains("successfully"));

        WebElement finish= driver.findElement(By.cssSelector("input[type='button']"));
        finish.click();

    }


}
