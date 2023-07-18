package com.softwaretestingboard.magenato.pages.men;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magenato.customlisteners.CustomListeners;
import com.softwaretestingboard.magenato.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenCategoryPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement size32WebElement;

    @FindBy(xpath = "(//div[@id='option-label-color-93-item-49'])[1]")
    WebElement colourWebElement;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCartBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']")
    WebElement message;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartWebElement;
    @CacheLookup
    @FindBy(xpath = "//a[@class='product-item-link'][normalize-space()='Cronus Yoga Pant']")
    WebElement yogaPantWebElement;


    public void mouseHoverOnProductNameAndSelectColour() {
        mouseHoverToElement(yogaPantWebElement);
        clickOnElement(colourWebElement);
        CustomListeners.test.log(Status.PASS,"select colour");
    }

    public String getNotificationForAddedProduct() {
        String productAdd =getTextFromElement(message);
        CustomListeners.test.log(Status.PASS,"Product added notification");
        return productAdd;

    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartWebElement);
        CustomListeners.test.log(Status.PASS,"Click on shopping cart link");
    }

    public void mouseHoverOnProductNameAndSelectSize() {
        mouseHoverToElement(yogaPantWebElement);
        clickOnElement(size32WebElement);
        CustomListeners.test.log(Status.PASS,"select size 32");
    }

    public void mouseHoverOnProductNameAndClickOnAddToCartButton() {
        mouseHoverToElement(yogaPantWebElement);
        clickOnElement(addToCartBtn);
        CustomListeners.test.log(Status.PASS,"Click on add cart button");
    }

}
