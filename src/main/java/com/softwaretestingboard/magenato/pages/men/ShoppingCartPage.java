package com.softwaretestingboard.magenato.pages.men;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magenato.customlisteners.CustomListeners;
import com.softwaretestingboard.magenato.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement soppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantNameText;
    @CacheLookup
    @FindBy(xpath = "//dl[@class='item-options']")
    WebElement productDetailWebEle;

    public String getShoppingCartTextFromWebEle() {
        String shoppingCartText = getTextFromElement(soppingCartText);
        CustomListeners.test.log(Status.PASS,"Shopping cart text is displayed");
        return shoppingCartText;
    }

    public String getProductName() {
        String productName = getTextFromElement(pantNameText);
        CustomListeners.test.log(Status.PASS,"Visible product Name");
        return productName;
    }

    public String getProductDetails(){
        String productDetail = getTextFromElement(productDetailWebEle);
        CustomListeners.test.log(Status.PASS,"Visible product Detail");
        return getTextFromElement(productDetailWebEle);
    }


}


