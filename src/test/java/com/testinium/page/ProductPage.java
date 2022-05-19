package com.testinium.page;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
public class ProductPage {
    Methods methods;
    public ProductPage() {
        methods = new Methods();
    }
    public void productSearchAndScrollTest() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.waitBySecond(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySecond(2);
        methods.scrollDown();
        methods.waitBySecond(2);
    }
    public void addToFavoritesTest() {
        methods.click(By.xpath("//*[@id='product-470338']/div[2]/div[3]/a[4]/i"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='product-494781']/div[2]/div[3]/a[4]/i"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='product-494424']/div[2]/div[3]/a[4]/i"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='product-493615']/div[2]/div[3]/a[4]/i"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//div[@class='logo-text']"));
        methods.waitBySecond(2);
    }
    public void dropDownListTurkClassicsTest() {
        methods.click(By.xpath("//*[@class='lvl1catalog']"));
        methods.waitBySecond(3);
        methods.scrollDown2();
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='content']/div/div/div[1]/div/div[1]"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='content']/div/div/div[1]/div/div[1]/select/option[6]"));
        methods.waitBySecond(2);
    }
    public void selectRandomAddToChartTest() {
        methods.click(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySecond(2);
        methods.click(By.cssSelector("#product-593530")); // :(
        methods.waitBySecond(2);
        methods.scrollDown2();
        methods.waitBySecond(2);
        methods.click(By.cssSelector("#button-cart"));
        methods.waitBySecond(2);
    }
    public void deleteFromFavoritesTest() {
        methods.click(By.cssSelector("#menu.top.my-list"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySecond(2);
        methods.click(By.cssSelector("#product-494424"));
        methods.waitBySecond(2);
        methods.click(By.cssSelector("#sprite__product icon__favourite-active icon--dimension-addlist"));
        methods.waitBySecond(2);
    }
    public void purchaseTest() {
        methods.click(By.cssSelector("#sprite-cart-icon"));
        methods.waitBySecond(2);
        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySecond(2);
        methods.click(By.id("select-all-cart"));
        methods.waitBySecond(2);

        methods.click(By.xpath("//*[@id='cart_module']/div[4]/div[1]/a"));
        methods.waitBySecond(2);

        methods.click(By.xpath("//*[@id='shipping-tabs']/a[2]"));
        methods.waitBySecond(2);

        methods.sendKeys(By.id("address-firstname-companyname"), "Elif Gizem");
        methods.sendKeys(By.id("address-lastname-title"), "Ecer");
        methods.selectByText(By.cssSelector("select#address-zone-id"), "İzmir");
        methods.waitBySecond(2);

        methods.sendKeys(By.id("district"), "Ataşehir");
        methods.sendKeys(By.id("address-address-text"), "Bişey sokak. Şibi apartmanı");
        methods.sendKeys(By.id("address-postcode"), "35500");
        methods.sendKeys(By.id("address-mobile-telephone"), "5061234567");
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(2);
        methods.click(By.id("button-checkout-continue"));
        methods.sendKeys(By.id("credit-card-owner"), "elzemifg");
        methods.sendKeys(By.id("credit_card_number_1"), "123456781234");
        methods.selectByText(By.cssSelector("select#credit-card-expire-date-month"), "01");
        methods.selectByText(By.cssSelector("select#credit-card-expire-date-year"), "2027");
        methods.sendKeys(By.id("credit-card-security-code"), "123");
        methods.click(By.id("button-checkout-continue"));
    }
    public void logOutTest(){
        methods.click(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
    }
}
