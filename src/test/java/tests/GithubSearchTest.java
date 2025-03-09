package tests;

import common.CommonTest;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static com.codeborne.selenide.Selenide.open;

public class GithubSearchTest extends CommonTest {

    @Test
    void githubSearchTest() {
        open("https://github.com");
        Pages.githubSearchPage.searchFor("Selenide");
        Pages.githubSearchPage.hasRepo("selenide/selenide");
    }
}
