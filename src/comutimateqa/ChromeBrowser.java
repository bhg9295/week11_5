package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(" Page title " + title);
        //Get the Print Url
        System.out.println("Current url " + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page Sourse" + driver.getPageSource());
        //Enter the Email Filed
        WebElement username = driver.findElement(By.name("user[email]"));
        // get the email filed
        username.sendKeys("bhg123@gmail.com");
//get the password into password filed
        driver.findElement(By.name("user[password]")).sendKeys(" Bhg123");
        //close the  Browser
        driver.close();
    }
}
