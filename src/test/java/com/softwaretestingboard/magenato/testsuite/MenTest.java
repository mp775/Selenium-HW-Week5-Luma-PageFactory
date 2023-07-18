package com.softwaretestingboard.magenato.testsuite;

import com.softwaretestingboard.magenato.customlisteners.CustomListeners;
import com.softwaretestingboard.magenato.pages.homepage.HomePage;
import com.softwaretestingboard.magenato.pages.men.MenCategoryPage;
import com.softwaretestingboard.magenato.pages.men.ShoppingCartPage;
import com.softwaretestingboard.magenato.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    MenCategoryPage menCategoryPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt(){
       homePage = new HomePage();
       menCategoryPage = new MenCategoryPage();
       shoppingCartPage = new ShoppingCartPage();
    }

    @Test(groups = {"smoke"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.navigateToPantsSection();
        menCategoryPage.mouseHoverOnProductNameAndSelectSize();
        menCategoryPage.mouseHoverOnProductNameAndSelectColour();
        menCategoryPage.mouseHoverOnProductNameAndClickOnAddToCartButton();
        String expectedProductText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualProductText = menCategoryPage.getNotificationForAddedProduct();
        Assert.assertEquals(actualProductText, expectedProductText, "Message is not displayed for added product");
        menCategoryPage.clickOnShoppingCartLink();
        String expectedCartText = "Shopping Cart";
        String actualCartText = shoppingCartPage.getShoppingCartTextFromWebEle();
        Assert.assertEquals(actualCartText, expectedCartText, "Shopping cart Text is not displayed");
        String expectedProductName = "Cronus Yoga Pant";
        String actualProductName = shoppingCartPage.getProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name is not displayed");
        String expectedSize = "32";
        String expectedColour = "Black";
        String actualProductDetails = shoppingCartPage.getProductDetails();
        Assert.assertTrue(actualProductDetails.contains(expectedSize));
        Assert.assertTrue(actualProductDetails.contains(expectedColour));
    }
}

