package org.example.forms.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.forms.page.LoginPage;
import org.example.forms.page.UserCreationForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserCreationFormTest {

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


    //создание пользователя (Женский/вариант 1.1/вариант 2.1)
    @Test
    void creatingUserOptionOneOneOptionTwoOneFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна-Людмила", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.1/вариант 2.2)
    @Test
    void creatingUserOptionOneOneOptionTwoTwoFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoTwoElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.1/вариант 2.3)
    @Test
    void creatingUserOptionOneOneOptionTwoThreeFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoThreeElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.2/вариант 2.1)
    @Test
    void creatingUserOptionOneTwoOptionTwoOneFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.2/вариант 2.2)
    @Test
    void creatingUserOptionOneTwoOptionTwoTwoFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoTwoElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.2/вариант 2.3)
    @Test
    void creatingUserOptionOneTwoOptionTwoThreeFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoThreeElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.1 и 1.2/вариант 2.1)
    @Test
    void creatingUserOptionOneOneOneTwoOptionTwoOneFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.1 и 1.2/вариант 2.2)
    @Test
    void creatingUserOptionOneOneOneTwoOptionTwoTwoFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoTwoElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Женский/вариант 1.1 и 1.2/вариант 2.3)
    @Test
    void creatingUserOptionOneOneOneTwoOptionTwoThreeFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoThreeElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }


    //создание пользователя (Мужской/вариант 1.1/вариант 2.1)
    @Test
    void creatingUserOptionOneOneOptionTwoOneMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей-Алексей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.1/вариант 2.2)
    @Test
    void creatingUserOptionOneOneOptionTwoTwoMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoTwoElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.1/вариант 2.3)
    @Test
    void creatingUserOptionOneOneOptionTwoThreeMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoThreeElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.2/вариант 2.1)
    @Test
    void creatingUserOptionOneTwoOptionTwoOneMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.2/вариант 2.2)
    @Test
    void creatingUserOptionOneTwoOptionTwoTwoMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoTwoElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.2/вариант 2.3)
    @Test
    void creatingUserOptionOneTwoOptionTwoThreeMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoThreeElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.1 и 1.2/вариант 2.1)
    @Test
    void creatingUserOptionOneOneOneTwoOptionTwoOneMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.1 и 1.2/вариант 2.2)
    @Test
    void creatingUserOptionOneOneOneTwoOptionTwoTwoMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoTwoElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя (Мужской/вариант 1.1 и 1.2/вариант 2.3)
    @Test
    void creatingUserOptionOneOneOneTwoOptionTwoThreeMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionOneTwoElement();
        userCreationForm.clickOptionTwoThreeElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }
}
