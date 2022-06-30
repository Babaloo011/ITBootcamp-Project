package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {
    public WebDriver driver;
    public WebDriverWait wait;

     By doubleClickButton = By.id("doubleClickBtn");
     By righClickButton = By.id("rightClickBtn");
     By clickButton = By.id("q02sZ");

     public By doubleClickMessage = By.id("doubleClickMessage");
     public By rightClickmessage = By.id("rightClickMessage");
     public By clickButtonMessage = By.id("ONBXi");

    public Buttons(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getDoubelClickButton(){
        return driver.findElement(doubleClickButton);
    }
    public WebElement getRightClickButton(){
        return driver.findElement(righClickButton);
    }
    public WebElement getClickButton(){
        return driver.findElement(clickButton);
    }

    public void doDoubleClick(){
        Actions action = new Actions(driver);
        action.doubleClick(getDoubelClickButton()).build().perform();
    }
    public void doRightClick(){
        Actions action = new Actions(driver);
        action.contextClick(getRightClickButton()).build().perform();
    }
    public void doClick(){
        Actions action = new Actions(driver);
        action.click(getClickButton()).build().perform();
    }
}
