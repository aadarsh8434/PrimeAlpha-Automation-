# Project Overview

## PrimeAlpha-Automation

This project automates the testing of various functionalities of the customer module on a web application. The automation script, written using Java with Selenium WebDriver, JUnit, and ChromeDriver, tests the login process, navigation through different sections, and interaction with various elements on the page.

### Key Features

- **Automated Login and Verification**: The script automates the login process, including entering credentials, OTP verification, and navigating to the dashboard.
- **Section Navigation**: The script covers navigation through multiple sections such as AUM Flow, Product Overview, Disclaimer, Dataroom, Investment Preference, Insights & News, Products, Investors, Resources, Saved List, and more.
- **Element Interaction**: It performs various actions such as clicking buttons, editing fields, generating and sharing links, and sending messages.
- **Page Scrolling**: Uses JavaScriptExecutor to scroll through the webpage, ensuring elements are in view for interaction.
- **Comprehensive Coverage**: Ensures that all major functionalities of the customer module are tested for proper behavior and user experience.

### Dependencies

- **Selenium WebDriver**: For browser automation.
- **JUnit**: For structuring and running the tests.
- **ChromeDriver**: For controlling the Chrome browser.
- **Java**: Programming language used for writing the script.

### Setup Instructions

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/yourusername/customer-module-functionality.git
    cd customer-module-functionality
    ```

2. **Install Dependencies**:
    - Ensure you have Java, Selenium WebDriver, and ChromeDriver installed on your machine.

3. **Configure the WebDriver**:
    - Download ChromeDriver from [here](https://sites.google.com/a/chromium.org/chromedriver/) and place it in a directory included in your system's PATH.

4. **Run the Tests**:
    - Use your preferred Java IDE or a command line tool to run the JUnit test.

### Running the Test

The test script is located in the `src/test/java/com/example/tests/CustomerModuleFunctionality.java` file. To run the test, simply execute the JUnit test within your Java IDE or run the following command in your terminal:

```bash
mvn test
```

### Detailed Description

The `CustomerModuleFunctionality` class contains the setup, test, and teardown methods for the test suite.

- **`setUp` Method**: Initializes the WebDriver, sets the base URL, and defines implicit wait times.
- **`testLogincustomer` Method**: 
  - Logs into the application.
  - Navigates through various sections of the application.
  - Interacts with multiple elements, including buttons, text fields, and dropdowns.
  - Performs actions such as scrolling, clicking, editing, generating links, and sending messages.
- **`tearDown` Method**: Quits the WebDriver session and checks for any verification errors.

### Contribution Guidelines

- **Fork the Repository**: Create your own fork of the repository.
- **Create a Branch**: Create a new branch for your feature or bugfix.
- **Submit a Pull Request**: Once your changes are ready, submit a pull request for review.


### Contact

For any issues or suggestions, feel free to open an issue or submit a pull request. You can also reach out to the project maintainer at `aadarshranjan8434@example.com`.

---

This README provides a comprehensive overview of the project, setup instructions, and details on how to run and contribute to the project.
![primeautomation](https://github.com/user-attachments/assets/dcfbde1a-6603-4f15-b1d6-dbc7936c1f9c)
