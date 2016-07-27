package com.salesforce.dev.pages.Campaigns;

import java.util.concurrent.TimeUnit;

import com.salesforce.dev.framework.DriverManager;
import com.salesforce.dev.pages.Base.ViewDetailBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by veronica on 8/21/2015.
 */
public class CampaignViewDetail extends ViewDetailBase {
    public CampaignViewDetail(WebDriver driver) {
        try {
            WAIT.withTimeout(DriverManager.getInstance().getTimeoutNormal(), TimeUnit.SECONDS)
                    .until(ExpectedConditions.visibilityOf(viewSelected));
        } catch (WebDriverException e) {
            throw new WebDriverException(e);
        } finally {
            WAIT.withTimeout(DriverManager.getInstance().getTimeoutNormal(), TimeUnit.SECONDS);
        }
    }
    @Override
    protected CampaignView clickEditLnk() {
        clickEditLink();
        return new CampaignView();
    }

    @Override
    public CampaignViewDetail clickDeleteLnk(boolean confirmDeletion) {
        clickDeleteLink(confirmDeletion);
        return this;
    }


}
