package com.w2a.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.w2a.base.Page;

public class AllProductsPage extends Page {
	public void tryCRM() {
		driver.findElement(By.xpath("//span[@class='pd-dp']")).click();
		driver.findElement(By.cssSelector("a.learnMorebtn.arrow-icon.white")).click();
		driver.findElement(By.xpath("//li[@class=\"zh-crm zapp-show\"]/a")).click();
	}
	
	public void footer() {
			
		List<WebElement> footerElements = driver.findElements(By.xpath("//div[@class=\"product-links three-column\"]/div/div/ul/li"));
		assert footerElements.size() == 33;
		
	}
}
