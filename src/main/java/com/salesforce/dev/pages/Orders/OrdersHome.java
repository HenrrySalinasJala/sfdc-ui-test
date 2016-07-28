package com.salesforce.dev.pages.Orders;

import com.salesforce.dev.framework.CommonOperation;
import com.salesforce.dev.pages.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by marcelo on 6/22/2015.
 */
public class OrdersHome extends AbstractBasePage {

    @FindBy(xpath = "//h1[contains(.,'Orders:')]")
    WebElement ordersSection;

    public boolean IsUserInOrdersTab() {
        return CommonOperation.isWebElementVisible(ordersSection);
    }

}
