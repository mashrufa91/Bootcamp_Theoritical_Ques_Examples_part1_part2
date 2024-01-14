package com.Boot_Camp_Questions_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		List <WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println("Total number of links on the page are"+" "+links.size());
		
		driver.quit();
	}
}
