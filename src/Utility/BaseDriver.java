package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static   WebDriver driver;
    public static WebDriverWait wait;
    public static DateTimeFormatter dtf;
    LocalDateTime now;

    static {// sadece ilk bölümü diğer sayfalarda çalıştırmak istiyorsan method yazmana gerek yok

       //ilk adımda çalışan kodlar
       ClosetoPreviousPage();

       Logger logger = Logger.getLogger("");//bütün loglara ulaştım.
       logger.setLevel(Level.SEVERE);//sadece errorları göster.

       System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");//Infoları gizle


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();//Ekranı max yapıyor.
       driver.manage().deleteAllCookies();//sitenin bilgisayarımda yaptığı ayarları siliyor.


       Duration dr = Duration.ofSeconds(30);
       driver.manage().timeouts().pageLoadTimeout(dr);// sadece tüm sayfanın kodlarının bilgigysarımıza inmesi süresiyle ilgili
       //bu eklenmezse selenium sayfa yüklenene kadar bekler(sonsuza kadar)
       //30 saniye de yükleyebilirsen yükle yükleyemezsen hata ver. bu kod bu işe yarıyor.

       driver.manage().timeouts().implicitlyWait(dr);//Bütün web elementleriin element bazında elemente özel işlem yapılmadan önce
       //hazır hale gelmesine verilen mühlet yani süre

       wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       dtf= DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
       LocalDateTime now = LocalDateTime.now();

    }

    public static void ClosetoPreviousPage(){
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }

    public static void driverWaitAndClose(){

        MyFunc.Bekle(3);
        driver.quit();
        System.out.println("Test Completed.");

    }
}
