package modulos.produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;

@DisplayName("Testes Web do Modulo de Produtos")
public class ProdutosTest {

    private WebDriver browser;

    @BeforeEach
    public void beforeEach(){
        // Open browser
        this.browser = new ChromeDriver();
        this.browser.manage().window().maximize();
        this.browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate to Lojinha Web page
        this.browser.get("http://165.227.93.41/lojinha-web/v2/");
    }

    @Test
    @DisplayName("Should not allow to register a product with a value equal to zero")
    public void testNotAllowRegisterProductEqualToZero() {

        String toastMessage = new LoginPage(browser)
                .fillUser("admin")
                .fillPassword("admin")
                .submitLoginForm()
                .accessNewProductForm()
                .fillProductName("Macbook Pro")
                .fillProductPrice("000")
                .fillProductColor("Preto,Branco")
                .submitAddFormWithError()
                .getToastMessage();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", toastMessage);
    }

    @Test
    @DisplayName("Should not allow to register a product greater than 7000")
    public void testNotAllowRegisterProductGreaterThanSevenThousand() {

        String toastMessage = new LoginPage(browser)
                .fillUser("admin")
                .fillPassword("admin")
                .submitLoginForm()
                .accessNewProductForm()
                .fillProductName("Macbook Air")
                .fillProductPrice("700001")
                .fillProductColor("Gray")
                .submitAddFormWithError()
                .getToastMessage();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", toastMessage);

    }

    @Test
    @DisplayName("Should allow to register 0,01 products price")
    public void testAllowRegisterObeCentsProducts() {
        String toastMessage = new LoginPage(browser)
                .fillUser("admin")
                .fillPassword("admin")
                .submitLoginForm()
                .accessNewProductForm()
                .fillProductName("Macbook Pro")
                .fillProductPrice("001")
                .fillProductColor("Preto")
                .submitAddFormWithSuccess()
                .getToastMessage();

        Assertions.assertEquals("Produto adicionado com sucesso", toastMessage);
    }

    @Test
    @DisplayName("Should allow to register 7.000,00 products price")
    public void testAllowRegisterSevenThounsandPrice() {
        String toastMessage = new LoginPage(browser)
                .fillUser("admin")
                .fillPassword("admin")
                .submitLoginForm()
                .accessNewProductForm()
                .fillProductName("Macbook Pro")
                .fillProductPrice("700000")
                .fillProductColor("Preto")
                .submitAddFormWithSuccess()
                .getToastMessage();

        Assertions.assertEquals("Produto adicionado com sucesso", toastMessage);
    }

    @AfterEach
    public void afterEach() {
        browser.quit();
    }
}
