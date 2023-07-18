package com.softwaretestingboard.magenato.pages.homepage;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magenato.customlisteners.CustomListeners;
import com.softwaretestingboard.magenato.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[contains(text(),'Gear')]")
    WebElement gearTab;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bagsWebElement;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[contains(text(),'Men')]")
    WebElement menTab;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomWebElement;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']")
    WebElement pantsWebElement;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenTab;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement topWebElement;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketWebElement;


    public void navigateToBagsSection() {
        mouseHoverToElement(gearTab);
        //waitUntilVisibilityOfElementLocated(bagsWebElement, 60);
        mouseHoverToElementAndClick(bagsWebElement);
        CustomListeners.test.log(Status.PASS,"Click on bag element");
    }

    public void navigateToPantsSection() {
        mouseHoverToElement(menTab);
        waitUntilVisibilityOfElementLocated(bottomWebElement, 60);
        mouseHoverToElement(bottomWebElement);
        waitUntilVisibilityOfElementLocated(pantsWebElement, 60);
        mouseHoverToElementAndClick(pantsWebElement);
        CustomListeners.test.log(Status.PASS,"Click on pants element");
    }

    public void navigateToJacketSection() {
        mouseHoverToElement(womenTab);
        waitUntilVisibilityOfElementLocated(topWebElement, 60);
        mouseHoverToElement(topWebElement);
        waitUntilVisibilityOfElementLocated(jacketWebElement, 60);
        mouseHoverToElementAndClick(jacketWebElement);
        CustomListeners.test.log(Status.PASS,"Click on jacket element");
    }
}


