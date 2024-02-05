package org.example.forms.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.forms.page.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthorizationFormTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String htmlFilePath = "file:///C:/Users/akoch/Desktop/qa-test.html";
        driver.get(htmlFilePath);
    }


    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    //успешная авторизация
    @Test
    void validAuthorization() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@protei.ru", "test");
        Assertions.assertTrue(driver.findElement(By.id("inputsPage")).isDisplayed());
    }

    //авторизация не зарегестрированным пользователем
    @Test
    void invalidUserFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testAnna@protei.ru", "testAnna");
        String text = driver.findElement(By.id("invalidEmailPassword")).getText();
        Assertions.assertEquals("Неверный E-Mail или пароль", text.trim());
    }

    //пустая форма
    @Test
    void emptyFormFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //пустое поле email
    @Test
    void emptyEmailFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без знака @
    @Test
    void emailFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testprotei.ru", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без доменной части
    @Test
    void emailWithoutDomainPartFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testprotei", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без имени пользователя
    @Test
    void emailNoUsernameFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(".ru", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без точки (БАГ)
    @Test
    void emailNoPointFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@proteiru", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email рус.буквы
    @Test
    void emailRussianLettersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("АннаТестер", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email цифры
    @Test
    void emailNumbersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("00000000000000000000000000000000000000000000", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email спецсимволы
    @Test
    void emailSpecialCharactersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("$##$%^((#", "test");
        String text = driver.findElement(By.id("emailFormatError")).getText();
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //пустое поле пароль
    @Test
    void emptyPasswordFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@protei.ru", "");
        String text = driver.findElement(By.id("invalidEmailPassword")).getText();
        Assertions.assertEquals("Неверный E-Mail или пароль", text.trim());
    }

    //пароль рус.буквы
    @Test
    void passwordRussianLettersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@protei.ru", "АннаТестер");
        String text = driver.findElement(By.id("invalidEmailPassword")).getText();
        Assertions.assertEquals("Неверный E-Mail или пароль", text.trim());
    }

    //пароль цифры
    @Test
    void passwordNumbersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@protei.ru", "00000000000000000000000000000000000000000000");
        String text = driver.findElement(By.id("invalidEmailPassword")).getText();
        Assertions.assertEquals("Неверный E-Mail или пароль", text.trim());
    }

    //пароль спецсимволы
    @Test
    void passwordSpecialCharactersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@protei.ru", "$##$%^((#");
        String text = driver.findElement(By.id("invalidEmailPassword")).getText();
        Assertions.assertEquals("Неверный E-Mail или пароль", text.trim());
    }
}
