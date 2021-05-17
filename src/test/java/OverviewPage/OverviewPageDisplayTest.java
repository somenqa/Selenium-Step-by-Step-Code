package OverviewPage;

import Base.ScriptBase;
import controller.OverViewPageController;
import org.testng.annotations.Test;

public class OverviewPageDisplayTest extends ScriptBase {
    OverViewPageController OverviewPageController;

    @Test
    public void verifySpecialTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "Specials");
    }
    @Test
    public void VerifyNewProductsTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "New Products");
    }
    @Test
    public void VerifyBestSellersTextDisplayedInOverViewPage(){
    OverviewPageController=new OverViewPageController(driver);
    OverviewPageController.OverViewPageInfo(driver, "Best Sellers");
    }
    @Test
    public void verifyMyPersonalInfoTextDisplayedInOverViewPage(){
    OverviewPageController=new OverViewPageController(driver);
    OverviewPageController.OverViewPageInfo(driver, "My Personal Info");
    }
    @Test
    public void verifyOurStoresTextDisplayedInOverViewPage(){
        OverviewPageController=new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "Our Stores");
    }
    @Test
    public void verifyContactUsTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "Contact Us");
    }
    @Test
    public void verifyTermsAndConditionsOfUseTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "Terms And Condition Of Use");
    }
    @Test
    public void verifyAboutUsTextDisplayedInOverViewPage(){
        OverviewPageController=new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "About Us");
    }
    @Test
    public void verifySiteMapTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "SiteMap");
    }
    @Test
    public void verifyMyAddressTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "My Address");
    }
    @Test
    public void verifyMyOrdersTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "My Orders");
    }
    @Test
    public void verifyMyCreditSlipsTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "My Credit Slips");
    }
    @Test
    public void verifyMyWomenTextDisplayedInOverViewPage() {
        OverviewPageController = new OverViewPageController(driver);
        OverviewPageController.OverViewPageInfo(driver, "Women");
    }
}
