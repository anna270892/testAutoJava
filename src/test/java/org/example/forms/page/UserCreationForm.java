package org.example.forms.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserCreationForm {

    WebDriver driver;

    private WebElement email;
    private WebElement name;
    private WebElement floor;
    private WebElement optionOneOne;
    private WebElement optionOneTwo;
    private WebElement optionTwoOne;
    private WebElement optionTwoTwo;
    private WebElement optionTwoThree;
    private WebElement addButton;


    public UserCreationForm(WebDriver driver) {
        this.driver = driver;
        elementsSearch();
    }

    private void elementsSearch() {
        email = driver.findElement(By.id("dataEmail")); //поле "email"
        name = driver.findElement(By.id("dataName")); //поле "Имя"
        floor = driver.findElement(By.id("dataGender")); //кнопка "Пол"

        optionOneOne = driver.findElement(By.id("dataCheck11")); //чекбокс "Вариант 1.1"
        optionOneTwo = driver.findElement(By.id("dataCheck12")); //чекбокс "Вариант 1.2"

        optionTwoOne = driver.findElement(By.id("dataSelect21")); //радиокнопка "Вариант 2.1"
        optionTwoTwo = driver.findElement(By.id("dataSelect22")); //радиокнопка "Вариант 2.2"
        optionTwoThree = driver.findElement(By.id("dataSelect23")); //радиокнопка "Вариант 2.3"

        addButton = driver.findElement(By.id("dataSend")); //кнопка "Добавить"
    }


    public void addUser(String userEmail, String userName, String userFloor) {
        email.sendKeys(userEmail);
        name.sendKeys(userName);
        selectFloorOption(userFloor); //передаем пол

    }


    //метод для выпадающего списка "Пол"
    private void selectFloorOption(String option) {
        floor.click();
        Select select = new Select(floor);
        if (option.equalsIgnoreCase("Мужской")) {
            select.selectByVisibleText("Мужской");
        } else if (option.equalsIgnoreCase("Женский")) {
            select.selectByVisibleText("Женский");
        }
    }


    //чекбокс "Вариант 1.1"
    public void clickOptionOneOneElement() {
        optionOneOne.click();
    }

    //чекбокс "Вариант 1.2"
    public void clickOptionOneTwoElement() {
        optionOneTwo.click();
    }


    //радиокнопка "Вариант 2.1"
    public void clickOptionTwoOneElement() {
        optionTwoOne.click();
    }

    //радиокнопка "Вариант 2.2"
    public void clickOptionTwoTwoElement() {
        optionTwoTwo.click();
    }

    //радиокнопка "Вариант 2.3"
    public void clickOptionTwoThreeElement() {
        optionTwoThree.click();
    }

    public void clickAddButton() {
        addButton.click();
    }


    //метод ожидания элемента
    public static String waitForElementAndGetText(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }
}