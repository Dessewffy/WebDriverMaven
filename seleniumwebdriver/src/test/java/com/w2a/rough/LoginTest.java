package com.w2a.rough;



import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		
		
		HomePage homePage = new HomePage();
		homePage.goToLogin();
		
		LoginPage loginPage = new LoginPage();
		loginPage.doLogin("zaramoth@gmail.com", "Lipthay1793");
		

}

}
