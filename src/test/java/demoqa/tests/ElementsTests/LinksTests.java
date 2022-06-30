package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LinksTests extends BasePageTest {
    @Test
    public void test1() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/links");
        Thread.sleep(500);

        links.linksListClick(1);
        links.switchToTab(1);
        Assert.assertEquals(links.currentUrl(), "https://demoqa.com/");

        links.switchToTab(0);
        Assert.assertEquals(links.currentUrl(), "https://demoqa.com/links");
        Assert.assertEquals(links.getHeaderText(), "Links");

    }

}
