package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");



        //name yazan yere Emin gönder
        WebElement name = driver.findElement(By.id("first_8")); //elemanı bulma
        name.sendKeys("Emin"); //elemana yazı gönderme





        WebElement lastName = driver.findElement(By.id("last_8"));
        lastName.sendKeys("KAVAK");


        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        MyFunc.Bekle(6);
        driver.quit();

    }
}
