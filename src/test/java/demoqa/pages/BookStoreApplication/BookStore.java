package demoqa.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStore {
    public final String url = "https://demoqa.com/books";
    public WebDriver driver;
    public WebDriverWait wait;

    public BookStore(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        By bookStoreApp = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
        By searchBox = By.id("searchBox");
        By selectRows = By.tagName("select");
        By pages = By.xpath("//*[@type=\"number\"]");
        By title = By.className("action-buttons");
        By backButton = By.id("addNewRecordButton");
        By next = By.xpath("//button[text()=\"Next\"]");
        By previous = By.xpath("//button[text()=\"Previous\"]");
        By loginButton = By.id("login");
    }
    public static final String[] bookStoreMenu = {"Login", "Book Store", "Profile", "Book Store API"};

}
