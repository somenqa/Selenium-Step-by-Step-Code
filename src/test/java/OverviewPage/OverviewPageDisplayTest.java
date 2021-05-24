package OverviewPage;

import Base.ScriptBase;
import controller.OverViewPageController;
import org.testng.annotations.Test;

public class OverviewPageDisplayTest extends ScriptBase {
    OverViewPageController overViewPageController;

    @Test
    public void verifySpecialsTextDisplayedInOverviewPage() {
        overViewPageController= new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "Specials");
    }
    @Test
    public void VerifyNewProductTextDisplayedInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "New products");
    }
    @Test
    public void VerifyBestSellersTextDisplayedInOverViewPage(){
    overViewPageController=new OverViewPageController(driver);
    overViewPageController.OverViewPageInfo(driver, "Best sellers");
    }
    @Test
    public void VerifyMyPersonalInfoTextDisplayedInOverViewPage(){
    overViewPageController=new OverViewPageController(driver);
    overViewPageController.OverViewPageInfo(driver, "My personal info");
    }
    @Test
    public void VerifyOurStoresTextDisplayedInOverViewPage(){
        overViewPageController=new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "Our stores");
    }
    @Test
    public void VerifyContactusTextDisplayedInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "Contact us");
    }
    @Test
    public void VerifyTermsAndConditionOfUseTextDisplayedInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "Terms and conditions of use");
    }
    @Test
    public void VerifyAboutUsTextDisplayedInOverViewPage(){
        overViewPageController=new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "About us");
    }
    @Test
    public void VerifySitemapTextDisplayedInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "Sitemap");
    }
    @Test
    public void VerifyMyAddressTextInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "My addresses");
    }
    @Test
    public void VerifyMyOrdersTestDisplayedInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "My orders");
    }
    @Test
    public void VerifyMyCreditSlipsTextDisplayedInOverViewPage() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "My credit slips");
    }
    @Test
    public void VerifyWomenTextDisplayedInOverViewPage() {
        overViewPageController= new OverViewPageController(driver);
        overViewPageController.OverViewPageInfo(driver, "Women");
    }
}
