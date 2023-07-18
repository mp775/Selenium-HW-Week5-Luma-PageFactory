package com.softwaretestingboard.magenato.pages.gear;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magenato.customlisteners.CustomListeners;
import com.softwaretestingboard.magenato.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearCategoryPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffleWebElement;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement productNameWebElement;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityBoxWebElement;
    @CacheLookup
    @FindBy(css = "button[id='product-addtocart-button'] span")
    WebElement addToCartBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement productAddedNotificationWebElement;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productNameInShoppingCartWebElement;
    @CacheLookup
    @FindBy(xpath = "//td[@data-th='Qty']/div/div/label/input")
    WebElement productQuantityInShoppingCartWebElement;
    @CacheLookup
    @FindBy(xpath = "//td[@data-th='Subtotal']")
    WebElement productPriceInShoppingCartWebElement;
    @CacheLookup
    @FindBy(xpath = "//td[@data-th='Qty']/div/div/label/input")
    WebElement quantityBoxInCartWebElement;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement updateShoppingCartBtn;
    @CacheLookup
    @FindBy(xpath = "//td[@data-th='Subtotal']")
    WebElement updatedPriceWebElement;

    public void clickOnSpecificProduct() {
        clickOnElement(productOvernightDuffleWebElement);
        CustomListeners.test.log(Status.PASS,"Click on specific product");
    }

    public String verifyProductText() {
        return getTextFromElement(productNameWebElement);
    }

    public void changeProductQuantity() {
        clearTextFromField(quantityBoxWebElement);
        sendTextToElement(quantityBoxWebElement, "3");

    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartBtn);
        CustomListeners.test.log(Status.PASS,"Click on add to cart button");
    }

    public String verifyProductAddedToShoppingCartNotificationText() {
        String ProductAdded =getTextFromElement(productAddedNotificationWebElement);
        CustomListeners.test.log(Status.PASS,"Product is added in shopping list");
        return ProductAdded;
    }

    public void clickOnShoppingCartLink() {

        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS,"Click on shopping cart link");
    }

    public String verifyProductNameInShoppingCart() {
        return getTextFromElement(productNameInShoppingCartWebElement);
    }

    public String verifyProductQuantityInShoppingCart() {
        String attributeText = getAttributeValueOfElement(productQuantityInShoppingCartWebElement,"value");
        CustomListeners.test.log(Status.PASS,"verify product Quantity in shopping cart");
        return attributeText;
    }

    public String verifyProductPriceInShoppingCart() {
        String productPrice = getTextFromElement(productPriceInShoppingCartWebElement);
        CustomListeners.test.log(Status.PASS,"Product price is correct");
        return productPrice;
    }

    public void changeProductQuantityInShoppingCart() {
        clearTextFromField(quantityBoxInCartWebElement);
        sendTextToElement(quantityBoxInCartWebElement, "5");
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateShoppingCartBtn);
        CustomListeners.test.log(Status.PASS,"Click on update shopping cart button");
    }

    public String verifyUpdatedPriceInShoppingCart() {
        String updatedPrice =getTextFromElement(updatedPriceWebElement);
        CustomListeners.test.log(Status.PASS,"Updated price");
        return  updatedPrice;
    }

}


