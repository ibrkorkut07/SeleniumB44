package Day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\Batch44_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));

        driver.get("https://www.amazon.com/");
        WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.sendKeys("city bike"); // sendKeys("city bike" + Keys.Enter);
        searchButton.submit();

        //  List<WebElement> numberofBikesElement = driver.findElements(By.className("sg-col-inner"));
        WebElement numberofBikesElement = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(numberofBikesElement.getText());

        driver.findElement(By.className("s-image")).click();


    }
}
