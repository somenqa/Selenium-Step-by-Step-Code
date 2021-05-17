package LogInTest;

import Base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.Test;

public class ValidLogInTest extends ScriptBase {
LoginController logincontroller;

@Test
public void verifyLogInInputProperly(){
logincontroller=new LoginController(driver);
logincontroller.LogInValidation();
}
}
