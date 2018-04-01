package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSelenium {

    public WebDriver driver = WebDriverSingleton.getInstance();


    @Before
    public void login() {
        driver.get("http://testing.cld.iba.by/");
        WebElement login = driver.findElement(By.id("_58_login")) ;
        WebElement password = driver.findElement(By.id("_58_password"));
        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));
        login.sendKeys("kabanov@tc.by");
        password.sendKeys("welcome");
        button.click();
        WebElement userName = driver.findElement(By.xpath("//div[@class = 'float-box']//div//h3"));
        Assert.assertEquals("Александр Евгеньевич Кабанов", userName.getText());

    }

    @Test
    public void Run () {
        driver.get("http://testing.cld.iba.by/");
        WebElement icon = driver.findElement(By.id("navigationIcon3"));
        icon.click();
        WebElement button2 = driver.findElement(By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/createApplication']"));
        button2.click();


    }
}
