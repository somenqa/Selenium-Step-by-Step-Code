package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class OverViewPageController {
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement WomenButton;

    public OverViewPageController(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void OverViewPageInfo(WebDriver driver,String info){
    WebElement element=driver.findElement(By.xpath("//a[contains(text(),'"+info+"')]"));
    element.isDisplayed();
    }
    public void womenCatalog(WebDriver driver) throws InterruptedException{

    mouseHoover(driver,WomenButton);
    Thread.sleep(2000);

    }
        public void mouseHoover(WebDriver driver,WebElement element){
        Actions actions =new Actions(driver);
        actions.moveToElement(element).perform();

    }
}
