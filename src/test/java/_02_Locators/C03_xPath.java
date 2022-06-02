package _02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Get to the given site
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // Click the Add Element button
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //Click the Delete button
        WebElement deleteButton= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            Thread.sleep(3000);
            deleteButton.click();
        }
        // Ensure that “Add/Remove Elements” is displayed
        WebElement addRemoveElement= driver.findElement(By.xpath("//h3"));
        if (addRemoveElement.isDisplayed()){
            Thread.sleep(3000);
            System.out.println("TEST PASSED");
            driver.close();
        } else {
            System.out.println("TEST FAILED");
            driver.close();
        }
    }
}

