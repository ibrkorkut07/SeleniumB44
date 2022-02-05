import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\Batch44_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement sailor = driver.findElement(By.id("pid11_thumb"));
        WebElement boston = driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement bayArea = driver.findElement(By.xpath("//img[@src='bots/sl-bay-area-bot.png']"));
        WebElement nYc = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));

        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).toLeftOf(bayArea));
        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).toLeftOf(bayArea));
    }
}
