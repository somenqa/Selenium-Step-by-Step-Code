package ContactUsTest;

import Base.ScriptBase;
import controller.ContactUs;
import org.testng.annotations.Test;

public class ContactUsClass extends ScriptBase {
ContactUs contactUs;
@Test
public void verifyContactUs(){
contactUs= new ContactUs(driver);
contactUs.contactUsButton();
}
}
