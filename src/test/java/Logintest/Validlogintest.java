package Logintest;

import allbrowserSetup.FirstCodeSetup;
import controller.LoginControler;
import org.junit.Test;

public class Validlogintest extends FirstCodeSetup{
LoginControler logincontroller;
@org.testng.annotations.Test

public void verifyLogInInputProperty(){
logincontroller=new LoginControler(driver);
logincontroller.LogInValidation();
}
}
