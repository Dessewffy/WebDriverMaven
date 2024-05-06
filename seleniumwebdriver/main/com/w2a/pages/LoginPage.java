package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;

public class LoginPage extends Page{
	
	
	public void doLogin(String username, String password) {
		
		driver.findElement(By.id("login_id")).sendKeys(username);
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("nextbtn")).click();
	}
	
}
