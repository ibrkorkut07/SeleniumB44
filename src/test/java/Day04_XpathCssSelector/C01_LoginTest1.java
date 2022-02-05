package Day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_LoginTest1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\Batch44_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://a.testaddressbook.com");
        WebElement advancedLink = driver.findElement(By.id("details-button"));
        advancedLink.click();
        WebElement proceedLink = driver.findElement(By.id("proceed-link"));
        proceedLink.click();

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.name("commit"));
        Thread.sleep(3000);

        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(3000);
        signInButton.click();

        WebElement welcomeNoticeElement = driver.findElement(By.tagName("h1"));
        System.out.println(welcomeNoticeElement.getText());
        String actualWelcomeNotice = welcomeNoticeElement.getText();
        String expectedWelcomeElement = "Welcome to Address Book";
        if (actualWelcomeNotice.equals(expectedWelcomeElement)) {
            System.out.println("Log-in attempt has passed");
        } else {
            System.out.println("Log-in attempt has failed");
        }
        WebElement addressWebElement = driver.findElement(By.linkText("Addresses"));
        WebElement signoutWebElement = driver.findElement(By.linkText("Sign out"));

        if (addressWebElement.isDisplayed()) {
            System.out.println("Address element display test has passed");
        } else {
            System.out.println("Address element display test has failed");
        }
        if (signoutWebElement.isDisplayed()) {
            System.out.println("Signout element display test has passed");
        } else {
            System.out.println("Signout element display test has failed");
        }
        List<WebElement> linkLists = driver.findElements(By.tagName("a"));
        System.out.println("There are " + linkLists.size() + " links on this page");

        driver.close();
    }
}
