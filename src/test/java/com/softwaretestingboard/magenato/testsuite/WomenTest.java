package com.softwaretestingboard.magenato.testsuite;

import com.softwaretestingboard.magenato.customlisteners.CustomListeners;
import com.softwaretestingboard.magenato.pages.homepage.HomePage;
import com.softwaretestingboard.magenato.pages.women.WomenCategoryPage;
import com.softwaretestingboard.magenato.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
    WomenCategoryPage womenCategoryPage;
    HomePage homePage;

    List<String> productListBeforeFilter;
    List<String> productListAfterFilter;
    List<Double> priceListBeforeFilter;
    List<Double> priceListAfterFilter;

    @BeforeMethod(groups = {"sanity"," smoke","regression"})
    public void inIt(){
        womenCategoryPage = new WomenCategoryPage();
        homePage = new HomePage();
    }

    @Test(groups = {"regression"})
    public void verifyTheSortByProductNameFilter() {
        homePage.navigateToJacketSection();
        productListBeforeFilter = womenCategoryPage.getProductListBeforeFilter();
        womenCategoryPage.selectSortByFilterProductName();
        productListAfterFilter = womenCategoryPage.getProductListAfterFilter();
        Assert.assertEquals(productListAfterFilter, productListBeforeFilter, "Product is not displayed in alphabetical order");
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.navigateToJacketSection();
        priceListBeforeFilter = womenCategoryPage.getPriceListBeforeFilter();
        womenCategoryPage.selectSortByFilterPrice();
        priceListAfterFilter = womenCategoryPage.getPriceListAfterFilter();
        Assert.assertEquals(priceListAfterFilter, priceListBeforeFilter, "Product is not displayed in low to high price");
    }
}


