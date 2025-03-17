package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsListPage {
    private WebDriver browser;

    public ProductsListPage(WebDriver browser) {
        this.browser = browser;
    }

    public AddProductPageForm accessNewProductForm () {
        browser.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        return new AddProductPageForm(browser);
    }

    public String getToastMessage() {
        return browser.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
