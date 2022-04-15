package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

       WebElement userNameField = driver.findElement(By.id("username"));
       userNameField.sendKeys("Durga456@gmail.com");

       WebElement passwordField = driver.findElement(By.name("password"));
       passwordField.sendKeys("durgha123");

       driver.close();
    }
}
