package _02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  Get to the website
        driver.get("http://a.testaddressbook.com/sign_in");
        // Locate the email textbox
        WebElement emailTextBox= driver.findElement(By.cssSelector("#session_email"));
        //  Locate password textbox
        WebElement passwordTextBox= driver.findElement(By.cssSelector("#session_password"));
        //  Locate the sign in button
        WebElement signInButton= driver.findElement(By.cssSelector("input[value='Sign in']"));
        //  Enter username and password
        emailTextBox.sendKeys("username");
        passwordTextBox.sendKeys("password");
        signInButton.click();
        driver.close();
    }
}
