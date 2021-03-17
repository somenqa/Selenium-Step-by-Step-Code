package LocatorFinder;

import allbrowserSetup.FirstCodeSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLoginTest extends FirstCodeSetup{

    @Test


    public void automation() {
        chromebrowser();

driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
    }
}
