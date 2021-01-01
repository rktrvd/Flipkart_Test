package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Flipkart
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        Robot robot= new Robot();
        robot.keyPress(27);                 //ESC key code =27
        robot.keyRelease(27);

        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Running Shoes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("L0Z3Pu")).click();
        Thread.sleep(2000);

        //Applying Filteres

        robot.mouseWheel(30);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_3LxdjL _3NzWOH']/div[@class='_3FqKqJ']/div[@class='E2-pcE _3zjXRo']/div[@class='E2-pcE _1q8tSL']/div[@class='E2-pcE _1q8tSL col-12-12']/div[@class='_2pi5LC col-12-12']/div[@class='_1KOcBL']/section[5]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]")).click();
        robot.mouseWheel(30);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Brand')]")).click();
        Thread.sleep(2000);
        robot.mouseWheel(10);
        driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_3LxdjL _3NzWOH']/div[@class='_3FqKqJ']/div[@class='E2-pcE _3zjXRo']/div[@class='E2-pcE _1q8tSL']/div[@class='E2-pcE _1q8tSL col-12-12']/div[@class='_2pi5LC col-12-12']/div[@class='_1KOcBL']/section[8]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-id='SHOFS5GQRGPYE2XM']//div[@class='_1xHGtK _373qXS']//a[@class='_2UzuFa']//div//div//div[@class='_3ywSr_']//div[@class='_312yBx SFzpgZ']//img[@class='_2r_T1I']")).click();

        ArrayList<String> tab=new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='ibtBU6 _3t6eWY']//input[@type='text']")).sendKeys("201301");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='UgLoKg']")).click();
        Thread.sleep(2000);
        robot.mouseWheel(15);
        Thread.sleep(2000);
        driver.findElement(By.linkText("8")).click();
        robot.mouseWheel(15);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(4000);

        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(tab.get(0));
        driver.close();




    }
}
