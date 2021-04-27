package Logintest;

import allbrowserSetup.FirstCodeSetup;
import controller.LoginController;
import org.testng.annotations.Test;

public class Validlogintest extends FirstCodeSetup{
LoginController logincontroller;

@Test
public void verifyLogInInputProperty(){
logincontroller=new LoginController(driver);
logincontroller.LogInValidation();
}
}
