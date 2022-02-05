package Day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\Batch44_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(100, 100));
        driver.manage().window().setSize(new Dimension(1100, 900));
        Thread.sleep(5000);
        int xPosition = driver.manage().window().getPosition().getX();
        int yPosition = driver.manage().window().getPosition().getY();
        int expectedXPosition = 100;
        int expectedYPosition = 100;
        if (xPosition==expectedXPosition && yPosition==expectedYPosition) {
            System.out.println("right window position");
        } else {
            System.out.println("wrong window position");
        }
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        int expectedwidth = 1100;
        int expectedheight = 900;
        if (width==expectedwidth && height==expectedheight) {
            System.out.println("right window size");
        } else {
            System.out.println("wrong window size");
        }
        driver.close();
    }
}
