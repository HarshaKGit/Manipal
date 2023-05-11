package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class launchchrome  extends ParallelHelperClass{


    @Test
    public void login() {


        getDriver().findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");

        getDriver().findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");

        getDriver().findElement(By.xpath("//button[@type= 'submit']")).click();

    }


}
