package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductPageForm {
    private WebDriver browser;

    public AddProductPageForm(WebDriver browser) {
        this.browser = browser;
    }

    public AddProductPageForm fillProductName(String productName) {
        browser.findElement(By.id("produtonome")).sendKeys(productName);

        return this;
    }

    public AddProductPageForm fillProductPrice(String productPrice) {
        browser.findElement(By.id("produtovalor")).sendKeys(productPrice);

        return this;
    }

    public AddProductPageForm fillProductColor(String productColor) {
        browser.findElement(By.id("produtocores")).sendKeys(productColor);

        return this;
    }

    public ProductsListPage submitAddFormWithError() {
        browser.findElement(By.cssSelector("button[type='submit']")).click();

        return new ProductsListPage(browser);
    }
    public editProductFormPage submitAddFormWithSuccess() {
        browser.findElement(By.cssSelector("button[type='submit']")).click();

        return new editProductFormPage(browser);
    }
}
