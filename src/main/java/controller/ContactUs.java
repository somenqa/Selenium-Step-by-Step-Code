package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
@FindBy(xpath = "//*[@id='contact-link']/a")
    WebElement contactus;
@FindBy(xpath = "//*[@id='email']")
    WebElement inputEmail;
@FindBy(xpath = "//*[@id='id_order']")
    WebElement inputReference;
@FindBy (xpath = "//*[@id='submitMessage']/span")
    WebElement sendButton;
public ContactUs(WebDriver driver){
    PageFactory.initElements(driver,this);
}
public void contactUsButton(){
 contactus.click();
 inputEmail.sendKeys("somen.dasqa@gmail");
 inputReference.sendKeys("1234567");
 sendButton.click();
}
}
