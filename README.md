# JUnit, Selenide, Maven

This project is a set of automated tests for web applications, utilizing JUnit for testing with Selenide and the Page Object Model. The project is configured with Maven to manage dependencies and build the project.

### Tech Stack:

- **JUnit** — for writing and executing tests.
- **Maven** — for dependency management and project build.
- **Selenide** — for interacting with web pages.
- **Page Object Model** — for organizing tests.

## What is JUnit?

**JUnit** is a framework for writing and running tests.

### Key Features of JUnit:
- Support for annotations like `@Test`, `@BeforeEach`, `@AfterEach`, and others to manage test lifecycle.
- Easy integration with CI/CD systems.
- Support for assertions to validate the correctness of the tests.

### Example of Using JUnit:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }
}s
