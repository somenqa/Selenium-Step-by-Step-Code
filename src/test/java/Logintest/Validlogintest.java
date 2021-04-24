package Logintest;

import allbrowserSetup.FirstCodeSetup;
import controller.LoginController;

public class Validlogintest extends FirstCodeSetup{
LoginController logincontroller;
@org.testng.annotations.Test

public void verifyLogInInputProperty(){
logincontroller=new LoginController(driver);
logincontroller.LogInValidation();
}
}
