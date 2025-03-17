package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver browser;

    public LoginPage(WebDriver browser) {
        this.browser = browser;
    }

    public LoginPage fillUser(String user) {
        browser.findElement(By.cssSelector("label[for='usuario']")).click();
        browser.findElement(By.id("usuario")).sendKeys(user);

        return this;
    }

    public LoginPage fillPassword(String password) {
        browser.findElement(By.cssSelector("label[for='senha']")).click();
        browser.findElement(By.id("senha")).sendKeys(password);

        return this;
    }

    public ProductsListPage submitLoginForm() {
        browser.findElement(By.id("btn-entrar")).click();

        return new ProductsListPage(browser);
    }
}
