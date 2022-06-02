package _01_driverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_driverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // waits for the page load if necessary
        driver.get("https://www.amazon.com");
        System.out.println("actual title : " + driver.getTitle());
        System.out.println("actual url : " + driver.getCurrentUrl());
        String pageSource= driver.getPageSource(); // System.out.println(pageSource) -> gives the page source
        System.out.println(driver.getWindowHandle()); // gives hashCode of the window


        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back(); // go back to amazon
        Thread.sleep(2000);
        driver.navigate().forward(); // go to facebook
        Thread.sleep(2000);
        driver.navigate().refresh(); // refresh the page
        Thread.sleep(2000);

        System.out.println("Window size : " + driver.manage().window().getSize());
        System.out.println("Window Position : " + driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(30,40));
        driver.manage().window().setSize(new Dimension(900,600));
        driver.manage().window().maximize(); // fullscreen
        driver.close();
    }


}
