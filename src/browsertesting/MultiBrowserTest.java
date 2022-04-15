package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "edge";
    static  String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("edge")){
           System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
           driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome,driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/msedgedriver.exe");
            driver = new FirefoxDriver();

        }else{
            System.out.println("Wrong browser name ! ");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("Amita123");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("amita1213");
        driver.close();
    }
}
