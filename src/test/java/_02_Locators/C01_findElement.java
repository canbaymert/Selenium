package _02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_findElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        /*
        HTML code:

        <input type="text" id="twotabsearchtextbox" value=""
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
         */

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        // WebElement searchBox= driver.findElement(By.className("nav-search-field ")); (Alternative-1)
        // WebElement searchBox= driver.findElement(By.name("field-keywords")); (Alternative-2)
        searchBox.sendKeys("Piano" + Keys.ENTER);


        WebElement signInLink= driver.findElement(By.linkText("Sign in"));
        signInLink.click();
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.name("session[password]"));
        WebElement signInButton= driver.findElement(By.name("commit"));
        emailTextBox.sendKeys("username@example.com");
        passwordTextBox.sendKeys("user1234!");
        signInButton.click();
        WebElement usernameElement=driver.findElement(By.className("navbar-text"));
        System.out.println(usernameElement.getText()); // To get element as string


        // Attributes of an element
        System.out.println(emailTextBox.getTagName());
        System.out.println(emailTextBox.getAttribute("name"));
        System.out.println(emailTextBox.getLocation());
        System.out.println(emailTextBox.getSize().height);






    }
}
