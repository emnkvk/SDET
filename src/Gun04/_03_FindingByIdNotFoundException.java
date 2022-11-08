package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

//        WebElement element = driver.findElement(By.id("last_8"));
//        element.sendKeys("KAVAK");
        try {
            WebElement elementLabel = driver.findElement(By.id("sublabel_8_last"));
            System.out.println("elementLabel.getText() = " + elementLabel.getText());

        }
        catch (Exception ex){
            System.out.println("Eleman Bulunamadı = " + ex.getMessage());
        }

        MyFunc.Bekle(5);
        driver.quit();
    }
}
