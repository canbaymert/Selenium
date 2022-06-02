package _02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        // amazon sayfasinda katane link bulundugunu yazdiralim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        List<WebElement> listofLinks= driver.findElements(By.tagName("a"));
        System.out.println("Number of links on the page : " + listofLinks.size());
        WebElement firstLink=listofLinks.get(0);
        firstLink.click();
        driver.close();
    }
}
