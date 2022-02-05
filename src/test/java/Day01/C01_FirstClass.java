package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\Batch44_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // biz driver objesi olusturdugumuzda bos bir chrome browser acilir

        driver.get("https://www.ebay.com");
        // driver.get method'u driver'a gidecegi web adresini girmemizi saglar

        Thread.sleep(3000);
        driver.close();
        // driver'i kapatir
    }
}