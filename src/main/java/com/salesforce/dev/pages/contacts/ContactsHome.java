package com.salesforce.dev.pages.contacts;

import com.salesforce.dev.framework.selenium.CommonOperation;
import com.salesforce.dev.pages.base.AbstractBasePage;
import com.salesforce.dev.pages.base.HomeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * This class will be used to represent Contacts home page and its options.
 *
 * @author Marcelo Vargas
 * @since 11/06/2015.
 */
public class ContactsHome extends HomeBase {
    @FindBy(xpath = "//h1[contains(.,'Contacts:')]")
    private WebElement contactSection;

    /**
     * this method clicks on new btn.
     *
     * @return ContactForm
     */
    @Override
    public ContactForm clickNewBtn() {
        clickNewButton();
        return new ContactForm();
    }

    @Override
    public ContactView clickNewViewLnk() {
        clickNewViewLink();
        return new ContactView();

    }

    @Override
    protected AbstractBasePage selectRecentViewItem(String value) {
        return null;
    }

    @Override
    public ContactView clickEditViewLnk(String value) {
        editViewLnk(value);
        return new ContactView();
    }
    
    @Override
    public ContactDetail selectRecentItem(String opportunity) {
        super.clickRecentItem(opportunity);
        return new ContactDetail();
    }

    public boolean isUserInContactsTab() {
        return CommonOperation.isWebElementVisible(contactSection);
    }
}