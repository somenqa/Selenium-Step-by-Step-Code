package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPageController {
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;
    public OverViewPageController(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void OverViewPageInfo(WebDriver driver,String info){
    WebElement element=driver.findElement(By.xpath("//a[contains(text(),'"+info+"')]"));
    element.isDisplayed();
    }

}
