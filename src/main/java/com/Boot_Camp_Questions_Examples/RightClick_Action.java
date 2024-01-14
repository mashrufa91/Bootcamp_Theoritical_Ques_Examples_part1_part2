package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Action {
	
	 public static void main(String[] args) {
	 
			   
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("http://tutorialsninja.com/demo");

	        Actions actions = new Actions(driver);

	        WebElement rightClickElement = driver.findElement(By.linkText("Tablets"));

	        actions.contextClick(rightClickElement).build().perform();
	        driver.quit();
	    }

}
