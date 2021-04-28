package Logintest;

import Base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.Test;

public class Validlogintest extends ScriptBase {
LoginController logincontroller;

@Test
public void verifyLogInInputProperly(){
logincontroller=new LoginController(driver);
logincontroller.LogInValidation();
}
}
