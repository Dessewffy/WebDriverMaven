package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;

public class HomePage extends Page {
	
	
	public void goToSignUp() {
		driver.findElement(By.xpath( "//a[@class=\"signUp\"]")).click();
	}
	public void goToLogin() {
		driver.findElement(By.xpath( "//a[@class=\"login\"]")).click();
	}
	
}
