package tests;

import common.CommonTest;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest extends CommonTest {

    @Test
    void googleSearchTest() {
        open("https://www.google.com");
        Pages.googleSearchPage.searchFor("Selenide");
        Pages.googleSearchPage.hasSearchResult("selenide.org");
    }
}
