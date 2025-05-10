package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Parser {
    private final Service service;
    private final WebDriver driver;
    private WebElement InputString;


    public Parser() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        InputString = null;
        service = new Service();
    }

    public void search() {
        driver.get("https://health-diet.ru/base_of_food/sostav/79.php");
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(10, ChronoUnit.SECONDS));
        InputString = driver.findElement(By.name("InputString_2"));
        InputString.sendKeys(service.getProduct());
    }

    public void parseNotDinamic(String link) {
        driver.get(link);
        InputString = driver.findElement(By.cssSelector("tr svg[name='calorie']")).findElement(By.xpath("./ancestor::tr"));
         String str = InputString.getText();
         System.out.println(InputString.getText());
         String[] parts = str.split(" ");
         System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
        InputString = driver.findElement(By.cssSelector("tr svg[name='protein']")).findElement(By.xpath("./ancestor::tr"));
         str = InputString.getText();
        System.out.println(InputString.getText());
        parts = str.split(" ");
        System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
        InputString = driver.findElement(By.cssSelector("tr svg[name='fat']")).findElement(By.xpath("./ancestor::tr"));
        str = InputString.getText();
        System.out.println(InputString.getText());
        parts = str.split(" ");
        System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
        InputString = driver.findElement(By.cssSelector("tr svg[name='carb']")).findElement(By.xpath("./ancestor::tr"));
        str = InputString.getText();
        System.out.println(InputString.getText());
        parts = str.split(" ");
        System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
        InputString = driver.findElement(By.cssSelector("tr svg[name='fiber']")).findElement(By.xpath("./ancestor::tr"));
        str = InputString.getText();
        System.out.println(InputString.getText());
        parts = str.split(" ");
        System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
        InputString = driver.findElement(By.cssSelector("tr svg[name='water']")).findElement(By.xpath("./ancestor::tr"));
        str = InputString.getText();
        System.out.println(InputString.getText());
        parts = str.split(" ");
        System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
    }
}
