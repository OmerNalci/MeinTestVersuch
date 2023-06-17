package stepdefs;

import org.openqa.selenium.By;

public class Locators {

    String url = "https://opencart.abstracta.us/";
    String eMail = "deneme@deneme.com";
    String password = "deneme";

    By lMyAccountLink = By.xpath("//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'My Account')]");
    By lLoginLink = By.xpath("//a[contains(.,'Login')]");
    By lFormEmail = By.id("input-email");
    By lFormPassword = By.id("input-password");
    By lLoginButton = By.xpath("//input[contains(@type,'submit')]");
    By lLogoutButton = By.xpath("(//a[contains(.,'Logout')])[1]");

}
