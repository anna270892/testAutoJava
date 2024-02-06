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


    //создание пользователя без указания выборов (Женский)
    @Test
    void creatingUserNoElectionsFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна-Людмила", "Женский");
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя с указанием одного выбора 1.1 (Женский)
    @Test
    void creatingUserOneChoiceOneOneFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна-Людмила", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя с указанием одного выбора 2.1 (Женский)
    @Test
    void creatingUserOneChoiceTwoOneFemale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "Анна-Людмила", "Женский");
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
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


    //создание пользователя без указания выборов (Мужской)
    @Test
    void creatingUserNoElectionsMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей-Алексей", "Мужской");
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя с указанием одного выбора 1.1 (Мужской)
    @Test
    void creatingUserOneChoiceOneOneMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей-Алексей", "Мужской");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.className("uk-margin"));
        Assertions.assertEquals("Данные добавлены.", text.trim());
    }

    //создание пользователя с указанием одного выбора 2.1 (Мужской)
    @Test
    void creatingUserOneChoiceTwoOneMale() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergin@protei.ru", "Андрей-Алексей", "Мужской");
        userCreationForm.clickOptionTwoOneElement();
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

    //пустое поле "email"
    @Test
    void creatingUserEmptyEmailFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("", "Анна-Людмила", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без "@"
    @Test
    void creatingUserEmailFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akocherginaprotei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без доменной части
    @Test
    void creatingUserEmailWithoutDomainPartFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без имени пользователя
    @Test
    void creatingUserEmailNoUsernameFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("@protei.ru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email без точки (БАГ)
    @Test
    void creatingUserEmailNoPointFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@proteiru", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email рус.буквы
    @Test
    void creatingUserEmailRussianLettersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("анна.протей.ру", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email цифры
    @Test
    void creatingUserEmailNumbersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("0000000000000000000000000000", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //email спецсимволы
    @Test
    void creatingUserEmailSpecialCharactersFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("$##$%^((#$##$%^((#", "Анна", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("emailFormatError"));
        Assertions.assertEquals("Неверный формат E-Mail", text.trim());
    }

    //пустое поле "Имя"
    @Test
    void creatingUserEmptyNameFailed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginValid();
        UserCreationForm userCreationForm = new UserCreationForm(driver);
        userCreationForm.addUser("akochergina@protei.ru", "", "Женский");
        userCreationForm.clickOptionOneOneElement();
        userCreationForm.clickOptionTwoOneElement();
        userCreationForm.clickAddButton();
        String text = UserCreationForm.waitForElementAndGetText(driver, By.id("blankNameError"));
        Assertions.assertEquals("Поле имя не может быть пустым", text.trim());
    }
}
