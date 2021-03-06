package com.salesforce.dev.pages.accounts;


import java.util.List;

import com.salesforce.dev.framework.dto.FieldToDisplayView;
import com.salesforce.dev.framework.dto.FilterView;
import com.salesforce.dev.framework.selenium.CommonOperation;
import com.salesforce.dev.pages.base.ViewBase;


/**
 * This class will be used to represent Account view.
 *
 * @author Carlos Orellana.
 * @since 9/2/2015.
 */
public class AccountView extends ViewBase {

    public AccountView() {
        CommonOperation.waitForWebElement(saveBtn);
    }

    @Override
    public Object clickCancelBtn() {
        return null;
    }

    @Override
    public AccountView setViewName(String viewName) {
        setViewNameFld(viewName);
        return this;
    }

    @Override
    public AccountView setUniqueViewName(String uniqueViewName) {
        setUniqueViewNameFld(uniqueViewName);
        return this;
    }

    @Override
    protected AccountView checkFilterByOwnerAll() {
        checkFilterOwnerAll();
        return this;
    }

    @Override
    protected AccountView checkFilterByOwnerMy() {
        checkFilterOwnerMy();
        return this;
    }

    @Override
    public AccountView checkFilterByOwner(String filter) {
        if (filter.compareToIgnoreCase("All Accounts") == 0) {
            checkFilterOwnerAll();
        } else {
            checkFilterOwnerMy();
        }
        return this;
    }

    @Override
    public AccountView addAdditionalFiltersByField(int numberField, String field, String operator, String value) {
        addAdditionalFilterByField(numberField, field, operator, value);
        return this;
    }

    @Override
    public AccountView addNewFieldToDisplay(String newField) {
        addNewFldToDisplay(newField);
        return this;
    }

    @Override
    public AccountView selectRestrictVisibility(String optionVisibility) {
        selectRestrictVisibilityRadio(optionVisibility);
        return this;
    }

    @Override
    public AccountViewDetail clickSaveBtn() {
        clickSaveButton();
        return new AccountViewDetail();
    }

    public void addFilter(List<FilterView> additionalField) {
        int count = 1;
        for (FilterView addFilter : additionalField) {
            addAdditionalFiltersByField(count, addFilter.getFieldFilter(),
                    addFilter.getOperatorFilter(), addFilter.getValueFilter());
            count++;
        }
    }

    public void addAccountView(List<FieldToDisplayView> fieldToDisplayViews) {
        for (FieldToDisplayView fields : fieldToDisplayViews) {
            addNewFieldToDisplay(fields.getFieldToDisplay());
        }
    }
}
