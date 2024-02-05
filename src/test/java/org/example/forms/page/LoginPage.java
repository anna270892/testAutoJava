package org.example.forms.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    private WebElement email;
    private WebElement password;
    private WebElement authButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementsSearch();
    }


    private void elementsSearch() {
        email = driver.findElement(By.id("loginEmail")); //поле email
        password = driver.findElement(By.id("loginPassword")); //поле пароль
        authButton = driver.findElement(By.id("authButton")); //кнопка "Вход"
    }


    public void login(String userEmail, String userPassword) {
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        authButton.click();
    }

}
