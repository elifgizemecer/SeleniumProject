package com.testinium.test;
import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;
public class AddToFavoritesTest extends BaseTest {
    @Test
    public void getAddToFavoritesTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage=new ProductPage();
        productPage.productSearchAndScrollTest();
        productPage.addToFavoritesTest();
    }


/*
    @Test
    public void getAttributeTest(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }
    @Test
    public void getTextTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.textControlTest();
    }
    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();
        productPage.valueControlTest();
    }
    */

}
