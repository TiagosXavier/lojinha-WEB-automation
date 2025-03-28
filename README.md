# Selenium Test Automation for Login and Product Management

## 📌 Overview
This project contains automated tests using [Selenium WebDriver](https://www.selenium.dev/) to validate the login and product management functionalities of a web application. The `LoginPage`, `AddProductPageForm`, `ProductsListPage`, and `EditProductFormPage` classes implement the Page Object Model (POM) pattern to interact with web elements efficiently.

## 🚀 Technologies Used
- [Selenium WebDriver](https://www.selenium.dev/) - Web automation framework
- [Java](https://www.java.com/) - Programming language
- [TestNG](https://testng.org/) or [JUnit](https://junit.org/) - Test framework (if applicable)
- [Maven](https://maven.apache.org/) or [Gradle](https://gradle.org/) - Dependency management

## 📂 Project Structure
```
📂 project
│--📂 src/main/java/pages    # Page Object classes
│--📂 src/test/java/tests    # Test cases
│-- pom.xml (or build.gradle)  # Dependency management
```

## 🔧 Setup and Installation
### Prerequisites
Ensure you have the following installed:
- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (Version 11 or later recommended)
- [Maven](https://maven.apache.org/) or [Gradle](https://gradle.org/)
- A supported web browser (e.g., Chrome, Firefox)
- WebDriver for the chosen browser (e.g., ChromeDriver, GeckoDriver)

### Installation Steps
1. Clone this repository:
   ```sh
   git clone https://github.com/your-user/your-repository.git
   cd your-repository
   ```
2. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```
   Or using Gradle:
   ```sh
   gradle build
   ```

## 🧪 Running Tests
To execute tests with Maven:
```sh
mvn test
```

To execute tests with Gradle:
```sh
gradle test
```

## 📜 Page Object Methods
### `LoginPage`
- `fillUser(String user)`: Enters the username in the login form.
- `fillPassword(String password)`: Enters the password in the login form.
- `submitLoginForm()`: Clicks the login button and redirects to the products page.

### `AddProductPageForm`
- `fillProductName(String productName)`: Fills in the product name field.
- `fillProductPrice(String productPrice)`: Fills in the product price field.
- `fillProductColor(String productColor)`: Fills in the product color field.
- `submitAddFormWithError()`: Submits the form and expects an error.
- `submitAddFormWithSuccess()`: Submits the form successfully and navigates to the edit product page.

### `ProductsListPage`
- `accessNewProductForm()`: Clicks the button to access the new product form.
- `getToastMessage()`: Retrieves the text from the toast notification.

### `EditProductFormPage`
- `getToastMessage()`: Retrieves the text from the toast notification.

## 📋 Contribution
Feel free to contribute with improvements and new tests!

1. Fork the project
2. Create a branch for your feature (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the repository (`git push origin feature/new-feature`)
5. Open a Pull Request

## 📄 License
This project is licensed under the MIT License. Feel free to use and improve it!

---
🔹 _Developed with Selenium WebDriver to ensure quality in authentication and product management._

